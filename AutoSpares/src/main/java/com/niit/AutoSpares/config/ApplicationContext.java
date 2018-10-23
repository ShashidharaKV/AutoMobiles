package com.niit.AutoSpares.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.AutoSpares.DaoImpl.AuthenticationDAOImpl;
import com.niit.AutoSpares.DaoImpl.BillingDAOImpl;
import com.niit.AutoSpares.DaoImpl.CartDAOImpl;
import com.niit.AutoSpares.DaoImpl.CartItemsDAOImpl;
import com.niit.AutoSpares.DaoImpl.CategoryDAOImpl;
import com.niit.AutoSpares.DaoImpl.OrderDAOImpl;
import com.niit.AutoSpares.DaoImpl.OrderItemsDAOImpl;
import com.niit.AutoSpares.DaoImpl.PayDAOImpl;
import com.niit.AutoSpares.DaoImpl.ProductDAOImpl;
import com.niit.AutoSpares.DaoImpl.ShippingDAOImpl;
import com.niit.AutoSpares.DaoImpl.SupplierDAOImpl;
import com.niit.AutoSpares.DaoImpl.UserDAOImpl;
import com.niit.AutoSpares.model.Authentication;
import com.niit.AutoSpares.model.Billing;
import com.niit.AutoSpares.model.Cart;
import com.niit.AutoSpares.model.CartItems;
import com.niit.AutoSpares.model.Category;
import com.niit.AutoSpares.model.Order;
import com.niit.AutoSpares.model.OrderItems;
import com.niit.AutoSpares.model.Pay;
import com.niit.AutoSpares.model.Product;
import com.niit.AutoSpares.model.Shipping;
import com.niit.AutoSpares.model.Supplier;
import com.niit.AutoSpares.model.User;

@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement
public class ApplicationContext 
{
	@Bean("dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test/Automobiles");
		dataSource.setUsername("Shashidhara");
		dataSource.setPassword("123456789");
		return dataSource;
}
	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.connection.pool_size", "10");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		return properties;
	}
	
	@Autowired
	@Bean("sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(Authentication.class);
		sessionBuilder.addAnnotatedClass(Billing.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
		sessionBuilder.addAnnotatedClass(CartItems.class);
		sessionBuilder.addAnnotatedClass(Order.class);
		sessionBuilder.addAnnotatedClass(OrderItems.class);
		sessionBuilder.addAnnotatedClass(Pay.class);
		sessionBuilder.addAnnotatedClass(Shipping.class);
		return sessionBuilder.buildSessionFactory();
	}
	
	@Autowired
	@Bean("transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}

	@Autowired
	@Bean("categoryDAO")
	public CategoryDAOImpl getCategoryDAO(SessionFactory sessionFactory) {
		return new CategoryDAOImpl(sessionFactory);
	}
	
		@Autowired
		@Bean("supplierDAO")
		public SupplierDAOImpl getSupplierDAO(SessionFactory sessionFactory) {
			return new SupplierDAOImpl(sessionFactory);
			}
			
			@Autowired
			@Bean("productDAO")
			public ProductDAOImpl getProductDAO(SessionFactory sessionFactory) {
				return new ProductDAOImpl(sessionFactory);
				}
			
			@Autowired
			@Bean("userDAO")
			public UserDAOImpl getUserDAO(SessionFactory sessionFactory) {
				return new UserDAOImpl(sessionFactory);
				}
			
			@Autowired
			@Bean("authenticationDAO")
			public AuthenticationDAOImpl getAuthenticationDAO(SessionFactory sessionFactory) {
				return new AuthenticationDAOImpl(sessionFactory);
				}
			
			@Autowired
			@Bean("billingDAO")
			public BillingDAOImpl getBillingDAO(SessionFactory sessionFactory) {
				return new BillingDAOImpl(sessionFactory);
				}
			
			@Autowired
			@Bean("cartDAO")
			public CartDAOImpl getCartDAO(SessionFactory sessionFactory) {
				return new CartDAOImpl(sessionFactory);
				}
			
			@Autowired
			@Bean("cartItemsDAO")
			public CartItemsDAOImpl getCartItemsDAO(SessionFactory sessionFactory) {
				return new CartItemsDAOImpl(sessionFactory);
				}
			@Autowired
			@Bean("orderDAO")
			public OrderDAOImpl getOrderDAO(SessionFactory sessionFactory) {
				return new OrderDAOImpl(sessionFactory);
				}
			
			@Autowired
			@Bean("orderItemsDAO")
			public OrderItemsDAOImpl getOrderItemsDAO(SessionFactory sessionFactory) {
				return new OrderItemsDAOImpl(sessionFactory);
				}
			
			@Autowired
			@Bean("payDAO")
			public PayDAOImpl getPayDAO(SessionFactory sessionFactory) {
				return new PayDAOImpl(sessionFactory);
				}
			
			@Autowired
			@Bean("shippingDAO")
			public ShippingDAOImpl gethippingDAO(SessionFactory sessionFactory) {
				return new ShippingDAOImpl(sessionFactory);
				}		
}


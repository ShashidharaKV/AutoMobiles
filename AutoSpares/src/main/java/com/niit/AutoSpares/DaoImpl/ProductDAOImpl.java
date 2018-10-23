package com.niit.AutoSpares.DaoImpl;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.AutoSpares.Dao.ProductDAO;
import com.niit.AutoSpares.model.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO
{
	 @Autowired
	 SessionFactory sessionFactory;
	 
	 public ProductDAOImpl(SessionFactory sessionFactory) 
	 {
	this.sessionFactory=sessionFactory;	 
	 }
	 
		public boolean saveorupdate(Product product) {
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			return true;
		}

		public boolean delete(Product product) {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		}

		public Product getProduct(String ID) {
			String query = "from Product where ProductID='"+ID+"'"; 
			Query w= sessionFactory.getCurrentSession().createQuery(query);
			List<Product>list=(List<Product>)w.list();
			if(list == null || list.isEmpty())
				return null;
			else
				return list.get(0);
		}
		
		public List<Product> productlist() {
			List<Product> product=(List<Product>)sessionFactory.getCurrentSession().createCriteria(Product.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return product;
		}

		
	}


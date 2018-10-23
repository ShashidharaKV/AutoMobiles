package com.niit.AutoSpares.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.AutoSpares.Dao.OrderDAO;
import com.niit.AutoSpares.model.Order;


@Repository("orderDAO")
@Transactional
public class OrderDAOImpl implements OrderDAO
{

	 @Autowired
	 SessionFactory sessionFactory;
	 
	 public OrderDAOImpl(SessionFactory sessionFactory) 
	 {
	this.sessionFactory=sessionFactory;	 
	 }
	 
		public boolean saveorupdate(Order order) {
			sessionFactory.getCurrentSession().saveOrUpdate(order);
			return true;
		}

		public boolean delete(Order order) {
			sessionFactory.getCurrentSession().delete(order);
			return true;
		}

		public Order getOrder(String Order_Id) {
			String query = "from Order where Order_Id='"+Order_Id+"'"; 
			Query w= sessionFactory.getCurrentSession().createQuery(query);
			List<Order>list=(List<Order>)w.list();
			if(list == null || list.isEmpty())
				return null;
			else
				return list.get(0);
		}
		
		public List<Order> orderlist() {
			List<Order> order=(List<Order>)sessionFactory.getCurrentSession().createCriteria(Order.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return order;
		}

		
	}



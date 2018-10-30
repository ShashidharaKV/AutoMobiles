package com.niit.AutoSpares.DaoImpl;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.AutoSpares.Dao.OrderItemsDAO;
import com.niit.AutoSpares.model.OrderItems;


@Repository("orderItemsDAO")
@Transactional

public class OrderItemsDAOImpl implements OrderItemsDAO
{

	 @Autowired
	 SessionFactory sessionFactory;
	 
	 public OrderItemsDAOImpl(SessionFactory sessionFactory) 
	 {
	this.sessionFactory=sessionFactory;	 
	 }
	 
		public boolean saveorupdate(OrderItems orderitems) {
			sessionFactory.getCurrentSession().saveOrUpdate(orderitems);
			return true;
		}

		public boolean delete(OrderItems orderitems) {
			sessionFactory.getCurrentSession().delete(orderitems);
			return true;
		}

		public OrderItems getOrderItems(String Orderitem_Id) {
			String query = "from OrderItems where Orderitem_Id='"+Orderitem_Id+"'"; 
			Query w= sessionFactory.getCurrentSession().createQuery(query);
			List<OrderItems>list=(List<OrderItems>)w.list();
			if(list == null || list.isEmpty())
				return null;
			else
				return list.get(0);
		}
		
		public List<OrderItems> orderItemslist() {
			List<OrderItems> orderitems=(List<OrderItems>)sessionFactory.getCurrentSession().createCriteria(OrderItems.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return orderitems;
		}

		
		
	}


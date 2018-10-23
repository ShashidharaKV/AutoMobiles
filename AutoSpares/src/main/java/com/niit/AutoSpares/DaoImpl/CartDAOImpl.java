package com.niit.AutoSpares.DaoImpl;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.AutoSpares.Dao.CartDAO;
import com.niit.AutoSpares.model.Cart;

@Repository("cartDAO")
@Transactional

public class CartDAOImpl implements CartDAO
{
	 @Autowired
	 SessionFactory sessionFactory;
	 
	 public CartDAOImpl (SessionFactory sessionFactory) 
	 {
	this.sessionFactory=sessionFactory;	 
	 }
	 
		public boolean saveorupdate(Cart cart) {
			sessionFactory.getCurrentSession().saveOrUpdate(cart);
			return true;
		}

		public boolean delete(Cart cart) {
			sessionFactory.getCurrentSession().delete(cart);
			return true;
		}

		public Cart getCart(String Cart_Id) {
			String query = "from Cart where Cart_Id='"+ Cart_Id+"'"; 
			Query w= sessionFactory.getCurrentSession().createQuery(query);
			List<Cart>list=(List<Cart>)w.list();
			if(list == null || list.isEmpty())
				return null;
			else
				return list.get(0);
		}

		public List<Cart> cartlist() {
			List<Cart> cart=(List<Cart>)sessionFactory.getCurrentSession().createCriteria(Cart.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return cart;
		}
	}


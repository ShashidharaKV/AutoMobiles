package com.niit.AutoSpares.DaoImpl;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.AutoSpares.Dao.CartItemsDAO;
import com.niit.AutoSpares.model.CartItems;


@Repository("cartItemsDAO")
@Transactional
public class CartItemsDAOImpl implements CartItemsDAO
{

	 @Autowired
	 SessionFactory sessionFactory;
	 
	 public CartItemsDAOImpl (SessionFactory sessionFactory) 
	 {
	this.sessionFactory=sessionFactory;	 
	 }
	 
		public boolean saveorupdate(CartItems cartItems) {
			sessionFactory.getCurrentSession().saveOrUpdate(cartItems);
			return true;
		}

		public boolean delete(CartItems cartItems) {
			sessionFactory.getCurrentSession().delete(cartItems);
			return true;
		}

		public CartItems getCartItems(String Cartitems_Id) {
			String query = "from CartItems where Cartitem_Id='"+ Cartitems_Id+"'"; 
			Query w= sessionFactory.getCurrentSession().createQuery(query);
			List<CartItems>list=(List<CartItems>)w.list();
			if(list == null || list.isEmpty())
				return null;
			else
				return list.get(0);
		}

		public List<CartItems> cartitemslist() {
			List<CartItems> cartItems=(List<CartItems>)sessionFactory.getCurrentSession().createCriteria(CartItems.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return cartItems;
		}

		public List<CartItems> getlist(String cart_Id) {
			String query = "from CartItems where Cart_Id='"+ cart_Id+"'"; 
			Query w= sessionFactory.getCurrentSession().createQuery(query);
			List<CartItems>list=(List<CartItems>)w.list();
			if(list == null || list.isEmpty())
				return null;
			else
				return list;

		}
		
	}

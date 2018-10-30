package com.niit.AutoSpares.DaoImpl;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.AutoSpares.Dao.ShippingDAO;
import com.niit.AutoSpares.model.Shipping;

@Repository("shippingDAO")
@Transactional
public class ShippingDAOImpl implements ShippingDAO
{

	 @Autowired
	 SessionFactory sessionFactory;
	 
	 public ShippingDAOImpl (SessionFactory sessionFactory) 
	 {
	this.sessionFactory=sessionFactory;	 
	 }
	 
		public boolean saveorupdate(Shipping shipping) {
			sessionFactory.getCurrentSession().saveOrUpdate(shipping);
			return true;
		}

		public boolean delete(Shipping shipping) {
			sessionFactory.getCurrentSession().delete(shipping);
			return true;
		}

		public Shipping getShipping(String ShipId) {
			String query = "from Shipping where ShipId='"+ ShipId+"'"; 
			Query w= sessionFactory.getCurrentSession().createQuery(query);
			List<Shipping>list=(List<Shipping>)w.list();
			if(list == null || list.isEmpty())
				return null;
			else
				return list.get(0);
		}

		public List<Shipping> shippinglist() {
			@SuppressWarnings("unchecked")
			List<Shipping> shipping=(List<Shipping>)sessionFactory.getCurrentSession().createCriteria(Shipping.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return shipping;
		}

		public List<Shipping> getaddbyuser(String userID) {
			String query = "from Shipping where uId='"+ userID+"'"; 
			Query w= sessionFactory.getCurrentSession().createQuery(query);
			List<Shipping>list=(List<Shipping>)w.list();
			if(list == null || list.isEmpty())
				return null;
			else
				return list;
		}

}



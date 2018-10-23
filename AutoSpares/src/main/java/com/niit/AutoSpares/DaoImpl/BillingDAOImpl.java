package com.niit.AutoSpares.DaoImpl;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.AutoSpares.Dao.BillingDAO;
import com.niit.AutoSpares.model.Billing;

@Repository("billingDAO")
@Transactional

public class BillingDAOImpl implements BillingDAO
{

	 @Autowired
	 SessionFactory sessionFactory;
	 
	 public BillingDAOImpl (SessionFactory sessionFactory) 
	 {
	this.sessionFactory=sessionFactory;	 
	 }
	 
		public boolean saveorupdate(Billing billing) {
			sessionFactory.getCurrentSession().saveOrUpdate(billing);
			return true;
		}

		public boolean delete(Billing billing) {
			sessionFactory.getCurrentSession().delete(billing);
			return true;
		}

		public Billing getBilling(String Billing_Id) {
			String query = "from Billing where Billing_Id='"+ Billing_Id+"'"; 
			Query w= sessionFactory.getCurrentSession().createQuery(query);
			List<Billing>list=(List<Billing>)w.list();
			if(list == null || list.isEmpty())
				return null;
			else
				return list.get(0);
		}

		public List<Billing> billinglist() {
			List<Billing> billing=(List<Billing>)sessionFactory.getCurrentSession().createCriteria(Billing.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return billing;
		}
	}

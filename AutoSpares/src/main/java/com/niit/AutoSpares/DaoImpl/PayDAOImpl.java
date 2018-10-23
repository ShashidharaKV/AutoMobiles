package com.niit.AutoSpares.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.AutoSpares.Dao.PayDAO;
import com.niit.AutoSpares.model.Pay;

@Repository("payDAO")
@Transactional
public class PayDAOImpl implements PayDAO 
{

	 @Autowired
	 SessionFactory sessionFactory;
	 
	 public PayDAOImpl(SessionFactory sessionFactory) 
	 {
	this.sessionFactory=sessionFactory;	 
	 }
	 
		public boolean saveorupdate(Pay pay) {
			sessionFactory.getCurrentSession().saveOrUpdate(pay);
			return true;
		}

		public boolean delete(Pay pay) {
			sessionFactory.getCurrentSession().delete(pay);
			return true;
		}

		public Pay getPay(String Pay_Id) {
			String query = "from Pay where Pay_Id='"+Pay_Id+"'"; 
			Query w= sessionFactory.getCurrentSession().createQuery(query);
			List<Pay>list=(List<Pay>)w.list();
			if(list == null || list.isEmpty())
				return null;
			else
				return list.get(0);
		}
		
		public List<Pay> paylist() {
			List<Pay> pay=(List<Pay>)sessionFactory.getCurrentSession().createCriteria(Pay.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return pay;
		}
	}



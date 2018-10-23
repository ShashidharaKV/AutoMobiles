package com.niit.AutoSpares.DaoImpl;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.AutoSpares.Dao.AuthenticationDAO;
import com.niit.AutoSpares.model.Authentication;

@Repository("authenticationDAO")
@Transactional

public class AuthenticationDAOImpl implements AuthenticationDAO
{

	 @Autowired
	 SessionFactory sessionFactory;
	 
	 public AuthenticationDAOImpl(SessionFactory sessionFactory) 
	 {
	this.sessionFactory=sessionFactory;	 
	 }
	 
		public boolean saveorupdate(Authentication authentication) {
			sessionFactory.getCurrentSession().saveOrUpdate(authentication);
			return true;
		}

		public boolean delete(Authentication authentication) {
			sessionFactory.getCurrentSession().delete(authentication);
			return true;
		}

		public Authentication getAuthentication(String rId) {
			String query = "from Authentication where rID='"+ rId+"'"; 
			Query w= sessionFactory.getCurrentSession().createQuery(query);
			List<Authentication>list=(List<Authentication>)w.list();
			if(list == null || list.isEmpty())
				return null;
			else
				return list.get(0);
		}

		public List<Authentication> authenticationlist() {
			List<Authentication> authentication=(List<Authentication>)sessionFactory.getCurrentSession().createCriteria(Authentication.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return authentication;
		}

		
	}

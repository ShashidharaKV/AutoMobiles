package com.niit.AutoSpares.DaoImpl;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.AutoSpares.Dao.UserDAO;
import com.niit.AutoSpares.model.Authentication;
import com.niit.AutoSpares.model.Billing;
import com.niit.AutoSpares.model.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO{
	 @Autowired
	 SessionFactory sessionFactory;
	 
	 public UserDAOImpl(SessionFactory sessionFactory) 
	 {
	this.sessionFactory=sessionFactory;	 
	 }

		public boolean saveorupdate(User user) {
			Authentication auth=new Authentication();
			auth.setUsername(user.getEmail_ID());
			Billing bill= new Billing();
			bill.setBilling_Name(user.getName());
			bill.setBilling_Phoneno(user.getPhNo());
			bill.setBilling_Address(user.getAddress());
			bill.setUser(user);
			user.setBilling(bill);
			sessionFactory.getCurrentSession().saveOrUpdate(bill);
			sessionFactory.getCurrentSession().saveOrUpdate(auth);
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		}

		public boolean delete(User user) {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		}

		public User getUser(String ID) {
			String query = "from User where UserID='"+ ID+"'"; 
			Query w= sessionFactory.getCurrentSession().createQuery(query);
			List<User>list=(List<User>)w.list();
			if(list == null || list.isEmpty())
				return null;
			else
				return list.get(0);
		}
		
		public List<User> userlist() {
			List<User> user=(List<User>)sessionFactory.getCurrentSession().createCriteria(User.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return user;
		}
			
			public User isValid(String umail, String pwd) {
				String u1="from User where Email_ID='"+umail+"'and Password='"+pwd+"'";
				Query q1=sessionFactory.getCurrentSession().createQuery(u1);
				List<User> list=(List<User>) q1.list();
				if(list==null || list.isEmpty())
				{		
				return null;
			}
				else
				{
					return list.get(0);
				}
			}

			public User getEmail(String currusername) {
				String query = "from User where Email_ID='"+ currusername+"'"; 
				Query w= sessionFactory.getCurrentSession().createQuery(query);
				List<User>list=(List<User>)w.list();
				if(list == null || list.isEmpty())
					return null;
				else
					return list.get(0);
			}
		}
	


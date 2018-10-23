package com.niit.AutoSpares.DaoImpl;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.AutoSpares.Dao.categoryDAO;
import com.niit.AutoSpares.model.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements categoryDAO
{
 @Autowired
 SessionFactory sessionFactory;
 

 public CategoryDAOImpl(SessionFactory sessionFactory) 
 {
this.sessionFactory=sessionFactory;	 
 }
 
	public boolean saveorupdate(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		return true;
	}

	public boolean delete(Category category) {
		sessionFactory.getCurrentSession().delete(category);
		return true;
	}

	public Category getCategory(String catID) {
		String query = "from Category where CategoryID='"+ catID+"'"; 
		Query w= sessionFactory.getCurrentSession().createQuery(query);
		List<Category>list=(List<Category>)w.list();
		if(list == null || list.isEmpty())
			return null;
		else
			return list.get(0);
	}

	public List<Category> catlist() {
		List<Category> category=(List<Category>)sessionFactory.getCurrentSession().createCriteria(Category.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return category;
	}
}

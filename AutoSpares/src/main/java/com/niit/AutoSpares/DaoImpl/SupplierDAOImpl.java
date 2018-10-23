package com.niit.AutoSpares.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.AutoSpares.Dao.SupplierDAO;
import com.niit.AutoSpares.model.Supplier;

@Repository("supplierDAO")
@Transactional
public class SupplierDAOImpl implements SupplierDAO {
	 @Autowired
	 SessionFactory sessionFactory;
	 
	 public SupplierDAOImpl(SessionFactory sessionFactory) 
	 {
	this.sessionFactory=sessionFactory;	 
	 }
	 
		public boolean saveorupdate(Supplier supplier) {
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		}

		public boolean delete(Supplier supplier) {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		}

		public Supplier getSupplier(String ID) {
			String query = "from Supplier where SupplierID='"+ID+"'"; 
			Query w= sessionFactory.getCurrentSession().createQuery(query);
			List<Supplier>list=(List<Supplier>)w.list();
			if(list == null || list.isEmpty())
				return null;
			else
				return list.get(0);
		}

		public List<Supplier> supplierlist() {
			List<Supplier> supplier=(List<Supplier>)sessionFactory.getCurrentSession().createCriteria(Supplier.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return supplier;
		}

		
	}



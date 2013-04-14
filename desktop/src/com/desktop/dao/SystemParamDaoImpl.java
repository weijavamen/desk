package com.desktop.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.desktop.model.SystemParam;

@Repository
public class SystemParamDaoImpl implements SystemParamDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveOne(SystemParam sp) {
		sessionFactory.getCurrentSession().persist(sp);
	}

}

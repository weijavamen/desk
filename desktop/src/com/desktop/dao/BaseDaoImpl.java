package com.desktop.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDaoImpl<T> implements BaseDao<T> {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	Class<T> clazz = null;
		
	public BaseDaoImpl(){
		ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
		clazz = (Class<T>)type.getActualTypeArguments()[0];
		System.out.println("真实实现类是：" + this.clazz.getName());
	}

	@Override
	public void saveOne(T entity) {
		System.out.println("sssssss");
		sessionFactory.getCurrentSession().save(entity);
		
	}

	@Override
	public void deleteOneById(Serializable id) {
		T t = this.findOneById(id);
		if(null!=t){
			sessionFactory.getCurrentSession().delete(t);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public T findOneById(Serializable id) {
		return (T)sessionFactory.getCurrentSession().get(clazz, id);
	}

}

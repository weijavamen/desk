package com.desktop.dao;

import java.io.Serializable;

public interface BaseDao<T> {
	
	public void saveOne(T entity);
	
	public void deleteOneById(Serializable id);
	
	public T findOneById(Serializable id);
	
	
}

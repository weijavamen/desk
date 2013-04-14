package com.desktop.dao;

import org.springframework.stereotype.Repository;

import com.desktop.model.SystemParam;

@Repository
public interface SystemParamDao {
	
	public void saveOne(SystemParam sp);
	
}

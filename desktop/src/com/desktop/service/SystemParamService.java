package com.desktop.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desktop.dao.SystemParamDao;
import com.desktop.model.SystemParam;

@Service
public class SystemParamService {
	
	@Autowired
	private SystemParamDao systemParamDaoImpl;
	
	public boolean saveOne(){
		SystemParam sp = new SystemParam();
		sp.setHiddenFlag(false);
		sp.setName("test1");
		sp.setParamValue("test1_value");
		sp.setRemark("remark");
		sp.setSortIndex(1);
		
		systemParamDaoImpl.saveOne(sp);
		
		return true;
	}
	
}

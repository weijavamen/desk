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
		sp.setName("test4");
		sp.setParamValue("test4_value");
		sp.setRemark("remark4");
		sp.setSortIndex(1);
		
		systemParamDaoImpl.saveOne(sp);
		
		return true;
	}
	
	public Long findOneById(){
		SystemParam sp = systemParamDaoImpl.findOneById(4L);
		System.out.println(sp.getName());
		return sp.getId();
	}
	
	public boolean deleteOneById(){
		systemParamDaoImpl.deleteOneById(2L);
		return true;
	}
	
}

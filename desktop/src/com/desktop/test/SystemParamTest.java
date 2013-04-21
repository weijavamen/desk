package com.desktop.test;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.desktop.service.SystemParamService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class SystemParamTest {
	
	public SystemParamTest(){}
	
	@Autowired
	private SystemParamService sps;
	
//	@Test
//	public void testSaveOne(){
//		boolean result = sps.saveOne();
//		assertTrue(result);
//	}
	
	@Test
	public void testFindOneById(){
		long id = sps.findOneById();
		assertTrue(id==4);
	}
	
	@Test
	public void testDeleteOneById(){
		boolean result = sps.deleteOneById();
		assertTrue(result);
	}
	
	
}
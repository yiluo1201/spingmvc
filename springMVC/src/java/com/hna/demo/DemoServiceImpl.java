package com.hna.demo;


import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("demoService")
//@Transactional
public class DemoServiceImpl implements DemoService {

	public Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="demoDAO")
	private DemoDAO demoDAO;
	
	@Override
	public boolean add(Demo demo) throws Exception {
		demo.setId(new Date().getTime()+"");
		log.info("service demo  " + demo);
		demoDAO.add(demo);
		
		/*int i=1;
		if (i==1) {
			throw new RuntimeException("叠粪了");
		}
		
		Demo d = new Demo();
		d.setId("1111");
		d.setUsername("abc");
		d.setPassword("123");
		demoDAO.add2(d);*/
		return false;
	}
	
	@Override
	public boolean delete(String id) throws Exception {
		
		return false;
	}

	@Override
	public boolean edit(Demo demo) throws Exception {
		
		return false;
	}

	@Override
	public boolean search(Demo demo) throws Exception {
		
		return false;
	}

}

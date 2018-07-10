package com.hna.demo;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("demoDAO")
public class DemoDAOImpl extends HibernateDaoSupport implements DemoDAO {

	public Logger log = Logger.getLogger(this.getClass());
	
	/*@Autowired
	public void setUp(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}*/
	
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	@PostConstruct
	public void setUp() {
		super.setSessionFactory(sessionFactory);
	}
	
	@Override
	public boolean add(Demo demo) throws Exception {
		log.info(demo);
		this.getHibernateTemplate().save(demo);
		return false;
	}
	
	@Override
	public boolean add2(Demo demo) throws Exception {
		log.info(demo);
		this.getHibernateTemplate().save(demo);
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

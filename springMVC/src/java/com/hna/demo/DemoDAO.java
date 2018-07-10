package com.hna.demo;

public interface DemoDAO {

	public boolean add(Demo demo) throws Exception;

	public boolean add2(Demo demo) throws Exception;

	public boolean delete(String id) throws Exception;

	public boolean edit(Demo demo) throws Exception;

	public boolean search(Demo demo) throws Exception;
}

package com.hna.demo;

public interface DemoService {

	public boolean add(Demo demo) throws Exception;

	public boolean delete(String id) throws Exception;

	public boolean edit(Demo demo) throws Exception;

	public boolean search(Demo demo) throws Exception;

}

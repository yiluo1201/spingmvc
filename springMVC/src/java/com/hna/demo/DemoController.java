package com.hna.demo;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller//("demoCtrl")
@RequestMapping("/demo")
public class DemoController {

	@Resource(name="demoService")
	private DemoService demoService;
	
	@RequestMapping("/toTest")
	public ModelAndView test(HttpServletRequest request) throws Exception {
		return new ModelAndView("/demo/test");
	}
	
	@RequestMapping("/doSomething")
	public ModelAndView doSomething(HttpServletRequest request) throws Exception {
		System.out.println("doSomething============================");
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
		return new ModelAndView("/demo/succ");
	}
	
	@RequestMapping("/doSomething2")
	public ModelAndView doSomething2(Demo demo) throws Exception {
		System.out.println("doSomething2============================");
		System.out.println(demo);
		return new ModelAndView("/demo/succ").addObject("demo", demo);
	}
	
	@RequestMapping("/add")
	public ModelAndView add(Demo demo) throws Exception {
		System.out.println("add============================"+demo);
		demoService.add(demo);
		return new ModelAndView("/demo/succ").addObject("demo", demo);
	}
}

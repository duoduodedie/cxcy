package com.zh.springann.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Controller
@RequestMapping
public class MyController{
	static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public ModelAndView handleRequest(){
		logger.info("开始进行log记录");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello World!");//1
		mv.setViewName("welcome");//视图解析器会根据该名字找到具体页面
		return mv;
	 }
	@RequestMapping(value="/like",method=RequestMethod.GET)
	public ModelAndView handleRequest2(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "i like it!");//添加模型数据，可以是任意的POJO对象
		mv.setViewName("welcome");//视图解析器会根据该名字找到具体页面
		return mv;
	 }
}

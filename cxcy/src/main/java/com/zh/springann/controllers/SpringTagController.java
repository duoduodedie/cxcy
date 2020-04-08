package com.zh.springann.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zh.springann.beans.User;

/**
* @author:Administrator 
* @version: 
* @date:Apr 7, 2020 4:53:56 PM
* @info:
*/
@Controller
public class SpringTagController {
	@GetMapping("springtag")
	public ModelAndView handleReq() {
		ModelAndView mv =new ModelAndView();
		User u1 = new User();
		u1.setUname("zhangsan");
		mv.addObject("user",u1);
		mv.setViewName("springmvctag");
		return mv;
	}
	@PostMapping("springtag")
	public String doReqPost(User u1){
		System.out.println("–’√˚£∫"+u1.getUname());
		System.out.println("µÿ÷∑£∫"+u1.getUaddr().getAddr());
		return "welcome";
	}
}

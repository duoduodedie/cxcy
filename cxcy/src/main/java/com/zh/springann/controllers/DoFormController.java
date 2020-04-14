package com.zh.springann.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.zh.springann.beans.User;

/**
* @author:Administrator 
* @version: 
* @date:Apr 7, 2020 9:11:36 AM
* @info:数据绑定演示程序
*/
@Controller
public class DoFormController {
	@PostMapping("/form/doform")
	public String doForm(User user1,Model model) {
/*		System.out.println("用户名："+user1.getUname());
		System.out.println("收货地址："+user1.getUaddr().getAddr());
		System.out.println("爱好：");
		for(String hobby:user1.getHobbies()) {
			System.out.println(hobby);
		}
*/		
		model.addAttribute("u1", user1);
		return "welcome";
	}
}

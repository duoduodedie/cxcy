package com.zh.springann.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zh.springann.beans.User;

/**
* @author:Administrator 
* @version: 
* @date:Mar 31, 2020 8:48:00 AM
* @info:
*/

@Controller
public class RegAndLoginController {

//		localhost:8080/cxcy/user/reg
	@GetMapping("/user/reg")
	public String regForm() {
		System.out.println("转跳注册界面…………");
		return "reg";
	}
	
	@PostMapping("/user/reg")
	public String doReg(User user1,Model model) {
		System.out.println("处理注册信息…………"+user1.getUname());
		System.out.println("收货地址："+user1.getUaddr().getAddr());
		return "welcome";
	}

}

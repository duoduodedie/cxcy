package com.zh.springann.controllers;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.zh.springann.beans.User;

/**
* @author:Administrator 
* @version: 
* @date:Apr 14, 2020 4:26:54 PM
* @info:session国际化演示程序
*/

@Controller
public class I18nTestController {
	@GetMapping("i18n")
	public String doGetReq(String locale_lang,HttpServletRequest req) {
//		System.out.println("用户选择的语言："+locale_lang);
		if(locale_lang != null) {
			if(locale_lang.equals("zh_CN")) {
				Locale locale = new Locale("zh", "CN");
				req.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);				
			}else if(locale_lang.equals("en_US")) {
				Locale locale = new Locale("en", "US");
				req.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);								
			}else {
				req.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, LocaleContextHolder.getLocale());;
			}
		}
		return "formtest";
	}
	@PostMapping("i18n")
	public String doPostReq(User user,Model model) {
		model.addAttribute("u1",user);
		return "welcome";
	}

}

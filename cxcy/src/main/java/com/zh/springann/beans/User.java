package com.zh.springann.beans;

import java.util.ArrayList;

/**
* @author:Administrator 
* @version: 
* @date:Mar 31, 2020 9:39:39 AM
* @info:
*/
public class User {
	private String uname;
	private String upass;
	private Address uaddr;
	private String[] hobbies;


	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public Address getUaddr() {
		return uaddr;
	}
	public void setUaddr(Address uaddr) {
		this.uaddr = uaddr;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}	
}

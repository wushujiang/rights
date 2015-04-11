package com.wsjxyy.rights.user.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wsjxyy.rights.user.domain.User;
import com.wsjxyy.rights.user.service.UserService;


@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;
	@RequestMapping(value="/find")
	public String find(User user){
		User users= userService.findUser(user.getUserCode(),user.getPassword());
		//req.setAttribute("user", user);
		
		System.out.println(users);
		return "showPerson";
	}
}

package com.wsjxyy.rights.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wsjxyy.rights.user.dao.UserDao;
import com.wsjxyy.rights.user.domain.User;

@Service
public class UserService  {
	@Resource(name="userDao")
	private UserDao userDao;

	public User findUser(String userCode,String password) {
		return userDao.findUser(userCode,password);
	}


}

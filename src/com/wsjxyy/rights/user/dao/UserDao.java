package com.wsjxyy.rights.user.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;

import com.wsjxyy.rights.user.domain.User;

@Service
public class UserDao extends SqlSessionDaoSupport  {

	public User findUser(String userCode,String password) {
		User user = null;
		try {
			user = (User) this.getSqlSession().selectOne("com.wsjxyy.rights.user.domain.User.selectUser");
					
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return user;
	}

}

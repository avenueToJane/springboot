package com.ys.api.service;

import java.util.List;

import com.ys.api.model.User;

public interface UserService {
	
	String sayHello(String str);

	User findUser();
	
	List<User> getUser(int page, int pageSize);

	User getUserForRedis(String key);

	void send(User user);//发送消息
	
	User selectUser(User user);//查询用户
}

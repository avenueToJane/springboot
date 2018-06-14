package com.ys.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ys.api.model.User;
import com.ys.api.service.UserService;
//@RestController相当于@Controller+@ResponseBody(每一个方法上默认返回的是json串)
@Controller
@RequestMapping("/")
public class TestController {
	private String PREFIX = "/user/";
	@Reference(version = "1.0.0")
	private UserService testService;
	
	@RequestMapping(value="/index")  
	   public String index() {
		
	     return PREFIX+"index";  
	} 

	@GetMapping("hello")
	public String hello() {
		return testService.sayHello("Hello springboot and dubbo!");
	}

	@GetMapping("user")
	public User user() {
		return testService.findUser();
	}
    /**
     * 从数据库中 读取
    * @Title: list 
    * @Description: TODO 
    * @param page
    * @param pageSize
    * @return List<User>
    * @author ys
    * @date 2018年6月12日上午9:05:33
     */
	@GetMapping("list")
	public List<User> list(@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int pageSize) {
		return testService.getUser(page, pageSize);
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public List<User> add(@RequestBody User user) {
		System.out.println(user.toString());
		return null;
	}

	// 从redis获取某个用户
	@RequestMapping(value = "/getuserfromredis", method = RequestMethod.GET)
	public User getRedis(@RequestParam String key) {
		return testService.getUserForRedis(key);
	}
	/**
	 * 发送消息
	* @Title: add 
	* @Description: TODO 
	* @param user
	* @return List<User>
	* @author ys
	* @date 2018年6月12日上午11:09:04
	 */
	@RequestMapping(value = "send", method = RequestMethod.POST)
	public void send(@RequestBody User user) {
		testService.send(user)	;
	}
}

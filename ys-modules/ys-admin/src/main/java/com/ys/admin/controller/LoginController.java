package com.ys.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.alibaba.dubbo.config.annotation.Reference;
import com.ys.api.model.User;
import com.ys.api.service.UserService;
//@RestController相当于@Controller+@ResponseBody(每一个方法上默认返回的是json串)
@Controller
@RequestMapping("/")
public class LoginController {
	private String PREFIX = "/user/";
	@Reference(version = "1.0.0")
	private UserService userService;
	
	 //跳转登陆页面
	  @RequestMapping(value="/")  
	   public String index() {
		System.out.println("------------------------------");
	     return PREFIX+"login";  
	} 
	
	   @RequestMapping(value="/register")  
	   public String register() {
		
	     return PREFIX+"register";  
	} 
	
	/**
	 * 验证登陆操作是否成功
	* @Title: login 
	* @Description: TODO 
	* @return String
	* @author ys
	* @date 2018年6月13日下午3:44:12
	 */
	@RequestMapping(value="/login") 
	@ResponseBody
	public Map<String, String> login(@RequestBody User user) {
		User u=userService.selectUser(user);
		Map<String,String> map=new HashMap<>();
		map.put("success", "true");
		if(u==null) {
			map.put("success", "false");
		}
		
	    return map;  
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
		return userService.getUser(page, pageSize);
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public List<User> add(@RequestBody User user) {
		System.out.println(user.toString());
		return null;
	}

	// 从redis获取某个用户
	@RequestMapping(value = "/getuserfromredis", method = RequestMethod.GET)
	public User getRedis(@RequestParam String key) {
		return userService.getUserForRedis(key);
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
		userService.send(user)	;
	}
}

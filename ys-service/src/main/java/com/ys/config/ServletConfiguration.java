package com.ys.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.http.StatViewServlet;

@Configuration  
public class ServletConfiguration { 
	
	@Value("${druid.username}")
	private String userName;
	@Value("${druid.password}")
	private String password;
	@Value("${druid.allow}")
	private String allow;
	@Value("${druid.reset.enable}")
	private String resetEnable;
	
	/**
	 * StatViewServlet类
	 * 注意：避免直接调用Druid相关对象例如DruidDataSource等，相关调用要到DruidStatManagerFacade里用反射实现
	* @Title: druidStatViewServletBean 
	* @Description: TODO 
	* @return ServletRegistrationBean
	* @author ys
	* @date 2018年6月12日上午10:35:06
	 */
    @Bean  
    public ServletRegistrationBean druidStatViewServletBean() {  
        // 后台的路径  
        ServletRegistrationBean statViewServletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");  
        Map<String, String> params = new HashMap<>();  
        // 账号密码，是否允许重置数据  
        params.put("loginUsername", userName);  
        params.put("loginPassword", password); 
        params.put("allow", allow);  
        params.put("resetEnable", resetEnable);
        statViewServletRegistrationBean.setInitParameters(params);  
        return statViewServletRegistrationBean;  
    }  
}  
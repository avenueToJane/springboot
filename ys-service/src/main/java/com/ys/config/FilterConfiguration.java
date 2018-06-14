package com.ys.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.http.WebStatFilter;
/**
 * Web开发使用 Controller 基本上可以完成大部分需求，但是我们还可能会用到 Servlet、Filter、Listener、Interceptor 等等。

当使用Spring-Boot时，嵌入式Servlet容器通过扫描注解的方式注册Servlet、Filter和Servlet规范的所有监听器
（如HttpSessionListener监听器）。
Spring boot 的主 Servlet 为 DispatcherServlet，其默认的url-pattern为“/”。也许我们在应用中还需要定义更多的Servlet，
该如何使用SpringBoot来完成呢？

在spring boot中添加自己的Servlet有两种方法，代码注册Servlet和注解自动注册（Filter和Listener也是如此）。
一、代码注册通过ServletRegistrationBean、 FilterRegistrationBean 和 ServletListenerRegistrationBean 获得控制。
也可以通过实现 ServletContextInitializer 接口直接注册。

二、在 SpringBootApplication 上使用@ServletComponentScan 注解后，Servlet、Filter、Listener 可以直接通过 
@WebServlet、@WebFilter、@WebListener 注解自动注册，无需其他代码。
* <p>Title: FilterConfiguration </p>
* <p>Description: </p>
* <p>Company: westlife</p> 
* @author westlife
* @date 2018年6月12日 上午9:48:22
 */
@Configuration  
public class FilterConfiguration { 
	/**
	 *WebStatFilter类 用于配置Web和Druid数据源之间的管理关联监控统计
	* @Title: druidStatFilterBean 
	* @Description: TODO 
	* @return FilterRegistrationBean
	* @author ys
	* @date 2018年6月12日上午10:32:10
	 */
    @Bean  
    public FilterRegistrationBean druidStatFilterBean() {  
        FilterRegistrationBean druidStatFilterBean = new FilterRegistrationBean(new WebStatFilter());  
        List<String> urlPattern = new ArrayList<>();  
        urlPattern.add("/*");  
        druidStatFilterBean.setUrlPatterns(urlPattern);  
        Map<String, String> initParams = new HashMap<>();  
        initParams.put("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");  
        druidStatFilterBean.setInitParameters(initParams);  
        return druidStatFilterBean;  
    }  
}  
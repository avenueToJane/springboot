package com.ys;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
/**
 * @ComponentScan告诉Spring 哪个packages 的用注解标识的类 会被spring自动扫描并且装入bean容器。
 * 通过使用@MapperScan可以指定要扫描的Mapper类的包的路径，
* <p>Title: ProviderApplication </p>
* <p>Description: </p>
* <p>Company: westlife</p> 
* @author westlife
* @date 2018年6月12日 上午9:53:16
 */
@SpringBootApplication(/*exclude = {DataSourceAutoConfiguration.class}*/)
@ImportResource({"classpath:config/spring-dubbo.xml"})
@MapperScan("com.ys.resource")
@ComponentScan({"com.ys.config","com.ys.component"})
public class ProviderApplication {

	private static Logger logger = Logger.getLogger(ProviderApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
		logger.info("SpringBoot Start Success");
	}

}

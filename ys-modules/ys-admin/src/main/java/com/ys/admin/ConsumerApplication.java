package com.ys.admin;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
/**
 * 启动类
* <p>Title: ConsumerApplication </p>
* <p>Description: </p>
* <p>Company: westlife</p> 
* @author westlife
* @date 2018年6月12日 下午3:21:05
 */
@SpringBootApplication
@ImportResource({ "classpath:config/spring-dubbo.xml" })
public class ConsumerApplication {

	private static Logger logger = Logger.getLogger(ConsumerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
		logger.info("SpringBoot Start Success");
	}

}

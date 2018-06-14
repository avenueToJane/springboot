package com.ys.component;

import org.apache.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.ys.ProviderApplication;
/**
 * 接收者
* <p>Title: Receiver </p>
* <p>Description: </p>
* <p>Company: westlife</p> 
* @author westlife
* @date 2018年6月12日 上午10:59:14
 */
@Component
public class Receiver {
	
	private static Logger logger = Logger.getLogger(ProviderApplication.class);
  /**
   * 注意使用

    @RabbitListener(queues = xxx)  
    @RabbitHandler  
      修饰的方法，即队列的监听函数，不能返回任何值！否则会导致一个rabbit reply message  
      回复异常，该异常是由于此方法返回的消息没有设置目的地，查看源码可以看出
      
      发送者和接收者的queue name必须一致，不然不能接收
  * @Title: processMessage1 
  * @Description: TODO 
  * @param msg void
  * @author ys
  * @date 2018年6月12日下午2:41:43
   */
	@RabbitListener(queues = "queue1")
	public void processMessage1(String msg) {
		logger.info(Thread.currentThread().getName() + " 接收到来自queue1队列的消息：" + msg);
		
	}

	@RabbitListener(queues = "queue2")
	public void processMessage2(String msg) {
		logger.info(Thread.currentThread().getName() + " 接收到来自queue2队列的消息：" + msg);
	}
}
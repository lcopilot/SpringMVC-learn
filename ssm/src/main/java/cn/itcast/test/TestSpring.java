package cn.itcast.test;

import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringMVC
 * @auther: MuGe
 * @date: 2019/11/27
 * @time: 15:23
 * @description:
 */
public class TestSpring {

	@Test
	public void run1(){
		//加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml");
		//获取对象
		AccountService accountService = (AccountService) ac.getBean("accountService");
		//调用方法
		accountService.findAll();


	}
}

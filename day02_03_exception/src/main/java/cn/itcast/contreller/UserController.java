package cn.itcast.contreller;

import cn.itcast.exception.SysException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringMVC
 * @auther: MuGe
 * @date: 2019/11/27
 * @time: 9:59
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/testException")
	public String testException() throws SysException{
		System.out.println("testException执行了..");

		try {
			//异常
			int a=10/0;
		} catch (Exception e) {
			//打印异常信息
			e.printStackTrace();
			//抛出自定义异常信息
			throw new SysException("查询所有的用户出现错误了...");

		}

		return "success";
	}


}

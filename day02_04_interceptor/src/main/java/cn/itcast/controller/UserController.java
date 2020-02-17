package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringMVC
 * @auther: MuGe
 * @date: 2019/11/27
 * @time: 11:14
 * @description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/testInterceptor")
	public String testInterceptor(){
		System.out.println("testInterceptor....");

		return "success";
	}

}

package cn.itcast.controller;

/**
 * @program: SpringMVC
 * @auther: MuGe
 * @date: 2019/11/27
 * @time: 15:09
 * @description:
 */

import cn.itcast.daomain.Account;
import cn.itcast.service.AccountService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户web
 */
@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private Account account;

	@Autowired
	AccountService accountService;

	@RequestMapping("/testFindAll")
	public String findAll(Model model){
		System.out.println("controller....FindAll");
		List<Account> accountList = accountService.findAll();
		model.addAttribute("accountList",accountList);
		return "list";
	}

	@RequestMapping("/testSave")
	public String testSave(Account account){
		accountService.saveAccount(account);
		return "list";
	}
}

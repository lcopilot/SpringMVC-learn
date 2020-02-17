package cn.itcast.service;

import cn.itcast.daomain.Account;
import java.util.List;

/**
 * @program: SpringMVC
 * @auther: MuGe
 * @date: 2019/11/27
 * @time: 15:04
 * @description:
 */
public interface AccountService {
	/**
	 * 查询所有账户
	 * @return
	 */
	public List<Account> findAll();

	/**
	 * 保存账户信息
	 * @param account
	 */
	public void saveAccount(Account account);
}

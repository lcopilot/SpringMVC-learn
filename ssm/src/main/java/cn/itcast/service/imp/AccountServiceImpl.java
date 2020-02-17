package cn.itcast.service.imp;

import cn.itcast.dao.AccountDao;
import cn.itcast.daomain.Account;
import cn.itcast.service.AccountService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: SpringMVC
 * @auther: MuGe
 * @date: 2019/11/27
 * @time: 15:06
 * @description:
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;



	@Override
	public List<Account> findAll() {
		System.out.println("service...findAll");
		List<Account> list = accountDao.findAll();
		for (Account account : list) {
			System.out.println(account);
		}
		return list;
	}

	@Override
	public void saveAccount(Account account) {

		System.out.println("service...saveAccount");

		accountDao.saveAccount(account);
	}
}

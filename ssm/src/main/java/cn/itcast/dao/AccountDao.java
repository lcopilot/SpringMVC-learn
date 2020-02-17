package cn.itcast.dao;

/**
 * @program: SpringMVC
 * @auther: MuGe
 * @date: 2019/11/27
 * @time: 15:00
 * @description:
 */

import cn.itcast.daomain.Account;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 账户dao接口
 */
@Repository
public interface AccountDao {

	/**
	 * 查询所有账户
	 *
	 * @return
	 */
	@Select("select*from account")
	public List<Account> findAll();

	/**
	 * 保存账户信息
	 *
	 * @param account
	 */
	@Insert("insert into account (name,money) values(#{name},#{money})")
	public void saveAccount(Account account);


}

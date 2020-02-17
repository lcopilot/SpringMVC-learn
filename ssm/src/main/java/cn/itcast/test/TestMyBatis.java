package cn.itcast.test;

import cn.itcast.dao.AccountDao;
import cn.itcast.daomain.Account;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

/**
 * @program: SpringMVC
 * @auther: MuGe
 * @date: 2019/11/27
 * @time: 16:30
 * @description:
 */
public class TestMyBatis {

	@Test
	public void run1() throws IOException {
		//加载配置文件
		InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
		//创建SqlSessionFactory对象
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		//创建SqlSession对象
		SqlSession session = factory.openSession();
		//获取代理对象
		AccountDao accountDao = session.getMapper(AccountDao.class);
		//执行方法
		List<Account> list = accountDao.findAll();
		for (Account account : list) {
			System.out.println(account);
		}
		session.close();
		in.close();
	}
}

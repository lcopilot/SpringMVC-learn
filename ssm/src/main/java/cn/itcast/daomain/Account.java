package cn.itcast.daomain;

/**
 * @program: SpringMVC
 * @auther: MuGe
 * @date: 2019/11/27
 * @time: 14:57
 * @description:
 */

import java.io.Serializable;
import org.springframework.stereotype.Component;

/**
 * 账户
 */
@Component
public class Account implements Serializable {

	private Integer id;
	private String name;
	private Double money;

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", name='" + name + '\'' +
				", money=" + money +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
}

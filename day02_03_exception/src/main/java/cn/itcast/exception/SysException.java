package cn.itcast.exception;

/**
 * @program: SpringMVC
 * @auther: MuGe
 * @date: 2019/11/27
 * @time: 10:00
 * @description:
 */
public class SysException extends Exception  {

	//存储提示信息
	private String message;

	public SysException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

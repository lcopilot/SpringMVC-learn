package cn.itcast.exception;

/**
 * @program: SpringMVC
 * @auther: MuGe
 * @date: 2019/11/27
 * @time: 10:09
 * @description:
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 异常处理器
 */
public class SysExceptionResolver implements HandlerExceptionResolver {

	/**
	 *
	 * @param httpServletRequest
	 * @param httpServletResponse
	 * @param o
	 * @param ex
	 * @return
	 */
	@Override
	public ModelAndView resolveException(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse, Object o, Exception ex) {
		//获取异常对象
		SysException e=null;
		if(ex instanceof SysException){
			e=(SysException)ex;
		}else {
			e=new SysException("系统正在维护,请稍后重试...");
		}
		//创建ModelAndView对象
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("errorMsg",e.getMessage());
		modelAndView.setViewName("error");
		return modelAndView;
	}



}

package su22.sof3021.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class DemoLogInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(
		HttpServletRequest request, 
		HttpServletResponse response, 
		Object handler
	) throws Exception {
		System.out.println("DemoLogInterceptor@preHandle");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
		HttpServletResponse response, Object handler,
		ModelAndView modelAndView) throws Exception {
		System.out.println("DemoLogInterceptor@postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
		HttpServletResponse response, Object handler,
		Exception ex) throws Exception {
		System.out.println("DemoLogInterceptor@afterCompletion");
	}

}

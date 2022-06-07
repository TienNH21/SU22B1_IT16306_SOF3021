package su22.sof3021.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import su22.sof3021.interceptors.DemoLogInterceptor;

@Configuration
public class InterceptorConfiguration
	implements WebMvcConfigurer {
	@Autowired
	private DemoLogInterceptor demoLogInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry)
	{
		registry.addInterceptor(demoLogInterceptor)
			.addPathPatterns("/hello");
	}
}

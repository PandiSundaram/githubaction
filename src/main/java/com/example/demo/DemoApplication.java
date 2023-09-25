package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	ShallowEtagHeaderFilter shallowEtagHeaderFilter(){
//       return new ShallowEtagHeaderFilter();
//	}

	@Bean
	FilterRegistrationBean<ShallowEtagHeaderFilter> filterFilterRegistrationBean(){
		FilterRegistrationBean<ShallowEtagHeaderFilter> filterRegistrationBean = new FilterRegistrationBean<>(
			new ShallowEtagHeaderFilter()
		);
		filterRegistrationBean.addUrlPatterns("/custom/*");
		filterRegistrationBean.setName("EtagFilter");
		return filterRegistrationBean;
	}

}

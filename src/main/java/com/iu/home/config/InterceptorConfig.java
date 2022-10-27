package com.iu.home.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.iu.home.interceptors.StudyInterceptor;
import com.iu.home.interceptors.TestInterceptor;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class InterceptorConfig implements WebMvcConfigurer{
	@Autowired//IOC (Inverision of Controll)
	private TestInterceptor testInterceptor;
	@Autowired
	private StudyInterceptor studyInterceptor;
	@Override
		public void addInterceptors(InterceptorRegistry registry) {
		//method 체이닝
			registry.addInterceptor(testInterceptor)
			//적용할 URL 인터셉터
					.addPathPatterns("/qna/**")
					.addPathPatterns("/notcie/**")
			//제외할 URL
					.excludePathPatterns("/qna/add")
					.excludePathPatterns("/qna/detail");
			registry.addInterceptor(studyInterceptor)
					.addPathPatterns("/qna/**");
			WebMvcConfigurer.super.addInterceptors(registry);
		}
}

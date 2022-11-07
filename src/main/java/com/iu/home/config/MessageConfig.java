package com.iu.home.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration///@configuraition -> ***-context.xml
public class MessageConfig implements WebMvcConfigurer {
	
	public LocaleResolver locale() {
		//1.session
		SessionLocaleResolver resolver = new SessionLocaleResolver();
		//2. Cookie
		CookieLocaleResolver cResolver = new CookieLocaleResolver();
		cResolver.setDefaultLocale(Locale.KOREAN);
		cResolver.setCookieName("lang");
		return cResolver;
	}
	
	//Interceptor 객체
	@Bean
	public LocaleChangeInterceptor changeInterceptor() {
		LocaleChangeInterceptor changeInterceptor = new LocaleChangeInterceptor();
		changeInterceptor.setParamName("lang");
		//파라미터를 받아서 언어구분
		//url?lang=en
		return changeInterceptor;
	}
	
	
	// ***-context.xml
	// <bean-class="" id=""> == new 생성자
//	@Bean
//	public String getString() {
//		return new String();
//	}

}

package com.iu.home;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.iu.home.board.qna.QnaMapper;


@Controller
public class HomeController {
	
//	@Value("${my.message.hi}")
	private String message;
	@Value("${my.default}")
	private String app;
	
//	private final Logger log = LoggerFactory.getLogger(HomeController.class);
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/admin")
	@ResponseBody
	public String admin() {
		return "Admin Role";
	}
	
	@GetMapping("/manager")
	@ResponseBody
	public String manager() {
		return "Manager Role";
	}
	
	@GetMapping("/user")
	@ResponseBody
	public String memeber() {
		return "Member Role";
	}
	
	@GetMapping("/")
	public String home(HttpSession session) throws Exception {
		log.info("==========================");
		Enumeration<String> en =  session.getAttributeNames();
		
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			log.info("key {}", key);
		}
		Object obj =  session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION");
		log.info("asdf   {}", obj);
		log.info("message {} ", message);
		log.info("default {} ", app);
		log.info("==========================");

		return "index";
	}
}

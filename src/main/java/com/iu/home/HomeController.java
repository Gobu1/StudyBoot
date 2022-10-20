package com.iu.home;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	@Value("${my.message.hi}")
	private String message;
	
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	@GetMapping("/")
	public String home()throws Exception {
		System.out.println(message);
		log.error("Error Messeage");
		log.warn("Warn Message");
		log.info("Info Message");
		log.debug("debug message");
		log.trace("trace message");

		return "index";
	}
}

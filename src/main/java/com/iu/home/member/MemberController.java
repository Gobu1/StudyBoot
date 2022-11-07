package com.iu.home.member;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/member/*")
@Slf4j
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("login")
	public String getLogin()throws Exception{
		return "member/login";
	}
	
//	@PostMapping("login")
//	public ModelAndView getLogin(MemberVO memberVO, HttpSession session)throws Exception{
//		ModelAndView mv = new ModelAndView();
////		memberVO = memberService.getLogin(memberVO);
//		session.setAttribute("member", memberVO);
//		mv.setViewName("redirect:../");
//		return mv;
//	}
	
	@GetMapping("add")
	public void setAdd(@ModelAttribute MemberVO memberVO)throws Exception{
		
	}
	
	@PostMapping("add")
	public ModelAndView setAdd(@Valid MemberVO memberVO, BindingResult bindingResult, ModelAndView mv)throws Exception{
		boolean ck = bindingResult.hasErrors();
		log.info("asdf  : {}", ck);
		if(bindingResult.hasErrors()) {
			mv.setViewName("member/add");
			return mv;
		}
		
		int result = memberService.setAdd(memberVO);
		mv.setViewName("redirect:./login");
		return mv;
	}
	
	@GetMapping("logout")
	public ModelAndView getLogout(ModelAndView mv, HttpSession session)throws Exception{
		session.invalidate();
		mv.setViewName("redirect:../");
		
		return mv;
	}
	
	@GetMapping("idCheck")
	@ResponseBody
	public int getIdCheck(MemberVO memberVO)throws Exception{
	int result = memberService.getIdCheck(memberVO);
//	if(result==0) {
//		throw new Exception("예외 테스트");
//	}
	return result;
	}
	
	@PostMapping("test")
	@ResponseBody
	public MemberVO setTest(MemberVO memberVO, String [] ar)throws Exception{
		log.info("------");
		log.info("ID : {}", memberVO.getId());
		log.info("NAME : {}", memberVO.getName());
		for(String s : ar) {
			log.info("ar : {}", s);
			
		}
	
		return memberVO;
	}

}

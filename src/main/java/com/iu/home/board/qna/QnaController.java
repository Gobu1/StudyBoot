package com.iu.home.board.qna;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.iu.home.util.Pager;

@Controller
@RequestMapping("/qna/*")
public class QnaController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private QnaService qnaService;
	
	@PostMapping("add")
	public String setAdd(QnaVO qnaVO, RedirectAttributes redirectAttributes)throws Exception{
		
		int result = qnaService.setAdd(qnaVO);
		redirectAttributes.addAttribute("result", result);
		
		return "redirect:./list";
	}
	
	@GetMapping("add")
	public String setAdd()throws Exception{
		return "board/write";
	}
	
	
	@GetMapping("list")
	private ModelAndView getList(Pager pager)throws Exception{
		ModelAndView mv = new ModelAndView();
		
		pager.getRowNum();
		List<QnaVO> ar = qnaService.getList(pager);
		
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		mv.setViewName("board/list");
		return mv;
	}
	
}

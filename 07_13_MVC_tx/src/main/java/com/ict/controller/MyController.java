package com.ict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ict.service.MyService;
import com.ict.vo.VO;

@Controller
public class MyController {
	@ Autowired MyService myService ;
	@RequestMapping("result.do")
	public ModelAndView resultCommand(VO vo) {
		ModelAndView mv = new ModelAndView("result");
		try {
			vo.setCountnum(vo.getAmount());
			int res = myService.insertCT(vo);
			
			// 성공하면 1, 실패하면 0 ;
			mv.addObject("vo", vo);
			mv.addObject("res", res);
			return mv;
		} catch (Exception e) {
			mv.addObject("res", 0);
			return mv;
		}
	}
}

package com.ict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ict.service.CalcService;
import com.ict.vo.CalcVO;

@Controller
public class MyController {
	@Autowired
	private CalcService calc ;
	public void setCalc(CalcService calc) {
		this.calc = calc;
	}
	
	@RequestMapping("calc.do")
	public ModelAndView getCalc(@ModelAttribute("mvo")CalcVO vo) {
		ModelAndView mv = new ModelAndView("result");
		String op = vo.getOp();
		int result = 0 ;
		double result2 = 0 ;
		switch (op) {
			case "+": result = calc.add(vo.getS1(), vo.getS2());break;
			case "-":result = calc.sub(vo.getS1(), vo.getS2());	break;
			case "*":result = calc.mul(vo.getS1(), vo.getS2());	break;
			case "/":result2 = calc.div(vo.getS1(), vo.getS2());break;
		}
		// mv.addObject("s1", vo.getS1());
		// mv.addObject("s2", vo.getS2());
		// mv.addObject("op", vo.getOp());
		mv.addObject("result", result);
		mv.addObject("result2", result2);
		// mv.addObject("hobby", vo.getHobby());
		// mv.addObject("meberNo", vo.getMeberNo());
		return mv;
	}
}











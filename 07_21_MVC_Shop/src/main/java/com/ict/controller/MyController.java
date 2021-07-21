package com.ict.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ict.service.MyService;
import com.ict.vo.CVO;
import com.ict.vo.MVO;
import com.ict.vo.VO;

@Controller
public class MyController {
	@Autowired
	private MyService myService;
	
	@RequestMapping("list.do")
	public ModelAndView listCommand(@ModelAttribute("category")String category) {
		try {
			ModelAndView mv = new ModelAndView("product_list");
			List<VO> list = myService.selectAll(category);
			mv.addObject("list", list);
			return mv;
		} catch (Exception e) {
		}
		return null;
	}
	
	@RequestMapping("onelist.do")
	public ModelAndView onelistCommand(@RequestParam("idx")String idx) {
		try {
			ModelAndView mv = new ModelAndView("product_content");
			VO vo = myService.selectVO(idx);
			mv.addObject("vo", vo);
			return mv;
		} catch (Exception e) {
		}
		return null;
	}
	
	@RequestMapping("login.do")
	public ModelAndView loginCommand() {
		return new ModelAndView("login"); 
	}
	
	@RequestMapping(value="login_ok.do", method = RequestMethod.POST)
	public ModelAndView loginokCommand(MVO mvo, HttpServletRequest request) {
		try {
			ModelAndView mv = new ModelAndView("redirect:list.do?category=ele002");
			MVO m_vo = myService.selectMVO(mvo);
			if(m_vo == null) {
				return new ModelAndView("login");
			}else {
				request.getSession().setAttribute("mvo", m_vo);
				request.getSession().setAttribute("login", "ok");
				if(m_vo.getId().equals("aa")) {
					request.getSession().setAttribute("aa", "ok");
					return new ModelAndView("aa");
				}
				return mv;				
			}
		} catch (Exception e) {
		}
		return null;
	}
	
	@RequestMapping("logout.do")
	public ModelAndView logoutCommand(HttpServletRequest request) {
		request.getSession().invalidate();
		return new ModelAndView("redirect:list.do?category=ele002");
	}
	// 관리자로그인
	
	// 장바구니에 담기
	@RequestMapping(value="addCart.do")
	public ModelAndView addCartCommand(@RequestParam("idx")String idx, HttpServletRequest request) {
		try {
			MVO mvo = (MVO)request.getSession().getAttribute("mvo");
			String id = mvo.getId();
			
			VO vo = myService.selectVO(idx);
			CVO c_vo = new CVO();
			c_vo.setId(id);
			c_vo.setP_num(vo.getP_num());
			CVO cvo = myService.selectCart(c_vo);
			
			if(cvo == null) {
				c_vo = new CVO();
				c_vo.setP_num(vo.getP_num());
				c_vo.setP_name(vo.getP_name());
				c_vo.setP_price(String.valueOf(vo.getP_price()));
				c_vo.setP_saleprice(String.valueOf(vo.getP_saleprice()));
				c_vo.setAmount("1");
				c_vo.setId(id);
				int result = myService.insertCart(c_vo);
			}else {
				int result = myService.updateCart(cvo);
			}
			return new ModelAndView("redirect:onelist.do?idx="+idx);
		} catch (Exception e) {
		}
		return null;
	}
	
	// 장바구니 보기
	@RequestMapping(value="showCart.do")
	public ModelAndView showCartCommand(HttpServletRequest request) {
		try {
			ModelAndView mv = new ModelAndView("viewcart");
			MVO mvo = (MVO)request.getSession().getAttribute("mvo");
			String id = mvo.getId();
			
			List<CVO> cartList = myService.selectCartList(id);
			mv.addObject("cartList", cartList);
			return mv;
		} catch (Exception e) {
		}
		return null;
	}
	
	@RequestMapping("editCart.do")
	public ModelAndView editCartCommand(HttpServletRequest request) {
		try {
			CVO cvo = new CVO();
			cvo.setId(request.getParameter("id"));
			cvo.setP_num(request.getParameter("p_num"));
			cvo.setAmount(request.getParameter("amount"));
			
			int result = myService.updateCartAmount(cvo);
			return new ModelAndView("redirect:showCart.do");
		} catch (Exception e) {
		}
		return null;
	}
	@RequestMapping("deleteCart.do")
	public ModelAndView deleteCommand(HttpServletRequest request) {
		try {
			CVO cvo = new CVO();
			cvo.setId(request.getParameter("id"));
			cvo.setP_num(request.getParameter("p_num"));
			int result = myService.deleteCart(cvo);
			return new ModelAndView("redirect:showCart.do");
		} catch (Exception e) {
		}
		return null;
	}
}

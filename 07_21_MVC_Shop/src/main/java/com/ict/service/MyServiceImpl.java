package com.ict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.dao.MyDAO;
import com.ict.vo.CVO;
import com.ict.vo.MVO;
import com.ict.vo.VO;

@Service
public class MyServiceImpl implements MyService {
	@Autowired
	private MyDAO myDAO;
	
	@Override
	public List<VO> selectAll(String category) throws Exception {
		return myDAO.selectAll(category);
	}
	@Override
	public VO selectVO(String idx) throws Exception { 
		return myDAO.selectVO(idx);
	}
	@Override
	public MVO selectMVO(MVO mvo) throws Exception {
		return myDAO.selectMVO(mvo);
	}
	@Override
	public CVO selectCart(CVO c_vo) throws Exception {
		return myDAO.selectCart(c_vo);
	}
	@Override
	public int insertCart(CVO c_vo) throws Exception {
		return myDAO.insertCart(c_vo);
	}
	@Override
	public int updateCart(CVO cvo) throws Exception {
		return myDAO.updateCart(cvo);
	}
	@Override
	public List<CVO> selectCartList(String id) throws Exception {
		return myDAO.selectCartList(id);
	}
	@Override
	public int deleteCart(CVO cvo) throws Exception {
		return myDAO.deleteCart(cvo);
	}
	@Override
	public int updateCartAmount(CVO cvo) throws Exception {
		return myDAO.updateCartAmount(cvo);
	}
}

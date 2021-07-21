package com.ict.dao;

import java.util.List;

import com.ict.vo.CVO;
import com.ict.vo.MVO;
import com.ict.vo.VO;

public interface MyDAO {
	List<VO> selectAll(String category) throws Exception;
	VO selectVO(String idx) throws Exception;
	MVO selectMVO(MVO mvo) throws Exception;
	CVO selectCart(CVO c_vo) throws Exception;
	int insertCart(CVO c_vo) throws Exception;
	int updateCart(CVO cvo) throws Exception;
	List<CVO> selectCartList(String id) throws Exception;
	int deleteCart(CVO cvo) throws Exception;
	int updateCartAmount(CVO cvo) throws Exception;
}

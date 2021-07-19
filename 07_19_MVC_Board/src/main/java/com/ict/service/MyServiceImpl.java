package com.ict.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.dao.MyDAO;
import com.ict.vo.VO;

@Service
public class MyServiceImpl implements MyService{
	@Autowired
	private MyDAO myDAO ;
	
	@Override
	public int selectCount() throws Exception {
		return myDAO.selectCount();
	}
	
	@Override
	public List<VO> selectList(int begin, int end) throws Exception {
		return myDAO.selectList(begin, end);
	}
	
	@Override
	public int insertVO(VO vo) throws Exception {
		return myDAO.insertVO(vo);
	}
	
	@Override
	public VO selectVOOneList(String idx) throws Exception {
		return myDAO.selectVOOneList(idx);
	}
	
	@Override
	public int selectPwdchk(VO vo) throws Exception {
		return myDAO.selectPwdchk(vo);
	}
	@Override
	public int deleteVO(String idx) throws Exception {
		return myDAO.deleteVO(idx);
	}
	
	@Override
	public int updateVO(VO vo) throws Exception {
		return myDAO.updateVO(vo);
	}
	
	@Override
	public int updateHit(String idx) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateLevUp(Map<String, Integer> map) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int insertAns(VO vo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteAns(String idx) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
}
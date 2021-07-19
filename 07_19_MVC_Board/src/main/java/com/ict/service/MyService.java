package com.ict.service;

import java.util.List;
import java.util.Map;

import com.ict.vo.VO;

public interface MyService {
	int selectCount() throws Exception;
	List<VO> selectList(int begin, int end) throws Exception;
	int insertVO(VO vo) throws Exception;
	VO selectVOOneList(String idx) throws Exception;
	int selectPwdchk(VO vo) throws Exception;
	int deleteVO(String idx) throws Exception;
	int updateVO(VO vo) throws Exception;
	
	int updateHit(String idx) throws Exception;
	int updateLevUp(Map<String, Integer> map) throws Exception;
	int insertAns(VO vo) throws Exception;
	int deleteAns(String idx) throws Exception;
}
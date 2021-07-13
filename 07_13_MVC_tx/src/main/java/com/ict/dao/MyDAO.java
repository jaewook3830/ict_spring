package com.ict.dao;

import com.ict.vo.VO;

public interface MyDAO {
	void insertCard(VO vo) throws Exception;
	void insertTicket(VO vo) throws Exception;
}

package com.ict.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.dao.MyDAO;
import com.ict.vo.VO;

@Service("myServiceImpl")
public class MyServiceImpl implements MyService {
	@Autowired
	private MyDAO myDAO;
	
	@Override
	public int insertCT(VO vo) throws Exception {
		// 트랜잭션 : 여러가지 작업을 하나의 묶음 처리
		// 트랜잭션 단위가 모두다 성공해야지만 성공
		// 오류가 발생하면 모두다 롤백을 해야 된다.
		myDAO.insertCard(vo);
		myDAO.insertTicket(vo);
		return 1;
	}
}

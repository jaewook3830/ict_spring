package com.ict.service;

import com.ict.vo.VO;

public interface MyService {
	// MyDAO의 insertCard와 insertTicket을 같이 처리하자
	// 여러개의 일처리를 묶어서 한번에 하나의 단위로 처리하는 것을 트랜잭션이라고 한다.
	int insertCT(VO vo) throws Exception; 
}

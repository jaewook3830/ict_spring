package com.ict.ex07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("service")
public class Service {
	@Autowired
	private DAO dao;
	
	public Service() {
		System.out.println("서비스 생성자");
	}
	// 생성자
	public Service(DAO dao) {
		this.dao = dao;
		System.out.println("서비스 생성자");
	}
	
	// setter
	public void setDao(DAO dao) {
		this.dao = dao;
	}

	// 실행하고 싶은 메소드 
	public void biz() {
		dao.prn();
	}
}

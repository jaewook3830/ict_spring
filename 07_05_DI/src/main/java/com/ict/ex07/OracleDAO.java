package com.ict.ex07;

import org.springframework.stereotype.Component;

@Component("dao")
public class OracleDAO implements DAO{
	public OracleDAO() {
		System.out.println("오라클 생성자");
	}
	@Override
	public void prn() {
		System.out.println("오라클 실행메소드");
	}
}

package com.ict.ex07;

import org.springframework.stereotype.Component;

@Component("mysql")
public class MySQLDAO implements DAO{
	public MySQLDAO() {
		System.out.println("MySQL 생성자");
	}
	@Override
	public void prn() {
		System.out.println("MySQL 실행메소드");
	}
}

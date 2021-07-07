package com.ict.edu;

public class MySQLDAO implements DAO {
	public MySQLDAO() {
		System.out.println("MySQL 생성자");
	}
	@Override
	public String prn() {
		return "MySQL 실행메소드";
	}
}

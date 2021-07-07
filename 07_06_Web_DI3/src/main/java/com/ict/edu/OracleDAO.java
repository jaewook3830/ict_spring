package com.ict.edu;

public class OracleDAO implements DAO {
	public OracleDAO() {
		System.out.println("오라클 생성자");
	}
	@Override
	public String prn() {
		return "오라클 실행메소드";
	}
}

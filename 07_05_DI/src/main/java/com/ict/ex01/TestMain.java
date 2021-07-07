package com.ict.ex01;

public class TestMain {
	public static void main(String[] args) {
		// Service service = new Service();
		// biz 안에 있는 dao.prn()에서 dao가 지정되지 않아서 오류가 발생한다.
		// service.biz();
		
		
		/*
		// 생성자를 이용하거나 setter를 이용해서 dao를 지정할 수 있다.
		OracleDAO oracleDAO = new OracleDAO();
		Service service = new Service(oracleDAO);
		service.biz();
		System.out.println("================");
		
		// setter를 이용
		MySQLDAO mySQLDAO = new MySQLDAO();
		Service service2 = new Service();
		service2.setDao(mySQLDAO);
		service2.biz();
		*/
		DAO dao = null;
		int su = 1;
		switch (su) {
		case 1 : dao = new OracleDAO();
			break;
		case 2 : dao = new MySQLDAO();
			break;
		}
		// 생성자나 setter를 이용할 수 있다.
		Service service = new Service(dao);
		service.biz();
	}
}

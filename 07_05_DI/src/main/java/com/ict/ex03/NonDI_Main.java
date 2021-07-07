package com.ict.ex03;

public class NonDI_Main {
	public static void main(String[] args) {
		NonDI_MyProcess process = new NonDI_MyProcess();
		process.prn();
		System.out.println("=============");
		
		// 생성자를 이용해서 변수값을 설정
		NonDI_MyProcess process2 = new NonDI_MyProcess("둘리",4);
		process2.prn();
		System.out.println("=============");
		
		// setter를 이용해서 변수값을 설정
		NonDI_MyProcess process3 = new NonDI_MyProcess();
		process3.setName("마이콜");
		process3.setAge(34);
		process3.prn();		
	}
}

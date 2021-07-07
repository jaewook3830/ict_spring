package com.ict.ex04;

public class DI_Array {
	String[] arr1;
	int[] arr2;
	
	// 실핼하고 싶은 메소드 1
	public void s_prn() {
		for(String k : arr1) {
			System.out.println(k+10);
		}
	}
	// 실핼하고 싶은 메소드 2
	public void i_prn() {
		for(int k : arr2) {
			System.out.println(k+10);
		}
	}
	public String[] getArr1() {
		return arr1;
	}
	public void setArr1(String[] arr1) {
		this.arr1 = arr1;
	}
	public int[] getArr2() {
		return arr2;
	}
	public void setArr2(int[] arr2) {
		this.arr2 = arr2;
	}
}

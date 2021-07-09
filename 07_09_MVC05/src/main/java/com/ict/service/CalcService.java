package com.ict.service;

import org.springframework.stereotype.Service;

@Service("cale")
public class CalcService {
	
	public int add(String s1, String s2) {
		int su1 = Integer.parseInt(s1);
		int su2 = Integer.parseInt(s2);
		return su1 + su2 ;
	}
	public int sub(String s1, String s2) {
		int su1 = Integer.parseInt(s1);
		int su2 = Integer.parseInt(s2);
		
		return su1 - su2 ;
	}
	public int mul(String s1, String s2) {
		int su1 = Integer.parseInt(s1);
		int su2 = Integer.parseInt(s2);
		
		return su1 * su2 ;
	}
	public double div(String s1, String s2) {
		double su1 = Double.parseDouble(s1);
		double su2 = Double.parseDouble(s2);
		
		return ((su1 / su2)*10)/10.0 ;
	}
}

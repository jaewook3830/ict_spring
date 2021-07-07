package com.ict.ex05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DI_Map {
	Map<String, String> map = new HashMap<String, String>();

	// 실행하고 싶은 메소드
	public void prn() {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(map.get(key));
		}
	}
	
	// setter
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
}

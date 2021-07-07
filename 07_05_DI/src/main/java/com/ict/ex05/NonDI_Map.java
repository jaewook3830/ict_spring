package com.ict.ex05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NonDI_Map {
	Map<String, String> map = new HashMap<String, String>();
	
	public void input() {
		map.put("name", "홍길동");
		map.put("kor", "90");
		map.put("eng", "80");
		map.put("math", "90");
	}
	
	// 실행하고 싶은 메소드
	public void prn() {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(map.get(key));
		}
	}
}

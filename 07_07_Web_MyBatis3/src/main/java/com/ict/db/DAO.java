package com.ict.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

public class DAO {
	// DB접속 정보와 mapper.xml의 위치 정보를 가지고 객체가 생성됨
	private SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public List<VO> getDynamic(String search, String keyword){
		List<VO> list = null;
		Map<String, String> map = new HashMap<String, String>();
		map.put("search", search);
		map.put("keyword", keyword);
		list = sqlSessionTemplate.selectList("list", map);
		return list;
	}
}

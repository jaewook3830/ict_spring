package com.ict.db;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class DAO {
	// DB접속 정보와 mapper.xml의 위치 정보를 가지고 객체가 생성됨
	private SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	// DB 처리하는 메소드들 (SqlSession과 같음)
	public List<VO> getList() {
		List<VO> list = null;
		list = sqlSessionTemplate.selectList("list");
		return list;
	}
	public int getInsert(VO vo) {
		int result = 0;
		result = sqlSessionTemplate.insert("insert", vo);
		return result;
	}
}

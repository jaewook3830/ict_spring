package com.ict.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.vo.VO;

@Repository
public class MyDAOImpl implements MyDAO{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public int selectCount() throws Exception {
		return sqlSessionTemplate.selectOne("count");
	}
	
	@Override
	public List<VO> selectList(int begin, int end) throws Exception {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("begin", begin);
		map.put("end", end);
		return sqlSessionTemplate.selectList("list", map);
	}
	
	@Override
	public int insertVO(VO vo) throws Exception {
		return sqlSessionTemplate.insert("insert", vo);
	}
	
	@Override
	public VO selectVOOneList(String idx) throws Exception {
		return sqlSessionTemplate.selectOne("onelist", idx);
	}
	
	@Override
	public int selectPwdchk(VO vo) throws Exception {
		return sqlSessionTemplate.selectOne("pwd_chk", vo);
	}
	
	@Override
	public int deleteVO(String idx) throws Exception {
		return sqlSessionTemplate.delete("delete", idx);
	}
	
	@Override
	public int updateVO(VO vo) throws Exception {
		return sqlSessionTemplate.update("update", vo);
	}
	
	@Override
	public int updateHit(String idx) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateLevUp(Map<String, Integer> map) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int insertAns(VO vo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteAns(String idx) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
}
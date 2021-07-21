package com.ict.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.vo.CVO;
import com.ict.vo.MVO;
import com.ict.vo.VO;

@Repository
public class MyDAOImpl implements MyDAO {
	@Autowired 
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<VO> selectAll(String category) throws Exception {
		return sqlSessionTemplate.selectList("list", category);
	}
	@Override
	public VO selectVO(String idx) throws Exception {
		return sqlSessionTemplate.selectOne("onelist", idx);
	}
	@Override
	public MVO selectMVO(MVO mvo) throws Exception {
		return sqlSessionTemplate.selectOne("mvolist", mvo);
	}
	@Override
	public CVO selectCart(CVO c_vo) throws Exception {
		return sqlSessionTemplate.selectOne("cvolist", c_vo);
	}
	@Override
	public int insertCart(CVO c_vo) throws Exception {
		return sqlSessionTemplate.insert("cartinsert", c_vo);
	}
	@Override
	public int updateCart(CVO cvo) throws Exception {
		return sqlSessionTemplate.update("cartupdate", cvo);
	}
	@Override
	public List<CVO> selectCartList(String id) throws Exception {
		return sqlSessionTemplate.selectList("cartList", id);
	}
	@Override
	public int deleteCart(CVO cvo) throws Exception {
		return sqlSessionTemplate.delete("cartdelete", cvo);
	}
	@Override
	public int updateCartAmount(CVO cvo) throws Exception {
		return sqlSessionTemplate.update("cartamountupdate", cvo);
	}
}

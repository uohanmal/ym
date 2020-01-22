package com.yellsmusic.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.yellsmusic.domain.YellsmusicVO;


@Repository
public class YellsmusicDAOImpl implements YellsmusicDAO 
{
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.yellsmusic.mappers.yellsmusic";

	
	// 게시물목록
	@Override
	public List<YellsmusicVO> list() throws Exception 
	{
		return sql.selectList(namespace +".list");
	}

}
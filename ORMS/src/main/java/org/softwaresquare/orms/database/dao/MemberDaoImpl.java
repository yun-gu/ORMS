package org.softwaresquare.orms.database.dao;

import org.apache.ibatis.session.SqlSession;
import org.softwaresquare.orms.database.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public boolean getAuthorization(MemberDto member) {
		this.sqlSession.getMapper(MemberDao.class).getAuthorization(member);
		return false;
	}

}

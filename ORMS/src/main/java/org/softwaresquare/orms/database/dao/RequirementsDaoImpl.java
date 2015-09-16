package org.softwaresquare.orms.database.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.softwaresquare.orms.database.dto.RequirementsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RequirementsDaoImpl implements RequirementsDao {
	@Autowired
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	
	@Override
	public List<RequirementsDto> getRequirements(int memberIdx, int projectIdx) {
		return this.sqlSession.getMapper(RequirementsDao.class).getRequirements(memberIdx, projectIdx);
	}

}

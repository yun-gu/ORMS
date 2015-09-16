package org.softwaresquare.orms.service;

import java.util.List;

import org.softwaresquare.orms.database.dao.RequirementsDaoImpl;
import org.softwaresquare.orms.database.dto.RequirementsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequirementsService {
	@Autowired
	private RequirementsDaoImpl requirementsDao;
	
	/**
	 * 요구사항 리스트 불러오기 
	 * @param memberIdx
	 * @param projectIdx
	 * @return
	 */
	public List<RequirementsDto> getRequirementsList(int memberIdx, int projectIdx) {
		return this.requirementsDao.getRequirements(memberIdx, projectIdx);
	}
}

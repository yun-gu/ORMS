package org.softwaresquare.orms.database.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.softwaresquare.orms.database.dto.RequirementsDto;

public interface RequirementsDao {
	List<RequirementsDto> getRequirements(@Param("memberIdx") int memberIdx, @Param("projectIdx") int projectIdx);
}

package org.softwaresquare.orms.database.dao;

import org.softwaresquare.orms.database.dto.MemberDto;

public interface MemberDao {
	boolean getAuthorization(MemberDto member);	//spring security로 변경할 것 

}

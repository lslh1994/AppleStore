package com.springlec.base.dao;

import java.util.List;

import com.springlec.base.model.MemberDto;

public interface MemberDao {
	/*
	 * Description 	: Customer DB 를 사용하는 DAO interface 
	 * Detail 		: 
	 * 					1.
	 * Author		:
	 * Date			:
	 * Update 		:
	 * 
	 */
	//customer 정보일치 여부 
	public String memberChkDao(String userId, String userPw) throws Exception ;

}

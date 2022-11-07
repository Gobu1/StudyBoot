package com.iu.home.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
//	public MemberVO getLogin(MemberVO memberVO)throws Exception{
//		return memberMapper.getLogin(memberVO);
//	}
	
	public int setAdd(MemberVO memberVO)throws Exception{
		int result = memberMapper.setAdd(memberVO);
		result = memberMapper.setMemberRole(memberVO);
		return result;
	}
	
	public int getIdCheck(MemberVO memberVO)throws Exception{
		return memberMapper.getIdCheck(memberVO);
	}

}

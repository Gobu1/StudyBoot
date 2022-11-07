package com.iu.home.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Mapper
public interface MemberMapper {
	
	public MemberVO getLogin(String username)throws UsernameNotFoundException;
	
	public int getIdCheck(MemberVO memberVO)throws Exception;
	
	public int setMemberRole(MemberVO memberVO)throws Exception;
	
	public int setAdd(MemberVO memberVO)throws Exception;
}

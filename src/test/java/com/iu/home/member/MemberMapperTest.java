package com.iu.home.member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class MemberMapperTest {
	
	@Autowired 
	private MemberMapper memberMapper;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Test
	void test()throws Exception{
		MemberVO memberVO = new MemberVO();
		memberVO.setId("ADMIN1");
		memberVO.setPw(passwordEncoder.encode("ADMIN1"));
		memberVO.setName("admin1");
		memberVO.setEmail("admin@admin");
		memberMapper.setAdd(memberVO);
	}
}

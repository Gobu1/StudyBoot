package com.iu.home.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MemberSecurityService implements UserDetailsService {

	@Autowired
	private MemberMapper memberMapper;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		MemberVO memberVO = new MemberVO();
//		memberVO.setId(username);

		MemberVO memberVO = memberMapper.getLogin(username);
		log.info("MemberVO => {}", memberVO);
		
		
		
		return memberVO;
	}

}

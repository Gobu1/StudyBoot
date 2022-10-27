package com.iu.home.member;

import lombok.Data;

@Data
public class MemberVO {
	
	public String id;
	public String pw;
	public String name;
	public String email;
	public boolean enabled;
	public int num;
}

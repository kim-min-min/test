package kr.spring.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import lombok.Data;



@Data
public class CustomUser extends User {
	// Spring Security Context 내부에 저장될 데이터 타입(User 타입)
	// 그러기위해 User타입으로 변환해줄 클래스
	
	private Member member;
	

	public CustomUser(Member member) {
		super(member.getUsername(), member.getPassword(), 
				AuthorityUtils.createAuthorityList(member.getRole().toString()));
	
		
		this.member = member;
		
		
	}
	
	
}

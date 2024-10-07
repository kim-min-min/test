package kr.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Member {
	
	@Id
	private String username;  //Spring Security에서는 id가 아닌 username을 사용
	
	private String password;  //Spring Security에서는 password 사용
	
	private String name;
	
	private Role role;
	
		
}

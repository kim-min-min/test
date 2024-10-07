package kr.spring.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity  // hibernate가 아래 vo 설계대로 테이블을 생성하기 위한 키워드
public class Board {
	
	@Id // Primary-key 설정
	@GeneratedValue(strategy= GenerationType.IDENTITY) // Auto_increment
	private Long idx;
	
	private String title;
	
	@Column(length=2000)
	private String content;
	
	@Column(updatable = false) // 수정할때 작성자는 수정 안되게 하겠다
	private String writer;
	
	// 날짜는 입력할때 기본 값으로 now() 함수를 사용하며 수정이 안되게 하겠다
	@Column(insertable = false, updatable = false, columnDefinition = "datetime default now()" )
	private Date indate;
	
	@Column(insertable = false, updatable = false, columnDefinition = "int default 0" )
	private Long count;
	
}

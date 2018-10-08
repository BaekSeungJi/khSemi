package dto;

import java.io.Serializable;

/*
DROP TABLE MEMBER
CASCADE CONSTRAINTS;

CREATE TABLE MEMBER(
	ID VARCHAR2(50) PRIMARY KEY,
	PWD VARCHAR2(50) NOT NULL,
	NAME VARCHAR2(50) NOT NULL,
	EMAIL VARCHAR2(50) UNIQUE,
	PHONE VARCHAR2(50) NOT NULL,
	BLACKLIST NUMBER(1) NOT NULL,
	AUTH NUMBER(1) NOT NULL
);
*/

public class MemberDto implements Serializable{
	
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String phone;
	private int blacklist;	// true == 1, false == 0
	private int auth;		// 운영자 == 1, 개별 관리자== 2, 유저 == 3
	

}

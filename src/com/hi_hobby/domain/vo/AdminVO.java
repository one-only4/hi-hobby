package com.hi_hobby.domain.vo;

public class AdminVO {
	private int adminNum;	// 관리자 고유번호
	private String adminId;	// 관리자 아이디
	private String adminPw;	// 관리자 비밀번호
	private int classNum;	// 클래스 번호 가져오기
	
	public AdminVO() {;}

	public int getAdminNum() {
		return adminNum;
	}

	public void setAdminNum(int adminNum) {
		this.adminNum = adminNum;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	
	
}

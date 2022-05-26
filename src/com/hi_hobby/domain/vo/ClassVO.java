package com.hi_hobby.domain.vo;

public class ClassVO {
	private int classNum;			// 클래스 고유 번호
	private String classNickname;	// 클래스 생성자 닉네임
	private String classTitle;		// 클래스 제목
	private String classCategory;	// 클래스 카테고리
	private String classPlace;		// 원데이 클래스 장소
	private int classPrice;			// 클래스 가격
	private String classStart;		// 시작시간 (시간 자료형)
	private String classEnd;		// 끝나는 시간(시간 자료형)
	private boolean classApprove;	// 승인 여부
	private String classImg;		// 이미지 자료형
	private int userNum;			// 유저 고유번호(크리에이터 정보를 가져오기 위해)
	
	public void ClassVO() {;}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public String getClassNickname() {
		return classNickname;
	}

	public void setClassNickname(String classNickname) {
		this.classNickname = classNickname;
	}

	public String getClassTitle() {
		return classTitle;
	}

	public void setClassTitle(String classTitle) {
		this.classTitle = classTitle;
	}

	public String getClassCategory() {
		return classCategory;
	}

	public void setClassCategory(String classCategory) {
		this.classCategory = classCategory;
	}

	public String getClassPlace() {
		return classPlace;
	}

	public void setClassPlace(String classPlace) {
		this.classPlace = classPlace;
	}

	public int getClassPrice() {
		return classPrice;
	}

	public void setClassPrice(int classPrice) {
		this.classPrice = classPrice;
	}

	public String getClassStart() {
		return classStart;
	}

	public void setClassStart(String classStart) {
		this.classStart = classStart;
	}

	public String getClassEnd() {
		return classEnd;
	}

	public void setClassEnd(String classEnd) {
		this.classEnd = classEnd;
	}

	public boolean isClassApprove() {
		return classApprove;
	}

	public void setClassApprove(boolean classApprove) {
		this.classApprove = classApprove;
	}

	public String getClassImg() {
		return classImg;
	}

	public void setClassImg(String classImg) {
		this.classImg = classImg;
	}

	public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	
	
}
package com.blog.user.model.vo;

public class User {
	private int userNo;
	private String userId;
	private String userPw;
	private String nickname;
	private String email;
	private String grade;
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public User(int userNo, String userId, String userPw, String nickname, String email, String grade) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPw = userPw;
		this.nickname = nickname;
		this.email = email;
		this.grade = grade;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", userId=" + userId + ", userPw=" + userPw + ", nickname=" + nickname
				+ ", email=" + email + ", grade=" + grade + "]";
	}
	
	
}

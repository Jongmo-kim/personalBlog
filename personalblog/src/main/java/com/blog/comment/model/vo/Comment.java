package com.blog.comment.model.vo;

import java.sql.Date;

import com.blog.user.model.vo.User;

public class Comment {
	private int commentNo;
	private User user;
	private String commentContent;
	private Date regDate;
	public Comment(int commentNo, User user, String commentContent, Date regDate) {
		super();
		this.commentNo = commentNo;
		this.user = user;
		this.commentContent = commentContent;
		this.regDate = regDate;
	}
	public Comment() {
		super();
	}
	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Comment [commentNo=" + commentNo + ", user=" + user + ", commentContent=" + commentContent
				+ ", regDate=" + regDate + "]";
	}
	
	
}

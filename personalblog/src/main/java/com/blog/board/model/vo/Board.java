package com.blog.board.model.vo;

import java.sql.Date;
import java.util.ArrayList;

import com.blog.category.model.vo.Category;
import com.blog.comment.model.vo.Comment;
import com.blog.user.model.vo.User;

public class Board extends Category{
	private int boardNo;
	private ArrayList<Comment> commentList;
	private User user;
	private String boardTitle;
	private String boardContent;
	private Date regDate;
	public Board(int categoryNo, String categoryName, int boardNo, ArrayList<Comment> commentList, User user,
			String boardTitle, String boardContent, Date regDate) {
		super(categoryNo, categoryName);
		this.boardNo = boardNo;
		this.commentList = commentList;
		this.user = user;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.regDate = regDate;
	}
	public Board(int categoryNo, String categoryName) {
		super(categoryNo, categoryName);
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public ArrayList<Comment> getCommentList() {
		return commentList;
	}
	public void setCommentList(ArrayList<Comment> commentList) {
		this.commentList = commentList;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", commentList=" + commentList + ", user=" + user + ", boardTitle="
				+ boardTitle + ", boardContent=" + boardContent + ", regDate=" + regDate + "]";
	}
	
}

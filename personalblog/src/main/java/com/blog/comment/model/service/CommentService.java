package com.blog.comment.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.comment.model.dao.CommentDao;

@Service
public class CommentService {
	@Autowired
	private CommentDao dao;
}

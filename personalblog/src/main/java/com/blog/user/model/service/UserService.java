package com.blog.user.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.user.model.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
}

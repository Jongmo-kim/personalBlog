package com.blog.category.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.category.model.dao.CategoryDao;

@Service
public class CategoryService {

	@Autowired
	private CategoryDao dao;
}

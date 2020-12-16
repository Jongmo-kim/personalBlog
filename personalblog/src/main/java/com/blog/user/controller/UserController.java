package com.blog.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.user.model.service.UserService;
import com.blog.user.model.vo.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping("/joinFrm.do")
	public String joinFrm() {
		return "/user/joinFrm";
	}
	
	@RequestMapping("/join.do")
	public String join(User u) {
		System.out.println(u);
		return "redirect:/";
	}
	
	@RequestMapping("/login.do")
	public String login(HttpSession session) {
		session.setAttribute("loginUser", new User(0, "1234", "1234", "1234", "1234", "관리자"));
		return "redirect:/";
	}
	
	@RequestMapping("/logout.do")
	public String logout(int userNo) {
		System.out.println(userNo);
		return "redirect:/";
	}
	
	@RequestMapping("/selectAll.do")
	public String selectAll() {
		return "user/selectAll";
	}
	
	@RequestMapping("/mypageFrm.do")
	public String mypageFrm() {
		return "user/mypageFrm";
	}
	@RequestMapping("/update.do")
	public String update() {
		return "redirect:/";
	}
	
	@RequestMapping("/delete.do")
	public String delete(int userNo) {
		return "redirect:/";
	}
}

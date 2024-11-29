package com.tap.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.dao.StudentDAO;
import com.tap.daoimpl.StudentDAOImpl;
import com.tap.entity.Student;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		
		StudentDAO studentDAO=new StudentDAOImpl();
		
	Student s = studentDAO.fetch(email);
	if(s!=null && s.getPassword().equals(password)) {
		resp.sendRedirect("loginSuccess.html");
	}
	else {
		resp.sendRedirect("invalid.html");
	}
		
	}

}

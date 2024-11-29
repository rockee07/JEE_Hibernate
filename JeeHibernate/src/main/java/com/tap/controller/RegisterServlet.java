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

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String password=req.getParameter("password");
		String cpassword=req.getParameter("cpassword");
		
		if(password.equals(cpassword)) {
			String name=req.getParameter("name");
			String email=req.getParameter("email");
			String phonenumber=req.getParameter("phonenumber");
			String address=req.getParameter("address");
			
			Student s = new Student(name,email,phonenumber,address,password);
			
			StudentDAO studentDAO = new StudentDAOImpl();
			
			int status = studentDAO.add(s);
			if(status != 0) {
				resp.sendRedirect("success.html");
			}
			else {
				resp.sendRedirect("failure.html");
			}
			
		}
		else {
			resp.sendRedirect("IncorrectPass.html");
		}
	}
   

}

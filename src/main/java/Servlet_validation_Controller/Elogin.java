package Servlet_validation_Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Servlet_validation_Dao.Dao;
import Servlet_validation_Dto.Dto;
@WebServlet("/login")
public class Elogin extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String email=req.getParameter("Email");
		String password=req.getParameter("password");
		int pwd=Integer.parseInt(password);
		Dao dao= new Dao();
		 Dto dto= dao.login(email);
		// int pwd1=dto.getPassword();
		if(dto!=null) {
			if(dto.getPassword()==pwd) {
				resp.getWriter().print("<h1>welcome to page</h1>");
				resp.sendRedirect("https://www.facebook.com/");
			}
			else {
				resp.getWriter().print("<h1>enter proper password</h1>");
				RequestDispatcher dr=req.getRequestDispatcher("login.html");
				dr.include(req,resp);
			}
			
		} else {
			resp.getWriter().print("<h1> account not found,please sign up</h1><a href='signup.html'>click here to signup </a>");
			
		}
		 }
	}



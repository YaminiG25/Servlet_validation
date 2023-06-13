package Servlet_validation_Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Servlet_validation_Dao.Dao;
import Servlet_validation_Dto.Dto;

@WebServlet("/signup")
public class Esignup extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	String name=req.getParameter("Ename");
	String email=req.getParameter("Email");
	String password=req.getParameter("password");
	  int pwd= Integer.parseInt(password);
	
	Dto d=new Dto();
	d.setEmail(email);
	d.setEname(name);
	d.setPassword(pwd);
	
	Dao a=new Dao();
	a.signup(d);
	
		
	}

}

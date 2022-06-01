package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyData extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name") ;
		String email = req.getParameter("email") ;
		String phone = req.getParameter("phone") ;
		String password = req.getParameter("password") ;
		
		PrintWriter printWriter = res.getWriter() ;
		
		
		String myData = "<html><body><h1 style=\"color: red;\">Welcome to "+name+"<br>"
				+ "Email : "+email+"<br>"
						+ "Phone : "+phone+"<br>"
								+ "Password : "+password+" </h1></body></html>" ;
		
		
		printWriter.write(myData);
		
		
	}

}

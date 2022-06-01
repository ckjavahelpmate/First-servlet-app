package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Registration extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name") ;
		String email = req.getParameter("email") ;
		String phone = req.getParameter("phone") ;
		String gender = req.getParameter("gender") ;
		String country = req.getParameter("country") ;
		String password = req.getParameter("password") ;
		
		
		
		PrintWriter printWriter = res.getWriter() ;
		
		String myData = "<html><body><h1 style=\"color: blue;\">Welcome to "+name+"<br>"
				+ "Email : "+email+"<br>"
				+ "Phone : "+phone+"<br>"
				+ "Gender : "+gender+"<br>"
				+ "Password : "+password+"<br>"
				+ "country : "+country+" </h1></body></html>" ;
		
		
		printWriter.write(myData);
		
//		System.out.println( name );
//		System.out.println( email );
//		System.out.println( phone );
//		System.out.println( gender );
//		System.out.println( password );
//		System.out.println( country );
		
	}

}

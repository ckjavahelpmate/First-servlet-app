package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Bed extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String htmlCode = "<html><body><h1>Welcome to Bed</h1></body></html>" ;

		PrintWriter printWriter = res.getWriter() ;

		printWriter.write(htmlCode);

	}

}

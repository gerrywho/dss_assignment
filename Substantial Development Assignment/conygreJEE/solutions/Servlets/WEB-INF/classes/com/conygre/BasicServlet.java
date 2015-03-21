package com.conygre;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class BasicServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
										throws ServletException, IOException
    {
		res.setContentType("text/html");

		ServletOutputStream out = res.getOutputStream();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Random Numbers</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Here are 10 random numbers between 0 and 10</h1>");

		for (int i=0; i<10; i++)
		{
			out.println("<br>Number " + (i+1) + " is " + (Math.random() * 10));
		}
		out.println("</body>");
        out.println("</html>");

    }



}


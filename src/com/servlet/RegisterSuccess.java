package com.servlet;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterSuccess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String password=request.getParameter("pwd");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<link href=css/style.css rel=stylesheet type=text/css>"); 
		out.println("<body");
		out.println("<h1><marquee behavior=\"scroll\" direction=\"left\" scrollamount=\"10\">");
		out.println("<font size=15px><b>Please verify below entered details.</b></font>");
		out.println("</marquee></h1>");
		out.println("<br><br><br><table>");
		out.println("<tr>");
		out.println("<td>First Name</td>"+"<td>"+fname+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Last Name</td>"+"<td>"+lname+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Email ID</td>"+"<td>"+email+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Gender</td>"+"<td>"+gender+"</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		out.println("<br><br><br>");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/DynamicWebProject","root","");
			String sql="insert into registration values (?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email);
			ps.setString(4, gender);
			ps.setString(5, password);
			boolean isInserted=ps.execute();
			if(!isInserted==true) {
				out.println("<h2>Data stored successfully.<h2><br>");
				out.println("<h2>Use below link to login:</h2>");
				out.println("<a href=\"LoginPage.jsp\">Login Here!</a>");
			}
			else 
				out.println("<h2>Aw Snap! Error encountered.</h2>");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

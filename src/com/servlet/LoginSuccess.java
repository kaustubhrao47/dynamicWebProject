package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginSuccess extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected boolean authenticateDetails(String email,String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/DynamicWebProject","root","");
			String sql="select * from registration where email=? and password=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			int count=0;
			while(rs.next())
				count++;
			if(count>0)
				return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("pwd");
		boolean isValid=authenticateDetails(email,password);
		PrintWriter out=response.getWriter();
		if(isValid) {
			out.println("<html>");
			out.println("<link href=css/style.css rel=stylesheet type=text/css>");
			out.println("<body>");
			out.println("<h2 id=\"grantAccess\">Access Granted! Loading...</h2>");
			out.println("</body>");
			out.println("</html>");
			response.setHeader("Refresh", "5;url=\"https://kaustubhrao47.github.io/index-dark.html\"");
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("/LoginPage.jsp");
			response.setContentType("text/html;charset=UTF-8");
			rd.include(request, response);
			out.println("<font color=red><h3>Incorrect Email ID or Password combination.</h3></font>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

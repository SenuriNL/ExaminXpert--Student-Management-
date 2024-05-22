package com.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Customerinsert
 */
@WebServlet("/studentinsert")
public class Studentinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// This is used to catch data cming from customerinsert jsp. the name field in from is used inside inverted commas.
		
		String Sname = request.getParameter("Sname");
		String Semail = request.getParameter("Semail");
		String Sconno = request.getParameter("Sconno");
		String Snic = request.getParameter("Snic");
		String Sdob = request.getParameter("Sdob");
		String Sgender = request.getParameter("Sgender");
		String Saddress = request.getParameter("Saddress");
		String Susername = request.getParameter("Susername");
		String Spassword = request.getParameter("Spassword");
		String proimage = request.getParameter("proimage");
		
//		creating bolean to catch the boolean coming from customerdbutil. calling customerdbutil function
		boolean isTrue;
		
		isTrue = StudentDButil.Insertstudent(Sname,Semail,Sconno,Snic,Sdob,Sgender,Saddress,Susername,Spassword,proimage);
		
//		isTrue function is true only if database connection in CustomerDButil is Success and all data are inersted to database.so directed to success page.
		if (isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
			dis.forward(request, response);
			
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
			
		
		
	}

}

package com.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

///**
// * Servlet implementation class updatecustomerservlet
// */
@WebServlet("/updatecustomerservlet")
public class Studentupdateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("cusid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String conno = request.getParameter("conno");
		String nic = request.getParameter("nic");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		String proimage = request.getParameter("proimage");
		//		parameters passed here are the input type name mentioned in form of updatecustomer.jsp
		
		//updates values are assigned to above variables and then they are updated in the sql table with the sql queries in customerDButil. 
		
		//catch boolean value returning from the updatecustomer method in customerDButil
		
		boolean isTrue;
		//isTrue is a variable.
		
		isTrue = StudentDButil.updatestudent(id, name, email, conno, nic, dob, gender, address, username, password,proimage);
		
		if (isTrue == true) {
			//taking user data when going to useraccount . id parameter is from the variable in above void doPost method
			List<Student> stdDetails = StudentDButil.getStudentDetails(id);
			request.setAttribute("stdDetails",stdDetails);
			//cus details come from items in useraccount.jsp file
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<Student> stdDetails = StudentDButil.getStudentDetails(id);
			request.setAttribute("stdDetails",stdDetails);
			
			//RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
			
		}
	}

}

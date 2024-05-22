/**Login control page.(the page between view and module) this class calls validate method in model class.*/

package com.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class StudentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//There should be a method to catch the username and password coming from login.jsp
		String username = request.getParameter("username"); /**uid comes from the name uid in form(login.jsp)**/
		String password = request.getParameter("password");
		
		try {
//			There should be a method to go from loginservlet.java to customerdbutil.java
			/**call validate method in customerdbutil. list is created to return values from customer arraylist.**/
			List<Student> stdDetails =StudentDButil.validate(username, password);
		
			/**what to  show in useraccount.jsp**/
			request.setAttribute("stdDetails", stdDetails); /**second parameter should be the object created in above line and 1 st parameter can be any**/
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		/**giving the navigate page(useraccount.jsp) from servlet page**/
		RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
		dis.forward(request, response); /**dis is the object of requestdispatcher method**/
		
		
		
		
		
		
		
		
	}

}

package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAOUtilities.DAOConnection;
import DAOUtilities.DAOStudent;
import DAOUtilities.DAOUsernamePassword;

@WebServlet("/Logon")
public class LogOn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DAOUsernamePassword daostu=DAOConnection.getUsernamePassword();
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		boolean userpass=daostu.getUsernamePassword(username, password);
		
		if(userpass)
		{
			response.sendRedirect("addStudent.jsp");
		}
		else
		{
			response.sendRedirect("logOn.jsp");
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

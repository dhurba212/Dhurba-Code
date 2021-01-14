package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAOUtilities.DAOConnection;
import DAOUtilities.DAOStudent;
import teluskoAgain.Student;
@WebServlet("/AddStudent")
public class AddStudentServlet extends HttpServlet{
	
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			response.sendRedirect("addStudent.jsp");
		}

		public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
		{
			DAOStudent daostudent= DAOConnection.getDAOStudentImpl();
			HttpSession session = request.getSession();
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			int schoolid=Integer.parseInt(request.getParameter("schoolid"));
			
			Student student= new Student(fname,lname,schoolid);
			try
			{
				daostudent.addStudent(student);
				
				//response.getWriter().println(student);
				session.setAttribute("addmessage", "Student successfully added");
				response.sendRedirect("addStudent.jsp");
			}
			catch(Exception e)
			{
				session.setAttribute("addmessage", "unable to add student.");
				e.printStackTrace();
				response.sendRedirect("addStudent.jsp");
			}
			
			
		}
}

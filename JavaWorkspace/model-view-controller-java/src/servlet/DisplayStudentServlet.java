package servlet;
import model.Student;

import java.io.IOException;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOImplStudent;
import dao.DAOStudent;
import model.Student;

@WebServlet(description="displaying all the student",urlPatterns={"/displayanimal"})

public class DisplayStudentServlet extends HttpServlet{
	
	private static final long serialversionUID=1L;

	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		DAOStudent daoistudent= new DAOImplStudent();
		
		List<Student>allstudent=daoistudent.GetAllStudent();
		
		req.getSession().setAttribute("allstudent",allstudent);
		
		req.getRequestDispatcher("diaplaystudent.jsp").forward(req, res);
		
		res.getWriter().println("hello");
		res.getWriter().println("hello");
	}
	
	
	
}

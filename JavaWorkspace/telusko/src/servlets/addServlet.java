package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class addServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		
		int add=num1+num2;
		
		//using getRequestDispatcher to pass request to another servlet.
		//using request.setAttribute to pass value along with the dispatcher in key value pair.
		//getRequestDispatcher is calling the other servlet so the other servlet is displayed to user
		
		/*request.setAttribute("add", add);
		
		request.getRequestDispatcher("square").forward(request,response);
		*/
		
		//we can redirect from one servlet to another using sendRedirect in 3 ways
		//1)url rewriting, 2)cookies 3)session
		
		//url
		/*
		response.sendRedirect("square?add="+add);//url rewriting 
		*/
		
		//session
		/*
			HttpSession session = request.getSession();
			session.setAttribute("add",add);
		
			response.sendRedirect("square");
		*/
		
		//cookie
		
			Cookie cookie = new Cookie("add",add+"");//because cookie takes string as value
			response.addCookie(cookie);
			response.sendRedirect("square");
		
	}
	
}

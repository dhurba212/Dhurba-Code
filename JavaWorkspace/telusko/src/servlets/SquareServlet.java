package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class SquareServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		//transferring from one servlet to other using getRequestDispatcher()
		//this sends request directly to the other servlet internally
		//url wont change because it is the same request thats passed from one servlet to another.
		// we can also pass data as request.setAttribute("key",value)pair and receive it as request.getAttribute("key")
		
		/*int add=(int)request.getAttribute("add");
		int sq=add*add;
		*/
		
		//transferring from one servlet to another using sendRedirect()-3 ways 1)url,2)session 3)cookie
		//this sends response back to the user and then creates new request to call another servlet
		//url will change because we are sending request to another servlet
		
		//we get add from the url that the other servlet sends to that is square?add=value
			/*
			int add=Integer.parseInt(request.getParameter("add"));
			int sq=add*add;
			response.getWriter().println(sq);
			*/
		
		//session
		/*
			HttpSession session= request.getSession();
			int add=(int)session.getAttribute("add");
			int sq=add*add;
			response.getWriter().println(sq);
		*/
		
		//cookie
		
			Cookie cookies[]=request.getCookies();
			int add=0;
			for(Cookie c:cookies)
			{
				if(c.getName().equals("add"))
				{
					add=Integer.parseInt(c.getValue());
				}
			}
			int sq=add*add;
			response.getWriter().println(sq);
		
		
	}
}

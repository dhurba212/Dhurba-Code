package loginExample;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOLogin;
import dao.DAOUtilities;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		String username= request.getParameter("user");
		String password=request.getParameter("password");
		
/*		
 //1 way to do it
		if(username.equalsIgnoreCase("username") && password.equalsIgnoreCase("password"))
		{
			//request.getRequestDispatcher("loginWelcome.jsp").forward(request, response);
			//or we can use sendRedirect as well
			HttpSession session=request.getSession();
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			response.sendRedirect("loginWelcome.jsp");
			//out.println("i am a login servlet");
		}
		else 
		{
			//out.println("Not valid Username or Password");
			response.sendRedirect("loginLogin.jsp");
		}
*/		

//2nd way to do it
	/*	
		try 
		{
			conn=DAOUtilities.getConnection();
			ps=conn.prepareStatement("Select * from usernamepassword");
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				if(rs.getString(1).equals(username) && rs.getString(2).equals(password))
				{
					HttpSession session=request.getSession();
					session.setAttribute("username", username);
					session.setAttribute("password", password);
					response.sendRedirect("loginWelcome.jsp");
				}
			}
			response.sendRedirect("loginLogin.jsp");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
*/
		
//3rd way to do it
		try {
			conn=DAOUtilities.getConnection();
			
			if(DAOLogin.checkLogin(username, password))
				{
					HttpSession session= request.getSession();
					
					session.setAttribute("username", username);
					session.setAttribute("password", password);
					response.sendRedirect("loginWelcome.jsp");
				}
			else
			{
				response.sendRedirect("loginLogin.jsp");
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//PrintWriter out = response.getWriter();
		
	
		
	}
}

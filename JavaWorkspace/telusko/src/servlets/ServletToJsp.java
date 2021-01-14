package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;

@WebServlet("/ServletToJsp")
public class ServletToJsp extends HttpServlet{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
		{
			List<Student>allStudent= new ArrayList<>();
			try
			{
				Class.forName("org.postgresql.Driver");
				String url="jdbc:postgresql://localhost:5432/Example";
				String username="postgres";
				String password="password";
				String sql="select * from student";
				Connection conn= DriverManager.getConnection(url,username,password);
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next())
				{
					Student student = new Student();
					student.setStudentid(rs.getInt(1));
					student.setFirstName(rs.getString(2));
					student.setLastName(rs.getString(3));
					student.setSchoolId(rs.getInt(4));
					
					allStudent.add(student);
				}
				
				
			
				
				
				conn.close();
				ps.close();
				rs.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			
			request.getSession().setAttribute("allstudent", allStudent);
			
			request.getSession().setAttribute("name", "dhurba");
			
			//response.getWriter().println("hello from ServletToJsp");
			request.getRequestDispatcher("servletToJsp.jsp").forward(request,response);
			
		}
}

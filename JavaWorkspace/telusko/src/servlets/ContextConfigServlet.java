package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contconfig")
public class ContextConfigServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		//context
		ServletContext ctx= getServletContext();
		String name=ctx.getInitParameter("name");
		
		//config
		ServletConfig cfg= getServletConfig();
		String phone=cfg.getInitParameter("phone");
		
		PrintWriter out=response.getWriter();
		out.println(name);
		out.println(phone);
	}
}

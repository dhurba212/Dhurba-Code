package filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class nameFilter
 */
@WebFilter("/filterExample")
public class nameFilter implements Filter {

   
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		PrintWriter out = response.getWriter();
		String name=request.getParameter("fname");
		if(name.length()>=3)
		{
			chain.doFilter(request, response);
		}
		else 
		{
			out.println("string length cant be less than 3 digits");
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

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
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class IdFilter
 */
@WebFilter("/filterExample")
public class IdFilter implements Filter {

   
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		HttpServletRequest req= (HttpServletRequest)request;
		//PrintWriter out = response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		//String name=request.getParameter("fname");
		if(id>0)
		{
			chain.doFilter(request, response);
		}
		else 
		{
			
			response.getWriter().println("id should be greater than 0");
		}
		
			
		
		
		
		
		// pass the request along the filter chain
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

package com.cisco;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

/**
 * Servlet Filter implementation class FilterDemo
 */
@WebFilter("/SimpleServlet")
public class FilterDemo extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public FilterDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		LocalTime time1 = LocalTime.now();
		System.out.println("before doFilter");
		// pass the request along the filter chain
		chain.doFilter(request, response); // this sends request to the servlet & gets the response
		LocalTime time2 = LocalTime.now();
		System.out.println("after doFilter: ");
		System.out.println("Time taken: "+Duration.between(time1, time2));
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

package com.ssafy.filiter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

/**
 * Servlet Filter implementation class Myfiliter
 */
public class Myfiliter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public Myfiliter() {
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
		 
		//필터는 체이닝 할 수 있어서 doFilter를 통해 다음으로 간다
		//더 이상 갈 필터가 없으면 ? 서블릿으로 보낸다.
		chain.doFilter(request, response);
		//사용자에게 가기 전 코드
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig = fConfig;
		// TODO Auto-generated method stub
	}

}

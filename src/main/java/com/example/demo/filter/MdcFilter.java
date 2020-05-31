package com.example.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.MDC;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MdcFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;

		MDC.put("userId", "akash");
		MDC.put("sessionId", request.getSession().getId());
		MDC.put("method", request.getMethod());
		MDC.put("request", request.getRequestURI());

		chain.doFilter(servletRequest, servletResponse);

	}

}
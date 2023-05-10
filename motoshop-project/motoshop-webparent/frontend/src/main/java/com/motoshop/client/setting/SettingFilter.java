package com.motoshop.client.setting;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-123)
public class SettingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest servletRequest = (HttpServletRequest) request;
		String url = servletRequest.getRequestURL().toString();

		// tất cả request đến file css,js,images đều cho phép
		if (url.endsWith(".css") || url.endsWith(".js") || url.endsWith(".png") || url.endsWith(".jpg")) {
			chain.doFilter(request, response);// cho phép request gửi đến controller
			return;
		}

		chain.doFilter(request, response);// cho phép request gửi đến controller

	}

}

package com.dragon.demo.filter;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "SystemFilter", value = {"/*"})
public class SystemFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("com.wmx.servlet.SystemFilter -- 系统启动...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        //转为 HttpServletRequest 输出请求路径
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        System.out.println(" -- 过滤器放行前...." + request.getRequestURL());
        System.out.println(" -- request.getMethod()...." + request.getMethod());

        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println(" -- 过滤器返回后...." + request.getRequestURL());
    }

    @Override
    public void destroy() {
        System.out.println("com.wmx.servlet.SystemFilter -- 系统关闭...");
    }
}

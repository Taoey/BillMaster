package com.tao.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Objects;

public class ExceptionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 是否已经放有异常栈, 避免循环
        boolean isRethrow = !Objects.isNull(request.getAttribute("exception"));
        if (isRethrow) {
            chain.doFilter(request, response);
            return;
        }
        try {
            chain.doFilter(request, response);
        } catch (Exception e) {
            // 发生异常，保存异常栈
            request.setAttribute("exception", e);
            request.getRequestDispatcher("/exception").forward(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}

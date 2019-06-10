package com.tao.config;

import com.tao.filter.ExceptionFilter;
import com.tao.filter.TestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class MyFilterConfig {

    @Bean
    public Filter testFilter() {
        return new TestFilter();
    }
    @Bean
    public Filter exctionFilter() {
        return new ExceptionFilter();
    }

    /**
     * 异常过滤器，优先级最高
     * @return
     */
    @Bean
    public FilterRegistrationBean exceptionRegister() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(exctionFilter());
        registration.addUrlPatterns("/*");
        registration.setName("ExceptionFilter");
        registration.setOrder(1);
        return registration;
    }

    @Bean
    public FilterRegistrationBean someFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(testFilter());
        registration.addUrlPatterns("/*");
        registration.setName("testFilter");
        registration.setOrder(2);
        return registration;
    }
}

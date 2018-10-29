package com.liu.interceptor.practise.interceptor.interceptor;

import com.google.gson.Gson;
import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class BaseInterceptor implements HandlerInterceptor {

    private Long beginTime;

    private Long endTime;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("BaseInterceptor preHandle ...");
        beginTime = System.currentTimeMillis();//计时
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("BaseInterceptor postHandle ...");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("BaseInterceptor afterCompletion ...");
        endTime = System.currentTimeMillis();
        String requestParam = (new Gson().toJson(request.getParameterMap()));    //请求参数
        System.out.println("req String:" + requestParam);


        Long excuteTime = endTime - beginTime;

        UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
        String os = userAgent.getOperatingSystem().getName();    //获取客户端操作系统
        String browser = userAgent.getBrowser().getName();    //获取客户端浏览器

        System.out.println("os:" + os + "browser:" + browser + "excuteTime:" + excuteTime);

    }
}

package cn.com.alibaba.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.sun.net.httpserver.HttpExchange;
import javax.servlet.Filter;

import sun.rmi.runtime.Log;

/**
 * EncodingFilter ���������
 * @author hadoop
 *
 */
public class EncodingFilter implements  Filter{
	 FilterConfig config ;
	 String encoding ;
	 Log log ;
	 /**
	  * ��ʼ�� web.xml ���õĹ��˹���
	  * @param filterConfig
	  */
	 public void init(FilterConfig filterConfig){
		 
	 }
	 
	
	 /**
	  * ע������������
	  */
	 public void destroy(){
		 
	 }
 
	
	 /**
	  * �������
	  * @param request
	  * @param response
	  * @param filterChain
	  */
	public void doFilter(ServletRequest   request
			 ,ServletResponse response
			 ,FilterChain filterChain) throws IOException {
		
	}


}
package cn.com.alibaba.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import sun.rmi.runtime.Log;
import javax.servlet.Filter;

/**
 * LoginFilter ��½������
 * @author hadoop
 *
 */

public class LoginFilter implements Filter{
	private FilterConfig config=null;  //��½���������й��� 
	Log log;
	 
	/**
	 * ��ʼ�����˹���
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
	  * ��½���˹��� �����ƷǷ��û�)
	  * @param request
	  * @param response
	  * @param filterChain
	  */
	public void doFilter(ServletRequest   request
			 ,ServletResponse response
			 ,FilterChain filterChain) throws IOException {
		 
		
	}
 
	
}

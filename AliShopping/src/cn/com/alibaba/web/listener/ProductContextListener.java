package cn.com.alibaba.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import sun.rmi.runtime.Log;

/**
 * ProductContextListener ��Ʒ���ݼ�����
 * @author hadoop
 *
 */
public class ProductContextListener implements HttpSessionListener {
	Log log ;
	
	/**
	 * ��ʼ����ϵͳ������ ������IProductBusiness ��IPayWayBusiness ��IOrderStatusBusiness ��ICategoryBusiness ���ڴ�
	 * @param servletContextEvent
	 */
	public void contextDestroyed(ServletContextEvent servletContextEvent){
		
	}
	
	/**
	 * ע��������
	 * @param servletContextEvent
	 */
	public void contextInitialized(ServletContextEvent servletContextEvent){
		
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		
	}
}

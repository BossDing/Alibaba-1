package cn.com.alibaba.web.listener;

import sun.rmi.runtime.Log;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * CartSessionListener ���ﳵ������
 * @author hadoop
 *
 */

public class CartSessionListener implements HttpSessionListener{
	Log   log;
	
	/**
	 * ��ʼ�����ﳵ����session ��
	 * @param session
	 */
	public void sessionCreated(HttpSessionEvent session){
		
	}
	
	/**
	 * ���� session �й��ﳵ����
	 * @param session
	 */
	public void  sessionDestroyed( HttpSessionEvent session){
		
	}
	
	
}

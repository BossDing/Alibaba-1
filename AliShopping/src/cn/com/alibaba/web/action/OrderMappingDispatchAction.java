package cn.com.alibaba.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.mapper.ActionMapping;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ����������Ŀ�����
 * 
 * @author hadoop
 * @param <ActionForward>
 * 
 */

public class OrderMappingDispatchAction<ActionForward> extends ActionSupport {

	/**
	 *  ɾ���û�����
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward deleteOrder(ActionMapping mapping, 
			HttpServletRequest request, HttpServletResponse response) {

		return null;
	}

	/**
	 *  ��ʾ�û������б�
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward listUserOrders(ActionMapping mapping,  
			HttpServletRequest request, HttpServletResponse response) {
		
				return null;
		
	}

	/**
	 *  ��ʾ������ϸ
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward orderDetail(ActionMapping mapping,  
			HttpServletRequest request, HttpServletResponse response) {
		
		
				return null;
		
	}

	@Override
	public String execute() throws Exception {

		return super.execute();
	}

}

package cn.com.alibaba.dao.impl;

import java.util.List;

import cn.com.alibaba.web.model.OrderStatus;

/**
 * OrderStatusDAOImpl �ṩ����״̬������ݿ�
 * 
 * @author hadoop
 * 
 */
public class OrderStatusDAOImpl {
	String DESCRIPTION;
	String NAME;

	/**
	 * ���ݳ־û��� Pojo ɾ�����ݿ�����Ӧ����
	 * 
	 * @param orderStatus
	 */
	public void delete(OrderStatus orderStatus) {

	}
	
	/**
	 * ����ȫ���Ķ���״̬
	 * @return
	 */
	public List findAllOrderStatus() {
		List list=null;
		return list;
	}

	/**
	 * ͨ���������в���
	 * @param object
	 * @return
	 */
	public List  findByDescription(Object object) {
		List list=null;
		return list;
	}

	/**
	 * ���ݷ��� Pojo ȡ�����ݿ��е���Ӧ����.
	 * @param orderStatus
	 * @return
	 */
	public List  findByExample(OrderStatus orderStatus) {
		List list=null;
		return list;
	}

	/**
	 * ���� Pojo ������ȡ�����ݿ��е���Ӧ����.
	 * @param lg
	 * @return
	 */
	public OrderStatus findById(Long lg) {
		OrderStatus orderStatus = null;
		return orderStatus;
	}
	
	/**
	 * ͨ�����ֽ��в���
	 * @param obj
	 * @return
	 */
	public List findByName(Object obj) {
		List list=null;
		return list;
	}
	
	/**
	 * ���� Pojo ����������Pojo ���Ե�ֵ�����ݿ���ȡ����Ӧ����.
	 * @param str
	 * @param obj
	 * @return
	 */
	public List findByProperty(String str,Object obj ) {
		List list=null;
		return list;
	}

	/**
	 * ������� Pojo �ٴα�ɳ־û��� Pojo
	 * @param orderStatus
	 */
	public void lock(OrderStatus orderStatus) {
		
	}

	/**
	 * ����δ�־û��� Pojo��¼�����ݿ�
	 * @param orderStatus
	 */
	public void save(OrderStatus orderStatus) {

	}
	
	/**
	 * �ϲ������ Pojo�� ʹ����� Pojo �ٴα�ɳ־û��� Pojo.
	 * @param orderStatus
	 * @return
	 */
	public OrderStatus merge(OrderStatus orderStatus) {
		OrderStatus orderStatus1 = null;
		
		
		return orderStatus1;
	}

	/**
	 * ���� Pojo ��״̬�����е�¼���߸��������ݿ�Ĳ���.
	 * @param orderStatus
	 */
	public void saveOrUpdate(OrderStatus orderStatus) {
			
	}
}

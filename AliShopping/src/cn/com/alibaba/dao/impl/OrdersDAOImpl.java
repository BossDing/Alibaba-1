package cn.com.alibaba.dao.impl;

import java.util.List;

import cn.com.alibaba.web.model.Orders;

/**
 * OrdersDAOImpl �ṩ����������ݿ����
 * 
 * @author hadoop
 * 
 */
public class OrdersDAOImpl {
	String COST;
	String NAME;

	/**
	 * ���ݳ־û��� Pojo ɾ�����ݿ�����Ӧ����
	 * 
	 * @param orders
	 */
	public void delete(Orders orders) {

	}

	/**
	 * ����ȫ���Ķ���
	 * @return
	 */
	public List findAllOrders() {
		List list = null;
		return list;
	}

	/**
	 * Find by cost
	 * @param obj
	 * @return
	 */
	public List findByCost(Object obj) {
		List list=null;
		return list;
	}

	/**
	 * ���ݷ��� Pojo ȡ�����ݿ��е���Ӧ����.
	 */
	public List findByExample(Orders orders) {
		List list=null;
		return list;
	}

	/**
	 * ���� Pojo ������ȡ�����ݿ��е���Ӧ����
	 * @param lg
	 * @return
	 */
	public Orders findById(Long lg) {
		Orders orders=null;
		return orders;
	}

	/**
	 * ͨ�����ֽ��в���
	 * @param object
	 * @return
	 */
	public List  findByName(Object object) {
		List list=null;
		return list;
	}

	/**
	 * ���� Pojo ����������Pojo ���Ե�ֵ�����ݿ���ȡ����Ӧ����
	 * @param str
	 * @param obj
	 * @return
	 */
	public List findByProperty(String str, Object obj) {
		List list=null;
		return list;
	}

	/**
	 * ������� Pojo �ٴα�ɳ־û��� Pojo
	 * @param orders
	 */
	public void lock(Orders orders) {

	}

	/**
	 * ����δ�־û��� Pojo��¼�����ݿ�
	 * @param orders
	 */
	public void merge(Orders orders) {
		
	}

	/**
	 * �ϲ������ Pojo�� ʹ����� Pojo �ٴα�ɳ־û��� Pojo
	 * @param orders
	 * @return
	 */
	public Orders save(Orders orders) {
		Orders orders1=null;
		return orders1;
	}

	/**
	 * ���� Pojo ��״̬�����е�¼���߸��������ݿ�Ĳ���
	 * @param orders
	 */
	public void saveOrUpdate(Orders orders) {
		
	}

}

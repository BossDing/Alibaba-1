package cn.com.alibaba.dao.impl;

import java.util.List;

import cn.com.alibaba.web.model.OrderLine;

/**
 * OrderLineDAOImpl �ṩ������ϸ������ݿ����
 * 
 * @author hadoop
 * 
 */
public class OrderLineDAOImpl {
	String AMOUNT;

	/**
	 * ���ݳ־û��� Pojo ɾ�����ݿ�����Ӧ����
	 * @param orderLine
	 */
	public void delete(OrderLine orderLine) {
		
	}

	/**
	 * ȡ��ȫ���Ķ�����ϸ.
	 * @return
	 */
	public List findAllOrderLine() {
		List list = null;
		return list;
	}

	/**
	 * Find by amount.
	 */
	public List  findByAmount(Object object) {
		List list=null;
		return list;
	}
	
	/**
	 * ���ݷ��� Pojo ȡ�����ݿ��е���Ӧ����
	 * @param orderLine
	 * @return
	 */
	public List findByExample(OrderLine orderLine) {
//		List: Pojo �� List 
		List list=null;
		return list;
	}

	/**
	 * ���� Pojo ������ȡ�����ݿ��е���Ӧ����.
	 * @param lg
	 * @return
	 */
	OrderLine findById(Long lg) {
		OrderLine orderLine = null;
		return orderLine;
	}

	/**
	 * ���� Pojo ����������Pojo ���Ե�ֵ�����ݿ���ȡ����Ӧ����
	 * @param str
	 * @param obj
	 * @return
	 */
	public List findByProperty(String str , Object obj) {
		List list=null;
		return list;
	}

	/**
	 * ������� Pojo �ٴα�ɳ־û��� Pojo
	 */
	public void lock(OrderLine orderLine) {
		
	}

	/*
	 * �ϲ������ Pojo�� ʹ����� Pojo �ٴα�ɳ־û��� Pojo
	 */
	public OrderLine merge(OrderLine orderLine) {
		OrderLine orderLine1 =null;
		
		return orderLine1;
	}

	/**
	 * ����δ�־û��� Pojo��¼�����ݿ�.
	 * @param orderLine
	 */
	public void save(OrderLine orderLine) {
		
	}

	/**
	 * ���� Pojo ��״̬�����е�¼���߸��������ݿ�Ĳ���
	 * @param orderLine
	 */
	public void saveOrUpdate(OrderLine orderLine) {
		
	}

}

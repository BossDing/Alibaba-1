package cn.com.alibaba.dao.impl;

import java.util.List;

import cn.com.alibaba.web.model.PayWay;

/**
 * PayWayDAOImpl �ṩ֧����ʽ������ݿ����
 * 
 * @author hadoop
 * 
 */
public class PayWayDAOImpl {
	String PAYSTYLE;

	/**
	 * ���ݳ־û��� Pojo ɾ�����ݿ�����Ӧ����.
	 * 
	 * @param payWay
	 */
	public void delete(PayWay payWay) {

	}

	/**
	 * Method in IPayWayDAO
	 * 
	 * @return
	 */
	public List findAllPayWay() {
		List list = null;
		return list;
	}

	/**
	 * ���ݷ��� Pojo ȡ�����ݿ��е���Ӧ����.
	 * @param payWay
	 * @return
	 */
	public List findByExample(PayWay payWay) {
		List list = null;
		return list;
	}

	/**
	 * ���� Pojo ������ȡ�����ݿ��е���Ӧ����
	 * @param lg
	 * @return
	 */
	public PayWay findById(Long lg) {
		PayWay payWay = null;
		return payWay;
	}

	/**
	 * Find by paystyle.
	 * @param object
	 * @return
	 */
	public List findByPaystyle(Object object) {
		List list= null;
		return list;
	}

	/**
	 * ���� Pojo ����������Pojo ���Ե�ֵ�����ݿ���ȡ����Ӧ����.
	 * @param str
	 * @param obj
	 * @return
	 */
	public List findByProperty(String str,Object obj) {
		List list= null;
		return list;
	}

	/**
	 * ������� Pojo �ٴα�ɳ־û��� Pojz
	 * @param payWay
	 */
	public void lock(PayWay payWay) {

	}

	/**
	 * �ϲ������ Pojo�� ʹ����� Pojo �ٴα�ɳ�
	 * @param payWay
	 * @return
	 */
	public PayWay merge(PayWay payWay ) {
		PayWay payWay1=null;
		
		return payWay1;
	}

	/**
	 * ����δ�־û��� Pojo��¼�����ݿ�.
	 * @param payWay
	 */
	public void save(PayWay payWay) {

	}

	/**
	 * ���� Pojo ��״̬�����е�¼���߸��������ݿ�Ĳ���
	 * @param payWay
	 */
	public void  saveOrUpdate(PayWay payWay) {
		
	}
}

package cn.com.alibaba.biz.impl;

import cn.com.alibaba.web.model.OrderLine;
import cn.com.alibaba.web.model.Orders;
import cn.com.alibaba.web.model.Product;

/**
 * ShoppingCart ���ﳵ����ʵ����
 */
public class ShoppingCart {
	
	public ShoppingCart() {

	}
	/**
	 * ������OrderLine
	 * ���أ�void
	 */
	void addOrdeLine(OrderLine orderLine) {
		
	}
	
	/**
	 * Gets the orders
	 * @return
	 */
	public Orders getOrders() {
		Orders orders = null;
		
		return orders;
	}

	/**
	 * Sets the orders
	 * @param orders
	 */
	public void setOrders(Orders orders) {

	}

	/**
	 * ���ﳵ������һ����Ʒ
	 * @param product
	 * @param x
	 */
	public void addProduct(Product product,int x) {

	}

	/**
	 * ������Ʒ ID �ڹ��ﳵ
	 * @param orderLine
	 */
	public void removeProductById(OrderLine orderLine) {
		
	}
	
	/**
	 * ɾ�����ﳵ�����е���Ʒ
	 * @param log
	 */
	public void removeAllProducts(Long log) {

	}

	/**
	 * Checks if is empty
	 * @return
	 */
	boolean isEmpty() {
		boolean flag = false;
		
		return flag;
	}

	/**
	 * ������Ʒ ID���޸Ĺ��ﳵ�д���Ʒ������
	 * @param log
	 * @param x
	 */
	public void  modifyProductAmountById(Long log ,int x) {
		
	}

	/**
	 * ��ù��ﳵ����Ʒ���ĺϼ�
	 * @return
	 */
	public double getTotalPrice() {
		double all = 0;
		return all;
		
	}

	
	public double getTotalPriceTemp() {
		return 0;
		
	}

	/**
	 * �ӹ��ﳵ�л�ȡ�����б�
	 * @param log
	 * @return
	 */
	public OrderLine findProduct(Long log) {
		OrderLine orderLine = null;
		return orderLine;
	}

	public void setUndoID(String str) {

	}
}

package cn.com.alibaba.dao.impl;

import java.util.List;

import cn.com.alibaba.web.model.Product;

/**
 * ProductDAOImpl �ṩ��Ʒ������ݿ����
 * 
 * @author hadoop
 * 
 */
public class ProductDAOImpl {
	String AUTHOR;
	String BASEPRICE;
	String DESCRIPTION;
	String IMAGES;
	String NAME;
	String PAGES;
	String PUBLISH;

	/**
	 * ���ݳ־û��� Pojo ɾ�����ݿ�����Ӧ����.
	 * @param product
	 */
	public void delete(Product product) {

	}

	/**
	 * �鿴ȫ��ȫ����Ʒ
	 * @return
	 */
	public List findAllProducts() {
		List list=null;
		return list;
	}

	/**
	 * Find by author.
	 * @param object
	 * @return
	 */
	public List  findByAuthor(Object object) {
		List list=null;
		return list;
	}

	/**
	 * Find by baseprice.
	 * @param object
	 * @return
	 */
	public List  findByBaseprice(Object object) {
		List list=null;
		return list;
	}

	/**
	 * Find by Description.
	 * @param object
	 * @return
	 */
	public List  findByDescription(Object object) {
		List list=null;
		return list;
	}

	/**
	 * ���ݷ��� Pojo ȡ�����ݿ��е���Ӧ����.
	 * @param product
	 * @return
	 */
	public List findByExample(Product product) {
		List list=null;
		return list;
	}

	/**
	 * ���� Pojo ������ȡ�����ݿ��е���Ӧ����
	 * @param lg
	 * @return 
	 */
	public Product ProductfindById(Long lg) {
		Product product = null;
		return product;
	}

	/**
	 * Find by images
	 * @param object
	 * @return
	 */
	public List  findByImages(Object object) {
		List list=null;
		return list;
	}

	/**
	 * Find by name.
	 * @param object
	 * @return
	 */
	public List  findByName(Object object ) {
		List list=null;
		return list;
	}
	
	/**
	 * Find by Pages.
	 * @param object
	 * @return
	 */
	public List findByPages(Object object) {
		List list=null;
		return list;
	}

	/**
	 * ���� Pojo ����������Pojo ���Ե�ֵ�����ݿ���ȡ����Ӧ����.
	 * @param str
	 * @param obj
	 * @return
	 */
	public List findByProperty(String str, Object obj) {
		List list=null;
		return list;
	}

	/**
	 * Find by publish
	 * @param obj
	 * @return
	 */
	public List  findByPublish(Object obj) {
		List list=null;
		return list;
	}

	/**
	 * ������� Pojo �ٴα�ɳ־û��� Pojo
	 * @param product
	 */
	public void lock(Product product) {
		
	}

	/**
	 * �ϲ������ Pojo�� ʹ����� Pojo �ٴα�ɳ־û��� Pojo
	 * @param product
	 * @return
	 */
	public Product merge(Product product) {
		Product product1= null;
		
		return product1;
	}
	

	/**
	 * ����δ�־û��� Pojo��¼�����ݿ�
	 * @param product
	 */
	public void save(Product product) {
		
	}

	/**
	 * ���� Pojo ��״̬�����е�¼���߸��������ݿ�Ĳ���
	 * @param product
	 */
	public void saveOrUpdate(Product product) {
		
	}

}

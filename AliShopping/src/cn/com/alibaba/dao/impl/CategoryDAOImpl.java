package cn.com.alibaba.dao.impl;

import java.util.List;

import cn.com.alibaba.web.model.Category;

/**
 * CategoryDAOImpl �ṩ��Ʒ����������ݿ����
 * @author hadoop
 *
 */
public class CategoryDAOImpl {
	String DESCRIPTION;
	String NAME;

	/**
	 * ���ݳ־û��� Pojo ɾ�����ݿ�����Ӧ����.
	 * 
	 * @param category
	 */
	public void delete(Category category) {
		
	}

	/**
	 * ȡ��ȫ������Ʒ����.
	 * 
	 * @return
	 */
	public List findAllCategory() {
		List list = null;
		return list;
	}

	/**
	 * Find by description.
	 * 
	 * @return
	 */
	public List findByDescription(Object obj) {
		List list = null;
		return list;
	}

	/**
	 * �� �� �� ��Pojo ȡ�����ݿ��е���Ӧ����.
	 * 
	 * @param category
	 * @return
	 */
	public List findByExample(Category category) {
		List list = null;
		return list;
	}

	/**
	 * ���� Pojo ������ȡ�����ݿ��е���Ӧ����
	 * 
	 * @param log
	 * @return
	 */
	public Category findById(Long log) {
		Category category = null;
		return category;
	}

	/**
	 * Find by name.
	 * 
	 * @param obj
	 * @return
	 */
	public List findByName(Object obj) {
		List list = null;
		return list;
	}

	/**
	 * ���� Pojo ���� �� �� ��Pojo ���Ե�ֵ�����ݿ���ȡ����Ӧ����
	 * 
	 * @param str
	 * @param obj
	 * @return
	 */
	public List findByProperty(String str, Object obj) {
		List list = null;
		return list;
	}

	/**
	 * ȡ �� �� ��Category ���󼯺ϣ����� �� ǰcategory.id
	 * 
	 * @param log
	 * @return
	 */
	public List getChildCategoryBYFatcherID(Long log) {
		List list = null;
		return list;
	}

	/**
	 * ȡ �� �� ��Category ���󣬸��ݵ�ǰcategory.id
	 * 
	 * @param log
	 * @return
	 */
	public Category getFatcherCategoryBYChildID(Long log) {
		Category category = null;
		
		return category;
	}

	/**
	 * �� �� �� ��Pojo �ٴα�ɳ־û���Pojo.
	 * 
	 * @param category
	 */
	public void lock(Category category) {

	}

	/**
	 * �ϲ������Pojo�� ʹ����� Pojo �ٴα�ɳ־û��� Pojo.
	 * 
	 * @param category
	 * @return
	 */
	public Category merge(Category category) {
		Category category1 = null;
		
		return category1;
	}

	/**
	 * ����δ�־û��� Pojo ��¼�����ݿ�
	 * 
	 * @param category
	 */
	public void save(Category category) {
				
	}

	/**
	 * ���� Pojo ��״̬�����е�¼���߸��������ݿ�Ĳ���.
	 * 
	 * @param category
	 */
	public void saveOrUpdate(Category category) {

	}
}

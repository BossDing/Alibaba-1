package cn.com.alibaba.biz.impl;

import java.util.List;
import java.util.Map;

import cn.com.alibaba.web.model.Category;

public class CategoryBusinessImpl {
	
	public CategoryBusinessImpl() {
	}

	
	/**
	 * ���ݸ���� ID �õ�����û�в�ε��� �� �� �� �� �� �ϣ�LIST
	 */
	List<Category> findAllChildCategoryBYFatcherID() {
		List<Category> list = null;
		
		return list;
	}
	
	/**
	 * �õ����ض���� ID��ʼ����װ�õ���� ����MAP��
	 */
	 Map findTreeBYCategoryID(Long log) {
		Map map = null;
		
		return map;
	}

	/**
	 * ���ݸ����õ�����һ������𼯺ϣ�MAP��
	 * ������Long
	 * ���أ�Map: �� Ʒ �� ��Map
	 */
	Map getChildCategoryBYFatcherID(Long log) {
		Map map = null;
		
		return map;
	}

	/**
	 * ���ݵ�ǰ��� ID �õ������
	 */
	Category getFatcherCategoryBYChildID(Long log) {
		Category category = null;
		return category;
	}

	/**
	 * ������� ID �õ������Ϣ
	 * ������Long
	 * ���أ�Category
	 */
	Category findCategoryBYID(Long log) {
		Category category = null;
		
		return category;
	}
	
}

package cn.com.alibaba.dao.impl;

import java.util.List;

import cn.com.alibaba.web.model.Users;

/**
 * UserDAOImpl �ṩ�û�������ݿ����
 * 
 * @author hadoop
 * 
 */
public class UserDAOImpl {
	String PASSWORD;

	/**
	 * ���ݳ־û��� Pojo ɾ�����ݿ�����Ӧ����
	 * 
	 * @param user
	 */
	public void delete(Users user) {

	}

	/**
	 * Delete user by id
	 * @param str
	 */
	public void  deleteUserById(String str) {
		
	}

	/**
	 * IUserDAO
	 * @return
	 */
	public List findAllUsers() {
		List list=null;
		
		return list;
	}

	/**
	 * ���ݷ��� Pojo ȡ�����ݿ��е���Ӧ����
	 * @param user
	 */
	public List findByExample(Users user) {
		List list=null; //List: Pojo �� Lis
		
		return list;
	}

	/**
	 * ���� Pojo ������ȡ�����ݿ��е���Ӧ����
	 * @param lg
	 * @return
	 */
	public Users findById(Long lg) {
		Users user = null;
		return user;
	}

	/**
	 * Find by name
	 * @param str
	 * @return
	 */
	public Users findByName(String str) {
		Users user = null;
		return user;
	}

	/**
	 * ͨ��������в���
	 * @param object
	 * @return
	 */
	public List  findByPassword(Object object) {
		List list=null; //List: Pojo �� Lis
		
		return list;
	}

	/**
	 * ���� Pojo ����������Pojo ���Ե�ֵ�����ݿ���ȡ����Ӧ����
	 * @param str
	 * @param obj
	 * @return
	 */
	public List findByProperty(String str , Object obj) {
		List list=null; //List: Pojo �� Lis
		
		return list;
	}

	/**
	 * ������� Pojo �ٴα�ɳ־û��� Pojo
	 * @param user
	 */
	public void lock(Users user) {
		
	}

	/**
	 * �ϲ������ Pojo�� ʹ����� Pojo �ٴα�ɳ־û��� Pojo
	 * @param user
	 * @return
	 */
	public Users  merge(Users user) {
		Users user1 = null; 
		return user1;
	}

	/**
	 * �����û� Pojo�� �޸��û�������
	 * @param user
	 */
	public void  modifyUserPassword(Users user) {

	}

	/**
	 * ����δ�־û��� Pojo��¼�����ݿ�
	 * @param user
	 */
	public void save(Users user) {

	}

	/**
	 * ���� Pojo ��״̬�����е�¼���߸��������ݿ�Ĳ���
	 * @param user
	 */
	public void saveOrUpdate(Users user) {

	}

}

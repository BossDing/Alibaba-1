package cn.com.alibaba.biz.impl;

import java.util.List;

import cn.com.alibaba.web.model.Users;

/**
 * UserBusinessImpl �û�����ʵ����
 * @author hadoop
 *
 */
public class UserBusinessImpl {
	
	public UserBusinessImpl() {

	}

	/**
	 * �����û� Pojo�� ɾ����Ӧ�û�
	 * ������String
	 * ���أ�boolean
	 */
	public boolean deleteUserByName(String str) {
		boolean flag = false;
		return flag;
	}

	/**
	 * ȡ��ȫ�����û�
	 * @return
	 */
	public List findAllUsers() {
		List list = null;
		return list;
	}
	
	/**
	 * �����û� ID ȡ����Ӧ���û�
	 * ������String
	 * ���أ�User: �û� Pojo
	 * @param str
	 * @return
	 */
	public Users getUserByName(String str) {
		Users use = null;
		return use;
	}

	/**
	 * ������String
	 * ���أ�boolean: true �� �� ��Ӧ�û�, false ��������Ӧ�û�
	 * @param str
	 * @return
	 */
	public boolean hasUser(String str) {
		boolean flag = false;
		return flag;
	}

	/**
	 * �����û���Ϣ
	 * ������User
	 * ���أ�void
	 */
	public void updateUserInfo(Users user) {
		
	}

	/**
	 * �����û� Pojo ����ϵ��Ϣ Pojo�� ע��һ�����û�
	 */
	public  void userRegister(Users use) {
		
	}
}

package cn.com.alibaba.web.model;

public class AdminInfo {

	/**
	 * AdminID varchar (20) primary key, not null ����Աid 
	 * Password varchar (20)  Not null ����  
	 * AdminName varchar (20) Not null ����Ա���� 
	 * IdentityID varchar (19) Not null ���  
	 * Email varchar (50)      Not null ���� 
	 * ProductEdit Enum{����Ȩ��, ����Ȩ��} Default ��Ȩ ��Ʒ����Ȩ��  
	 * UserEdit Enum{����Ȩ��, ����Ȩ��} Default ��Ȩ �û�����Ȩ�� 
	 * OrderEdit Enum{����Ȩ��, ����Ȩ��} Default ��Ȩ ��������Ȩ�� 
	 * AddAdmin Enum{����Ȩ��, ����Ȩ��} Default ��Ȩ
	 * ��ӹ���ԱȨ��
	 */
	
	private String  AdminID;
	private String  Password;
	private String  AdminName;
	private String  IdentityID;
	private String  Email;
	private int 	ProductEdit;
	private int 	UserEdit;
	private int 	OrderEdit;
	private int 	AddAdmin;
	public String getAdminID() {
		return AdminID;
	}
	public void setAdminID(String adminID) {
		AdminID = adminID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getIdentityID() {
		return IdentityID;
	}
	public void setIdentityID(String identityID) {
		IdentityID = identityID;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getProductEdit() {
		return ProductEdit;
	}
	public void setProductEdit(int productEdit) {
		ProductEdit = productEdit;
	}
	public int getUserEdit() {
		return UserEdit;
	}
	public void setUserEdit(int userEdit) {
		UserEdit = userEdit;
	}
	public int getOrderEdit() {
		return OrderEdit;
	}
	public void setOrderEdit(int orderEdit) {
		OrderEdit = orderEdit;
	}
	public int getAddAdmin() {
		return AddAdmin;
	}
	public void setAddAdmin(int addAdmin) {
		AddAdmin = addAdmin;
	}
	
}

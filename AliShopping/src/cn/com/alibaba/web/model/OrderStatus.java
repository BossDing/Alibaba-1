package cn.com.alibaba.web.model;

public class OrderStatus {
	/**
	 * orderstatus_id integer pk ״̬ id 
	 * name varchar(20) not null ״̬����
	 * description varchar(64) / ״̬����
	 */
	private int orderstatus_id;
	private String  name;
	private String  description;
	public int getOrderstatus_id() {
		return orderstatus_id;
	}
	public void setOrderstatus_id(int orderstatus_id) {
		this.orderstatus_id = orderstatus_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}

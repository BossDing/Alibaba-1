package cn.com.alibaba.web.model;

public class PayWay {
	/**
	 * payway_id integer pk ���ʽ id 
	 * paystyle varchar(64) not null ���ʽ����
	 */
    private int payway_id;
    private String paystyle;
	public int getPayway_id() {
		return payway_id;
	}
	public void setPayway_id(int payway_id) {
		this.payway_id = payway_id;
	}
	public String getPaystyle() {
		return paystyle;
	}
	public void setPaystyle(String paystyle) {
		this.paystyle = paystyle;
	}
	
    
    
	
}

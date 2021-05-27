package kr.java.chapter8.overloading;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	

	public Customer() {
		initCustomer();
		//customerGrade = "SILVER";
		//bonusRatio = 0.01;
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
		
	}
	
	private void initCustomer(){
		// this();
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
			}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo(){
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";  
	}

	public void setCustomerID(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setCustomerName(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getCustomerName() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}



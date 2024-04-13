package dto;

public class Customer {

	private int customerId;
	private String customerName;
	private String customerProduct;
	private double customerPrice;
	private long customerPhone;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerProduct() {
		return customerProduct;
	}
	public void setCustomerProduct(String customerProduct) {
		this.customerProduct = customerProduct;
	}
	public double getCustomerPrice() {
		return customerPrice;
	}
	public void setCustomerPrice(double customerPrice) {
		this.customerPrice = customerPrice;
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	
}

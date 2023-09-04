package com.testing;

public class Order {
	String product;
	String price;
	String createDate;
	String status;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Order(String product, String price, String createDate, String status) {
		super();
		this.product = product;
		this.price = price;
		this.createDate = createDate;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [product=" + product + ", price=" + price + ", createDate=" + createDate + ", status=" + status
				+ "]";
	}
	
}

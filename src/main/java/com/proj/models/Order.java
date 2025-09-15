package com.proj.models;

import java.sql.Timestamp;

public class Order {
	
	private int orderId;
	private int userId;
	private int  restaurantId;
	private String address;
	private String paymentMethod;
	private Timestamp orderTime;
	private String status;
	private double totalAmount;
	
	public Order() {
		
	}
	
	
	
	public Order( int userId, int restaurantId, String address, String paymentMethod, Timestamp orderTime,
			String status, double totalAmount) {
		super();
		
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.address = address;
		this.paymentMethod = paymentMethod;
		this.orderTime = orderTime;
		this.status = status;
		this.totalAmount = totalAmount;
	}
	
	public Order(int orderId, int userId, int restaurantId, String address, String paymentMethod, Timestamp orderTime,
			String status, double totalAmount) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.address = address;
		this.paymentMethod = paymentMethod;
		this.orderTime = orderTime;
		this.status = status;
		this.totalAmount = totalAmount;
	}
	
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Timestamp getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}



	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userId=" + userId + ", restaurantId=" + restaurantId + ", address="
				+ address + ", paymentMethod=" + paymentMethod + ", orderTime=" + orderTime + ", status=" + status
				+ ", totalAmount=" + totalAmount + "]";
	}
	
	
	
	

}

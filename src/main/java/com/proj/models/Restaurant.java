package com.proj.models;

import java.sql.Timestamp;

public class Restaurant {
	private int restaurantId;
	private String name;
	private String address;
	private String phone;
	private String cuisineType;
	private String deliveryTime;
	private int adminUserId;
	private String rating;
	private String isActive;
	private String imagePath;

	public Restaurant(int restaurantId, String name, String address, String phone, String cuisineType,
			String deliveryTime, int adminUserId, String rating, String isActive, String imagePath) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.cuisineType = cuisineType;
		this.deliveryTime = deliveryTime;
		this.adminUserId = adminUserId;
		this.rating = rating;
		this.isActive = isActive;
		this.imagePath = imagePath;
	}

	





	public int getRestaurantId() {
		return restaurantId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public int getAdminUserId() {
		return adminUserId;
	}

	public String getRating() {
		return rating;
	}

	public String getIsActive() {
		return isActive;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public void setAdminUserId(int adminUserId) {
		this.adminUserId = adminUserId;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}

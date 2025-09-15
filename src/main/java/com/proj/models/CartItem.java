package com.proj.models;

public class CartItem {

	private int id;
	private int restId;
	private String name;
	private int quantity;
	private int price;
<<<<<<< HEAD
	private String imagePath;
	public CartItem(int id,int restId, String name, int quantity, int price, String imagePath) {
		super();
		this.imagePath = imagePath;
=======
	public CartItem(int id,int restId, String name, int quantity, int price) {
		super();
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
		this.id = id;
		this.restId = restId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
<<<<<<< HEAD
	
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

=======
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
	public CartItem() {
		super();
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setRestId(int restId) {
		this.restId = restId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public int getRestId() {
		return restId;
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getPrice() {
		return price;
	}
	
	
}

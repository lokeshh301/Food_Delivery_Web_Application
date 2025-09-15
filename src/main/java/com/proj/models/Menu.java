package com.proj.models;

public class Menu {
	private int menuId;
	private int restaurantId;
	private String itemName;
	private String description;
	private String price;
	private String isAvailable;
	private String rating;
	private String imagePath;

	public Menu(int menuId, int restaurantId, String itemName, String description, String price, String isAvailable,
			String rating, String imagePath) {
		super();
		this.menuId = menuId;
		this.restaurantId = restaurantId;
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.isAvailable = isAvailable;
		this.rating = rating;
		this.imagePath = imagePath;
	}

	public int getMenuId() {
		return menuId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public String getItemName() {
		return itemName;
	}

	public String getDescription() {
		return description;
	}

	public String getPrice() {
		return price;
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public String getRating() {
		return rating;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}

package com.proj.models;

import java.util.HashMap;

public class Cart {
	HashMap<Integer,CartItem> items;
	
	public Cart(){
		this.items = new HashMap<Integer,CartItem>();
	}
	
	
	public void addItem(CartItem item) {
		int id = item.getId();
		if(items.containsKey(id)) {
			CartItem existingItem = items.get(id);
			existingItem.setQuantity(existingItem.getQuantity() + item.getQuantity());
		}
		else {
			items.put(id, item);
		}
	}
	
	public void updateItem(int id , int qty) {
		if(items.containsKey(id)) {
			CartItem item = items.get(id);
			if(item.getQuantity()<=0) {
				items.remove(id);
			}
			else {
			CartItem existingItem = items.get(id);
			existingItem.setQuantity(existingItem.getQuantity() + qty);
			}
		}
		
	}
	public void deleteItem(int id) {
		items.remove(id);
	}
	
	
	public HashMap<Integer,CartItem> getItems(){
		return items;
	}
	
	public double  getTotalPrice() {
		return items.values().stream().mapToDouble(item -> item.getPrice() * item.getQuantity()).sum();
	}
	
	
}

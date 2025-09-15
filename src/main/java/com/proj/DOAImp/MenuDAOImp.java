package com.proj.DOAImp;

import com.proj.DAO.MenuDAO;
import com.proj.models.Menu;
import com.proj.util.Connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MenuDAOImp implements MenuDAO {

	static Connection connection = null;
	static PreparedStatement preparedStatement = null;

	// Queries
	private String getAllMenuQ = "SELECT * FROM menu";
	private String getMenuQ = "SELECT * FROM menu WHERE menu_id = ?";
	private String getAllRestaurantsQ = "SELECT * FROM menu WHERE `restaurant_id` = ?";
	private String addMenuQ = "INSERT INTO menu (restaurant_id, item_name, description, price, is_available, rating, image_path) VALUES (?, ?, ?, ?, ?, ?, ?)";
	private String updateMenuQ = "UPDATE menu SET restaurant_id = ?, item_name = ?, description = ?, price = ?, is_available = ?, rating = ?, image_path = ? WHERE menu_id = ?";
	private String deleteMenuQ = "DELETE FROM menu WHERE menu_id = ?";

	@Override
	public List<Menu> getAllMenu() {
		Menu m;
		List<Menu> list = new ArrayList<>();

		try {
			connection = Connections.getConnection();
			preparedStatement = connection.prepareStatement(getAllMenuQ);
			ResultSet res = preparedStatement.executeQuery();

			while (res.next()) {
				int menuId = res.getInt("menu_id");
				int restaurantId = res.getInt("restaurant_id");
				String itemName = res.getString("item_name");
				String description = res.getString("description");
				String price = res.getString("price");
				String isAvailable = res.getString("is_available");
				String rating = res.getString("rating");
				String imagePath = res.getString("image_path");

				m = new Menu(menuId, restaurantId, itemName, description, price, isAvailable, rating, imagePath);
				list.add(m);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	
	
	
	@Override
	public List<Menu> getMenuRestaurant(int id) {
		Menu m;
		List<Menu> list = new ArrayList<>();
		
		try {
			connection = Connections.getConnection();
			preparedStatement = connection.prepareStatement(getAllRestaurantsQ);
			preparedStatement.setInt(1, id);
			ResultSet res = preparedStatement.executeQuery();
			
			while (res.next()) {
				int menuId = res.getInt("menu_id");
				int restaurantId = res.getInt("restaurant_id");
				String itemName = res.getString("item_name");
				String description = res.getString("description");
				String price = res.getString("price");
				String isAvailable = res.getString("is_available");
				String rating = res.getString("rating");
				String imagePath = res.getString("image_path");
				
				m = new Menu(menuId, id, itemName, description, price, isAvailable, rating, imagePath);
				list.add(m);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public Menu getMenu(int id) {
		Menu m = null;

		try {
			connection = Connections.getConnection();
			PreparedStatement preparedstatement = connection.prepareStatement(getMenuQ);
			preparedstatement.setInt(1, id);

			ResultSet res = preparedstatement.executeQuery();

			if (res.next()) {
				int menuId = res.getInt("menu_id");
				int restaurantId = res.getInt("restaurant_id");
				String itemName = res.getString("item_name");
				String description = res.getString("description");
				String price = res.getString("price");
				String isAvailable = res.getString("is_available");
				String rating = res.getString("rating");
				String imagePath = res.getString("image_path");

				m = new Menu(menuId, restaurantId, itemName, description, price, isAvailable, rating, imagePath);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return m;
	}

	@Override
	public void addMenu(Menu menu) {
		try {
			connection = Connections.getConnection();
			preparedStatement = connection.prepareStatement(addMenuQ);

			preparedStatement.setInt(1, menu.getRestaurantId());
			preparedStatement.setString(2, menu.getItemName());
			preparedStatement.setString(3, menu.getDescription());
			preparedStatement.setString(4, menu.getPrice());
			preparedStatement.setString(5, menu.getIsAvailable());
			preparedStatement.setString(6, menu.getRating());
			preparedStatement.setString(7, menu.getImagePath());

			int res = preparedStatement.executeUpdate();
			System.out.println(res);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void UpdateMenu(Menu menu) {
		try {
			connection = Connections.getConnection();
			preparedStatement = connection.prepareStatement(updateMenuQ);

			preparedStatement.setInt(1, menu.getRestaurantId());
			preparedStatement.setString(2, menu.getItemName());
			preparedStatement.setString(3, menu.getDescription());
			preparedStatement.setString(4, menu.getPrice());
			preparedStatement.setString(5, menu.getIsAvailable());
			preparedStatement.setString(6, menu.getRating());
			preparedStatement.setString(7, menu.getImagePath());
			preparedStatement.setInt(8, menu.getMenuId());

			int res = preparedStatement.executeUpdate();
			System.out.println(res);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteMenu(int id) {
		try {
			connection = Connections.getConnection();
			PreparedStatement preparedstatement = connection.prepareStatement(deleteMenuQ);
			preparedstatement.setInt(1, id);

			int res = preparedstatement.executeUpdate();
			System.out.println(res);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

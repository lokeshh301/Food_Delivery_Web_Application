package com.proj.DOAImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.proj.DAO.RestaurantDAO;
import com.proj.models.Restaurant;
import com.proj.util.Connections;

public class RestaurantDAOImp implements RestaurantDAO {
	
	static Connection connection = null;
	static PreparedStatement preparedStatement = null;
	
											
	
	//Quiries
		private String getAllUsersQ = "select * from `restaurant`";
		private String getUserQ = "select * from `restaurant` where `restaurant_id` = ?";
		private String addUserQ = "Insert into `restaurant`(`restaurant_id`,`name`,`address`,`phone_number`,`cuisine_type`,`delivery_time`,`admin_user_id`,`rating`,`is_active`,`image_path`) values(?,?,?,?,?,?,?,?,?,?)";
		private String updateUserQ = "update `restaurant` set `name`= ?,`address`=?,`phone_number`=?,`cuisine_type`=?,`delivery_time`=?, `admin_user_id`=?, `rating`=?, `is_active`=?, `image_path`=?,where `restaurant_id` = ?";
		private String deleteUserQ = "delete from `restaurant` where `restaurant_id` = ?";

	@Override
	public List<Restaurant> getAllRestaurant() {
	Restaurant r;
		
		List<Restaurant> l = new ArrayList<Restaurant>();

			try {
				connection = Connections.getConnection();
				preparedStatement = connection.prepareStatement(getAllUsersQ);
				
				ResultSet res = preparedStatement.executeQuery();
				
				while(res.next()) {
					
					
					
					int restaurantId = res.getInt("restaurant_id");
					String name = res.getString("name");
					String address = res.getString("address");
					String phoneNo = res.getString("phone_number");
					String cuisineType = res.getString("cuisine_type");
					String deliveryTime = res.getString("delivery_time");
					int adminUserId = res.getInt("admin_user_id");
					String rating = res.getString("rating");
					String isActive = res.getString("is_active");
					String imagePath = res.getString("image_path");

					r = new Restaurant(restaurantId, name, address, phoneNo, cuisineType, deliveryTime, adminUserId, rating, isActive, imagePath);
					l.add(r);
					
				}
			
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		return l;
	}

	@Override
	public Restaurant getRestaurant(int id) {
		Restaurant r = null;
			
			try {
				connection = Connections.getConnection();
				PreparedStatement preparedstatement = connection.prepareStatement(getUserQ);
				 preparedstatement.setInt(1, id);
				
				ResultSet res = preparedstatement.executeQuery();
				
				
				res.next();

				String name = res.getString("name");
				String address = res.getString("address");
				String phoneNo = res.getString("phone_number");
				String cuisineType = res.getString("cuisine_type");
				String deliveryTime = res.getString("delivery_time");
				int adminUserId = res.getInt("admin_user_id");
				String rating = res.getString("rating");
				String isActive = res.getString("is_active");
				String imagePath = res.getString("image_path");

				r = new Restaurant(id, name, address, phoneNo, cuisineType, deliveryTime, adminUserId, rating, isActive, imagePath);
				
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return r;
	}

	@Override
	public void addRestaurant(Restaurant rest) {
try {
			
			connection = Connections.getConnection();
			
			preparedStatement = connection.prepareStatement(addUserQ);
			
			preparedStatement.setInt(1, rest.getRestaurantId());
			preparedStatement.setString(2, rest.getName());
			preparedStatement.setString(3, rest.getAddress());
			preparedStatement.setString(4, rest.getPhone());
			preparedStatement.setString(5, rest.getCuisineType());
			preparedStatement.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
			preparedStatement.setInt(7, rest.getAdminUserId());
			preparedStatement.setString(8, rest.getRating());
			preparedStatement.setString(9, rest.getIsActive());
			preparedStatement.setString(10, rest.getImagePath());

			int res = preparedStatement.executeUpdate();
			System.out.println(res);
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void UpdateRestaurant(Restaurant rest) {
		try {
			connection = Connections.getConnection();
			
			preparedStatement = connection.prepareStatement(updateUserQ );
			preparedStatement.setString(1, rest.getName());
			preparedStatement.setString(2, rest.getAddress());
			preparedStatement.setString(3, rest.getPhone());
			preparedStatement.setString(4, rest.getCuisineType());
			preparedStatement.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
			preparedStatement.setInt(6, rest.getAdminUserId());
			preparedStatement.setString(7, rest.getRating());
			preparedStatement.setString(8, rest.getIsActive());
			preparedStatement.setString(9, rest.getImagePath());
			
			int res = preparedStatement.executeUpdate();
			System.out.println(res);
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}

	@Override
	public void deleteRestaurant(int id) {
try {
			
			connection = Connections.getConnection();
			PreparedStatement preparedstatement = connection.prepareStatement(deleteUserQ);
			 preparedstatement.setInt(1, id);
			
			int i = preparedstatement.executeUpdate();
			
			System.out.println(i);
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
<<<<<<< HEAD
	
	
	
	String quirygetName = "select name from restaurant where restaurant_id = ?";
	public String getRestName(int id) {
		
		String name = "";
		try {
			connection = Connections.getConnection();
			PreparedStatement preparedstatement = connection.prepareStatement(quirygetName);
			
			preparedstatement.setInt(1, id);
			
			ResultSet res = preparedstatement.executeQuery();
			
			res.next();
			
			name = res.getString("name");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
		
	}
=======
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79

}

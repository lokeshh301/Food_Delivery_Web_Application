package com.proj.DOAImp;

import com.proj.util.Connections;
import com.proj.DAO.*;
import com.proj.models.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UsersDOAImp implements UserDAO{
	
	static Connection connection = null;
	static PreparedStatement preparedStatement = null;
	
	//Quiries
	private String getAllUsersQ = "select * from `user`";
	private String getUserQ = "select * from `user` where `user_id` = ?";
<<<<<<< HEAD
	private String getUserEmailQ = "select * from `user` where `email` = ?";
	private String addUserQ = "INSERT INTO user(`user_name`, `password`, `email`, `phone_number`,`address`, `role`, `created_date`, `last_login_date`) \r\n"
			+ "VALUES (?,?,?,?,?,?,?,?);";
=======
	private String addUserQ = "Insert into `user`(`user_id`,`user_name`,`password`,`email`,`phone_number`,`role`,`created_date`,`last_login_date`) values(?,?,?,?,?,?,?,?,?,?)";
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
	private String updateUserQ = "update `user` set `user_name`= ?,`password`=?,`email`=?,`phone_number`=?,`address`=? where `user_id` = ?";
	private String deleteUserQ = "delete from `user` where `user_id` = ?";
	
 
	
	
	

	@Override
	public List<Users> getAllusers() {
		Users u;
		
		List<Users> l = new ArrayList<Users>();

			try {
				connection = Connections.getConnection();
				preparedStatement = connection.prepareStatement(getAllUsersQ);
				
				ResultSet res = preparedStatement.executeQuery();
				
				while(res.next()) {
					
					int id = res.getInt("user_id");
					String name = res.getString("user_name");
					String pass = res.getString("password");
					String email = res.getString("email");
					String phoneNo = res.getString("phone_number");
					String address = res.getString("address");
					String role = res.getString("role");
					Timestamp createdDate = res.getTimestamp("created_date");
					Timestamp lastLoginDate = res.getTimestamp("last_login_date");
					u = new Users(id, name,pass,email,phoneNo,address,role, createdDate,lastLoginDate);
					
					l.add(u);
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		return l;
	}
<<<<<<< HEAD

//	------------------------------------------------------------------------------------------
	
	
	public Users getUserByemail(String email) {
	Users u = null;
		
		try {
			connection = Connections.getConnection();
			PreparedStatement preparedstatement = connection.prepareStatement(getUserEmailQ);
			 preparedstatement.setString(1, email);
			
			ResultSet res = preparedstatement.executeQuery();
			
			
			res.next();
			int userId= res.getInt("user_id");
			String name = res.getString("user_name");
			String pass = res.getString("password");
			String emaill = res.getString("email");
			String phoneNo = res.getString("phone_number");
			String address = res.getString("address");
			String role = res.getString("role");
			Timestamp createdDate = res.getTimestamp("created_date");
			Timestamp lastLoginDate = res.getTimestamp("last_login_date");
			
			u = new Users(userId, name,pass,emaill,phoneNo,address,role, createdDate,lastLoginDate);
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
=======
	
	
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
//	------------------------------------------------------------------------------------------
	
	@Override
	public Users getUsers(int id) {
	Users u = null;
		
		try {
			connection = Connections.getConnection();
			PreparedStatement preparedstatement = connection.prepareStatement(getUserQ);
			 preparedstatement.setInt(1, id);
			
			ResultSet res = preparedstatement.executeQuery();
			
			
			res.next();
			int userId= res.getInt("user_id");
			String name = res.getString("user_name");
<<<<<<< HEAD
			String pass = res.getString("password");
=======
			String pass = res.getString("pssword");
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
			String email = res.getString("email");
			String phoneNo = res.getString("phone_number");
			String address = res.getString("address");
			String role = res.getString("role");
			Timestamp createdDate = res.getTimestamp("created_date");
			Timestamp lastLoginDate = res.getTimestamp("last_login_date");
			
			u = new Users(userId, name,pass,email,phoneNo,address,role, createdDate,lastLoginDate);
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	
//----------------------------------------------------------------------------------------------------------
	@Override
<<<<<<< HEAD
	public int addUsers(Users user) {
		// TODO Auto-generated method stub
		int res=0;
=======
	public void addUsers(Users user) {
		// TODO Auto-generated method stub
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
		try {
			
			connection = Connections.getConnection();
			
			preparedStatement = connection.prepareStatement(addUserQ);
			
<<<<<<< HEAD
//			`user_name`, `password`, `email`, `phone_number`, `role`, `created_date`, `last_login_date`
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getPhone());
			preparedStatement.setString(5, user.getAddress());
			preparedStatement.setString(6, user.getRole());
			preparedStatement.setTimestamp(7, new Timestamp(System.currentTimeMillis()));
			preparedStatement.setTimestamp(8, new Timestamp(System.currentTimeMillis()));

			res = preparedStatement.executeUpdate();
=======
			preparedStatement.setInt(1, user.getUserId());
			preparedStatement.setString(2, user.getUserName());
			preparedStatement.setString(3, user.getUserName());
			preparedStatement.setString(4, user.getPassword());
			preparedStatement.setString(5, user.getEmail());
			preparedStatement.setString(6, user.getPhone());
			preparedStatement.setString(7, user.getAddress());
			preparedStatement.setString(8, user.getRole());
			preparedStatement.setTimestamp(9, new Timestamp(System.currentTimeMillis()));
			preparedStatement.setTimestamp(10, new Timestamp(System.currentTimeMillis()));

			int res = preparedStatement.executeUpdate();
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
			System.out.println(res);
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
<<<<<<< HEAD
		return res;
=======
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
	}

	
	
//-------------------------------------------------------------------------------------------------====
	
	
	@Override
	public void UpdateUsers(Users user) {
		
		try {
		connection = Connections.getConnection();
		
		preparedStatement = connection.prepareStatement(updateUserQ );
		preparedStatement.setString(1, user.getUserName());
		preparedStatement.setString(2, user.getPassword());
		preparedStatement.setString(3, user.getEmail());
		preparedStatement.setString(4, user.getPhone());
		preparedStatement.setString(5, user.getAddress());
		preparedStatement.setInt(6, user.getUserId());
		
		int res = preparedStatement.executeUpdate();
		System.out.println(res);
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	
	
//	---------------------------------------------------------------------------------

	@Override
	public void deleteUsers(int id) {
		try {
			
			connection = Connections.getConnection();
			PreparedStatement preparedstatement = connection.prepareStatement(deleteUserQ);
			 preparedstatement.setInt(1, id);
			
			int i = preparedstatement.executeUpdate();
			
			System.out.println(i);
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}

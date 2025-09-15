package com.proj.DOAImp;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.proj.DAO.OrderDAO;
import com.proj.models.Order;
import com.proj.models.Restaurant;
import com.proj.util.Connections;

public class OrderDAOImp implements OrderDAO {
	
	private String quiry = "insert into orders(`user_id`,`restaurant_id`,`address`,`payment_method`,`order_date`,`status`,`total_amount`) values(?,?,?,?,?,?,?)";

	@Override
	public int addOrder(Order o)  {
		
		Connection con = Connections.getConnection();
		int order_id=0;
		try {
			
			PreparedStatement preparedStatement = con.prepareStatement(quiry, Statement.RETURN_GENERATED_KEYS);
			
			preparedStatement.setInt(1, o.getUserId());
			preparedStatement.setInt(2, o.getRestaurantId());
			preparedStatement.setString(3, o.getAddress());
			preparedStatement.setString(4, o.getPaymentMethod());
			preparedStatement.setTimestamp(5,o.getOrderTime());
			preparedStatement.setString(6, o.getStatus());
			preparedStatement.setDouble(7,o.getTotalAmount());
			
			preparedStatement.executeLargeUpdate();
			
			ResultSet keys = preparedStatement.getGeneratedKeys();
			
			while(keys.next()) {
				order_id = keys.getInt(1);
			}
			
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return order_id;
		

	}
	
	String getAllQ = "select * from orders";
	public List<Order> getAllOrders(int userid){
	Order o;
			
			List<Order> l = new ArrayList<Order>();
	
				try {
					Connection connection = Connections.getConnection();
					PreparedStatement preparedStatement = connection.prepareStatement(getAllQ);
					
					ResultSet res = preparedStatement.executeQuery();
					
					while(res.next()) {
						
						
						int orderId = res.getInt("order_id");
						int userId = res.getInt("user_id");
						int restId = res.getInt("restaurant_id");
						String address = res.getString("address");
						String paymentMethod = res.getString("payment_method");
						Timestamp orderDate = res.getTimestamp("order_date");
						String status = res.getString("status");
						double amount = res.getDouble("total_amount");
						

						o = new Order(orderId, userId, restId, address, paymentMethod, orderDate, status, amount);

						l.add(o);
						
					}
				
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			return l;
		
	}
	
	
	
	


}

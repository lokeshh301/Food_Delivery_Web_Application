package com.proj.DOAImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.proj.DAO.OrderItemsDAO;
import com.proj.models.OrderItem;
import com.proj.util.Connections;

public class OrderItemDAOImp implements OrderItemsDAO {
	
	String quiry = "insert into order_items(`order_id`,`menu_id`,`quantity`,`total_price`) values(?,?,?,?) ";

	@Override
	public void addOrderItem(OrderItem oi) {
		Connection con = Connections.getConnection();

		try {
			
			PreparedStatement preparedStatement = con.prepareStatement(quiry);
			
	
			preparedStatement.setInt(1, oi.getOrderId());
			preparedStatement.setInt(2, oi.getMenuId());
			preparedStatement.setInt(3, oi.getQuantity());
			preparedStatement.setDouble(4, oi.getTotalPrice());
			
			preparedStatement.executeLargeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

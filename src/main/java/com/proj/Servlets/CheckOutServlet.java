package com.proj.Servlets;

import java.io.IOException;
import java.sql.Timestamp;

import com.proj.DOAImp.OrderDAOImp;
import com.proj.DOAImp.OrderItemDAOImp;
import com.proj.DOAImp.UsersDOAImp;
import com.proj.models.Cart;
import com.proj.models.CartItem;
import com.proj.models.Order;
import com.proj.models.OrderItem;
import com.proj.models.Users;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/checkOut")
public class CheckOutServlet extends HttpServlet{
	OrderDAOImp orderDAO;
	OrderItemDAOImp orderItemDAOImp;
	
	@Override
	public void init() throws ServletException {
		orderDAO = new OrderDAOImp();
		orderItemDAOImp = new OrderItemDAOImp();
		System.out.println("reached Init method");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
//		UsersDOAImp ud = new UsersDOAImp();
//		Users users = ud.getUsers(1);
//		session.setAttribute("user", users);
		
		
		
		System.out.println("reached service method");
//		Order order;
		Cart cart = (Cart)session.getAttribute("cart");
		Users user = (Users)session.getAttribute("user");
		
		System.out.println(user);
		 
		if(cart!= null&& user!=null && !cart.getItems().isEmpty()) {
			System.out.println("reached service method if loop");
			String paymentMethod = req.getParameter("paymentMethod");
			String address = req.getParameter("address");
			
			Order order = new Order();
			
			order.setUserId(user.getUserId());
			order.setRestaurantId((int)session.getAttribute("restaurantId"));
			order.setOrderTime(new Timestamp(System.currentTimeMillis()));
			order.setPaymentMethod(paymentMethod);
			order.setStatus("pending");
			order.setAddress(address);
			
			double totalAmount = cart.getItems().values().stream().mapToDouble(item -> item.getPrice() * item.getQuantity()).sum();
			
			order.setTotalAmount(totalAmount);
			
			int order_Id = orderDAO.addOrder(order);
			order.setOrderId(order_Id);
			
			for(CartItem item : cart.getItems().values()) {
				OrderItem oi = new OrderItem();
				
				oi.setOrderId(order_Id);
				oi.setMenuId(item.getId());
				oi.setQuantity(item.getQuantity());
				oi.setTotalPrice(item.getQuantity()*item.getPrice());
				orderItemDAOImp.addOrderItem(oi);
			}
			
			
			
		
			
			session.setAttribute("order", order);
			session.removeAttribute("cart");
			System.out.print("sent to temp.jsp");
			resp.sendRedirect("temp.jsp");
		}
		else {
			resp.sendRedirect("Cart.jsp");
		}
	}

}

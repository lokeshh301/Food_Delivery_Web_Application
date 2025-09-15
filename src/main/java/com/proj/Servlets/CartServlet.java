package com.proj.Servlets;

import java.io.IOException;

import com.proj.DOAImp.MenuDAOImp;
import com.proj.models.Cart;
import com.proj.models.CartItem;
import com.proj.models.Menu;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		Cart cart = (Cart)session.getAttribute("cart");
<<<<<<< HEAD
		String action = req.getParameter("action");
		


	
		
		
		if(action == null || action.equalsIgnoreCase("view")) {
			 if (cart == null) {
		            cart = new Cart();
		            session.setAttribute("cart", cart);
		        }
		        resp.sendRedirect("Cart.jsp");
		        return;
		}
		else if(action.equalsIgnoreCase("add")) {
=======
		
		
		String action = req.getParameter("action");
		
		if(action.equalsIgnoreCase("add")) {
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
			
			int newRestaurantId = Integer.parseInt(req.getParameter("restId"));
			Integer currRestaurantId = (Integer)session.getAttribute("restaurantId");
			
<<<<<<< HEAD
			if(cart==null || currRestaurantId == null || currRestaurantId != newRestaurantId) {
=======
			if(cart==null ||  currRestaurantId != newRestaurantId) {
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
				cart = new Cart();
				session.setAttribute("cart", cart);
				session.setAttribute("restaurantId", newRestaurantId);
			}
<<<<<<< HEAD
=======
			
			
			
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
			addItemToCart(req,cart);
		}
		else if(action.equalsIgnoreCase("update")) {
			pdateItemToCart(req,cart);
		}
		else if(action.equalsIgnoreCase("delete")) {
			deleteItemFromCart(req,cart);
		}
		
<<<<<<< HEAD

		
		
=======
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
		
		resp.sendRedirect("Cart.jsp");
	
	}

	private void deleteItemFromCart(HttpServletRequest req, Cart cart) {
		int itemId = Integer.parseInt(req.getParameter("itemId"));
		cart.deleteItem(itemId);
		
	}

	private void pdateItemToCart(HttpServletRequest req, Cart cart) {
		int itemId  = Integer.parseInt(req.getParameter("itemId"));
		int quantity = Integer.parseInt(req.getParameter("quntity"));
		System.out.println(quantity);
		cart.updateItem(itemId, quantity);
		
		
	}

	private void addItemToCart(HttpServletRequest req, Cart cart) {
		
		int menuid  = Integer.parseInt(req.getParameter("itemId"));
		int quantity  = Integer.parseInt(req.getParameter("quntity"));
<<<<<<< HEAD
		String imagePath = req.getParameter("imagePath");
=======
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
		
		MenuDAOImp impl1 = new MenuDAOImp();
		Menu menu = impl1.getMenu(menuid);
		
		CartItem ci = new CartItem(menuid,
											menu.getRestaurantId(),
											menu.getItemName(),
											quantity,
<<<<<<< HEAD
											Integer.parseInt(menu.getPrice())
											,imagePath);
=======
											Integer.parseInt(menu.getPrice()));
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
		
		cart.addItem(ci);
		
	}
}

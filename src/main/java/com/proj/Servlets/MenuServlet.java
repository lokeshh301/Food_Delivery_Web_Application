package com.proj.Servlets;

import java.io.IOException;
import java.util.List;

import com.proj.DAO.MenuDAO;
import com.proj.DAO.RestaurantDAO;
import com.proj.DOAImp.MenuDAOImp;
import com.proj.DOAImp.RestaurantDAOImp;
import com.proj.models.Menu;
import com.proj.models.Restaurant;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/menuServlet")
public class MenuServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		MenuDAO menuDAO = new MenuDAOImp();
		RestaurantDAO restImp = new RestaurantDAOImp();
		int id = Integer.parseInt(req.getParameter("restaurantId"));
		System.out.println(id);
		
		Restaurant restaurant = restImp.getRestaurant(id);
		req.setAttribute("restaurant", restaurant);
		
		
		
		List<Menu> list = menuDAO.getMenuRestaurant(id);
		
//		System.out.println("Zeeshan Malik hurree");
//		for(Menu men :list) {
//			System.out.println(men.getItemName());
//		}
		req.setAttribute("list", list);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/menu.jsp");
		requestDispatcher.forward(req, resp);
		
	}
}

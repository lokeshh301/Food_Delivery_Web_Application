package com.proj.Servlets;

import com.proj.DOAImp.RestaurantDAOImp;
<<<<<<< HEAD
import com.proj.DOAImp.UsersDOAImp;
import com.proj.models.Restaurant;
import com.proj.models.Users;
=======
import com.proj.models.Restaurant;
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79

import java.io.IOException;
import java.util.List;

import com.proj.DAO.RestaurantDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
<<<<<<< HEAD
import jakarta.servlet.http.HttpSession;
=======
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79

@WebServlet("/HomeServlet")
public class HomeServlets extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
<<<<<<< HEAD
		HttpSession session = req.getSession();
		
		
		
		
		
		
		RestaurantDAO restImp = new RestaurantDAOImp();
		
		
=======
		RestaurantDAO restImp = new RestaurantDAOImp();
		
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
		List<Restaurant> allRestaurant = restImp.getAllRestaurant();
		
//		for(Restaurant rest : allRestaurant) {
//			System.out.println(rest);
//		}
		req.setAttribute("allRestarant", allRestaurant);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("restaurant.jsp");
		requestDispatcher.forward(req, resp);
		
	}

}

package com.proj.DAO;
import java.util.List;

import com.proj.models.*;
public interface RestaurantDAO {
		
	List<Restaurant> getAllRestaurant();
	Restaurant getRestaurant(int id);
	void addRestaurant(Restaurant u);
	void UpdateRestaurant(Restaurant u);
	void deleteRestaurant(int id);
	
}

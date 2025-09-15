package com.proj.DAO;

import java.util.List;

import com.proj.models.Menu;
import com.proj.models.Users;

public interface MenuDAO {
	List<Menu> getAllMenu();
	List<Menu> getMenuRestaurant(int id);
	Menu getMenu(int id);
	void addMenu(Menu u);
	void UpdateMenu(Menu u);
	void deleteMenu(int id);
}

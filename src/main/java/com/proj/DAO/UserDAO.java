package com.proj.DAO;

import java.util.List;

import com.proj.models.*;

public interface UserDAO {
	List<Users> getAllusers();
	Users getUsers(int id);
<<<<<<< HEAD
	int addUsers(Users u);
=======
	void addUsers(Users u);
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
	void UpdateUsers(Users u);
	void deleteUsers(int id);
}

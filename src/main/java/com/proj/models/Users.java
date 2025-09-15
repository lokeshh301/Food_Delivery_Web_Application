package com.proj.models;

import java.sql.Timestamp;

public class Users {
	private int userId;
	private String userName;
	private String password;
	private String email;
	private String phone;
	private String address;
	private String role;
	private Timestamp createDate;
	private Timestamp lastLoginDate;
	
	
	
	
	public Users(int userId, String userName, String password, String email, String phone, String address, String role,
			Timestamp createDate, Timestamp lastLoginDate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.role = role;
		this.createDate = createDate;
		this.lastLoginDate = lastLoginDate;
	}
<<<<<<< HEAD
	public Users( String userName, String password, String email, String phone, String address, String role,
			Timestamp createDate, Timestamp lastLoginDate) {
		super();
		
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.role = role;
		this.createDate = createDate;
		this.lastLoginDate = lastLoginDate;
	}
=======
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
	
	
	


	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public void setLastLoginDate(Timestamp lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}


	public int getUserId() {
		return userId;
	}


	public String getUserName() {
		return userName;
	}


	public String getPassword() {
		return password;
	}


	public String getEmail() {
		return email;
	}


	public String getPhone() {
		return phone;
	}


	public String getAddress() {
		return address;
	}


	public String getRole() {
		return role;
	}


	public Timestamp getCreateDate() {
		return createDate;
	}


	public Timestamp getLastLoginDate() {
		return lastLoginDate;
	}
<<<<<<< HEAD





	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + ", role=" + role + ", createDate=" + createDate
				+ ", lastLoginDate=" + lastLoginDate + "]";
	}
=======
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
	
	
	
	
	
}

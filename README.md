# 🍽️ Foodie - Food Delivery Web Application

Welcome to Foodie, a Java Servlet and JSP based Food Delivery Web Application! This project allows users to browse restaurants, explore menus, add items to a cart, and place orders with ease. Built for simplicity and scalability, Foodie uses MVC design principles with a MySQL backend.

---

## 🚀 Features

- Dynamic listing of restaurants with details: cuisine, rating, and delivery times  
- Restaurant-specific menus showing item name, description, price, availability & ratings  
- Cart functionality supporting add, update quantity, and remove items  
- Calculates subtotal, delivery fee, and GST tax on the order total  
- Clean DAO design pattern managing CRUD for users, restaurants, and menus  
- Servlets efficiently manage all main workflows (home, menu, cart)  
- Responsive web pages with intuitive navigation and modern styling  
- Supports image display for restaurants and menu items  

---

## 🗃️ Database Structure

### Tables

**User**  

| Column         | Type       | Description                      |
| -------------- | ---------- | -------------------------------|
| `user_id`      | INT (PK)   | Unique user identifier           |
| `user_name`    | VARCHAR    | Username                        |
| `password`     | VARCHAR    | User password                   |
| `email`        | VARCHAR    | User email                     |
| `phone_number` | VARCHAR    | Phone number                   |
| `address`      | VARCHAR    | User address                   |
| `role`         | VARCHAR    | Role (admin, customer, etc.)   |
| `created_date` | TIMESTAMP  | Account creation timestamp     |
| `last_login_date` | TIMESTAMP| Last login timestamp           |

**Restaurant**  

| Column          | Type       | Description                      |
| --------------- | ---------- | ------------------------------ |
| `restaurant_id` | INT (PK)   | Unique restaurant ID             |
| `name`          | VARCHAR    | Restaurant name                 |
| `address`       | VARCHAR    | Location/address                |
| `phone_number`  | VARCHAR    | Contact phone number            |
| `cuisine_type`  | VARCHAR    | Type of cuisine                |
| `delivery_time` | VARCHAR    | Estimated delivery duration     |
| `admin_user_id` | INT        | Admin user foreign key          |
| `rating`        | VARCHAR    | Average rating                 |
| `is_active`     | VARCHAR    | Active status flag             |
| `image_path`    | VARCHAR    | URL or path for image          |

**Menu**  

| Column         | Type       | Description                      |
| -------------- | ---------- | ------------------------------- |
| `menu_id`      | INT (PK)   | Unique menu item ID              |
| `restaurant_id`| INT (FK)   | Links to restaurant             |
| `item_name`    | VARCHAR    | Menu item name                 |
| `description`  | TEXT       | Description of the menu item    |
| `price`       | VARCHAR     | Price of the item               |
| `is_available` | VARCHAR    | Availability flag              |
| `rating`      | VARCHAR     | Item rating                   |
| `image_path`   | VARCHAR    | Image path or URL for the item |

---

## ⚙️ Setup & Installation

1. **Database Setup**
   
   - Install MySQL and create database named `food_delivery_db`  
   - Create tables `user`, `restaurant`, and `menu` with above schema  
   - Optionally insert seed sample data  

2. **Configure Connection**
   
   - Modify `com.proj.util.Connections` with your DB credentials
   - Like this in your file...
      private static String url = "jdbc:mysql://localhost:3306/food_delivery_db";
      private static String name = "root";
      private static String pass = "your_password";

3. **Build & Deploy**
   
- Compile project classes  
- Deploy to Servlet container (e.g., Apache Tomcat)  

4. **Run the Application**

- Open in browser: `http://localhost:8080/your-app-context/HomeServlet`  
- Browse restaurants, menus, and add to cart  

---

## 💡 Suggestions & Future Enhancements

- Implement user authentication and secure login  
- Add order placement, payment gateway integration, and order history  
- Build admin dashboards for managing users, restaurants, and menus  
- Use JavaScript frameworks for an enhanced frontend experience  
- Add input validations and improve backend error handling  
- Write unit and integration tests for robustness  

---

## 📞 Contact

For questions or contributions, reach out to me.

---

© 2025 Lokeshkumar — All rights reserved. ❤️

Food Delivery Web Application - Foodie

Project Overview

Foodie is a Java Servlet-based web application for food delivery. This app allows users to browse restaurants, view restaurant menus, add items to a cart, and place orders. The project features dynamic webpages built with JSP, a MySQL backend, and follows MVC architecture with DAOs handling database operations.

Features

User registration, authentication, and profile management (implied from user model).

List and view restaurants with details including cuisine, rating, and delivery time.

View restaurant-specific menus with images, descriptions, price, availability, and ratings.

Add menu items to a cart with quantity updates and item removal.

Cart price calculation including order summary with GST tax.

Admin portals for managing restaurants, menus, and users (based on DAO interfaces).

Responsive front-end navigation and layout using HTML, CSS, and Font Awesome icons.

Technologies Used

Java 17 (or compatible)

Jakarta Servlet API

JSP (JavaServer Pages)

MySQL Database

JDBC for database connectivity

HTML, CSS, JavaScript for frontend

Apache Tomcat or other Servlet container

Project Structure

/src
  /com.proj.DAO            - DAO interfaces for User, Menu, Restaurant
  /com.proj.DOAImp         - DAO implementations handling database queries
  /com.proj.models         - POJO classes for User, Menu, Restaurant, Cart, CartItem
  /com.proj.Servlets       - Servlet classes managing requests for Home, Menu, Cart
  /com.proj.util           - Utility for database connection
/webapp
  /Restaurant.jsp          - Displays list of restaurants
  /Menu.jsp                - Displays menu for selected restaurant
  /Cart.jsp                - Cart page managing current order items
  /WEB-INF/web.xml         - Deployment descriptor configuration
  
Database Structure

Tables

user

| Column | Data Type | Description |
|------------------|---------------------|----------------------------|
| user_id | INT, PRIMARY KEY | Unique User Identifier |
| user_name | VARCHAR | Username |
| password | VARCHAR | User Password |
| email | VARCHAR | User Email |
| phone_number | VARCHAR | Phone Number |
| address | VARCHAR | User Address |
| role | VARCHAR | User role (admin, customer)|
| created_date | TIMESTAMP | Account creation timestamp |
| last_login_date | TIMESTAMP | Last login timestamp |

restaurant

| Column | Data Type | Description |
|----------------|---------------------|------------------------------|
| restaurant_id | INT, PRIMARY KEY | Unique Restaurant ID |
| name | VARCHAR | Restaurant Name |
| address | VARCHAR | Address/location |
| phone_number | VARCHAR | Contact Number |
| cuisine_type | VARCHAR | Type of cuisine |
| delivery_time | VARCHAR | Estimated delivery time |
| admin_user_id | INT | Foreign key to Admin User |
| rating | VARCHAR | Average restaurant rating |
| is_active | VARCHAR | Status ('yes'/'no' or '1'/'0')|
| image_path | VARCHAR | Path or URL to restaurant image|

menu

| Column | Data Type | Description |
|----------------|--------------------|-------------------------------|
| menu_id | INT, PRIMARY KEY | Unique menu item ID |
| restaurant_id | INT | Foreign key linked to restaurant_id |
| item_name | VARCHAR | Name of the menu item |
| description | TEXT or VARCHAR | Description of the item |
| price | VARCHAR | Price of the item |
| is_available | VARCHAR | Availability ('yes' / 'no') |
| rating | VARCHAR | Rating for the menu item |
| image_path | VARCHAR | Path or URL for item image |

Setup and Installation

Database Setup

Install MySQL and create a database named food_delivery_db.

Create the tables user, restaurant, and menu with the structure above.

Optionally, insert seed data for initial testing.

Configure Database Connection

Update database credentials in com.proj.util.Connections:

java
private static String url = "jdbc:mysql://localhost:3306/food_delivery_db";
private static String name = "root";
private static String pass = "your_password";
Build and Deploy

Compile the Java classes.

Deploy the WAR or project to a Servlet container (e.g., Apache Tomcat).

Start the server.

Access

Navigate to the home page via servlet URL: http://localhost:8080/your-app-context/HomeServlet

Browse restaurants, menus, and use cart functionality.

Suggestions for Improvement

Implement user authentication and session management.

Add order placement, payment integration, and order history.

Admin dashboard for managing users, restaurants, and menus.

Enhance UI/UX with modern frontend frameworks like React or Angular.

Validate inputs and improve error handling.

Add unit and integration testing.


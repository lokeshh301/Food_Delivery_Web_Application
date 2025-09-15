# 🍽️ Food Delivery Web Application - FOOZEE

A complete **Food Delivery Web App** built using **Java Full Stack technologies** (JSP, Servlets, JDBC, MySQL) for backend and **HTML, CSS, JS** for frontend. This system allows users to sign up, browse restaurants, view menus, order food, and track orders.

---

## 🔧 Tech Stack

### Frontend:
- HTML5
- CSS3
- JavaScript
- JSP (Java Server Pages)

### Backend:
- Java (Servlets)
- JDBC (Java Database Connectivity)

### Database:
- MySQL

### Tools:
- Apache Tomcat (v9+)
- Eclipse or IntelliJ
- MySQL Workbench

---

## 📁 Project Structure

## 📁 Project Structure

```bash
Food_Delivery_Web_APP/
├── src/
│   └── com/proj/
│       ├── DAO/             # DAO interfaces
│       ├── DAOImp/          # DAO implementations using JDBC
│       ├── models/          # POJO classes (User, Menu, Order, Cart, etc.)
│       └── Servlets/        # Servlet controllers
├── WebContent/
│   ├── css/                 # CSS stylesheets
│   ├── js/                  # JavaScript files
│   ├── images/              # Static images for UI
│   ├── pages/               # JSP pages (home.jsp, login.jsp, menu.jsp, cart.jsp, etc.)
│   ├── index.jsp            # Main entry point
│   └── WEB-INF/
│       └── web.xml          # Servlet configurations
├── .project
├── .classpath
└── README.md


 ``` 

---

## 🗄️ Database Schema

### `user` Table

| Column    | Type         | Description              |
|-----------|--------------|--------------------------|
| id        | INT (PK)     | Primary Key              |
| name      | VARCHAR(100) | User's name              |
| email     | VARCHAR(100) | Email address            |
| password  | VARCHAR(100) | Hashed password          |
| phone     | VARCHAR(15)  | Phone number             |

### `restaurant` Table

| Column    | Type         | Description              |
|-----------|--------------|--------------------------|
| id        | INT (PK)     | Primary Key              |
| name      | VARCHAR(100) | Restaurant name          |
| location  | VARCHAR(100) | Address or area name     |

### `menu` Table

| Column        | Type         | Description              |
|---------------|--------------|--------------------------|
| id            | INT (PK)     | Menu Item ID             |
| restaurant_id | INT (FK)     | Refers to `restaurant.id`|
| item_name     | VARCHAR(100) | Name of the item         |
| description   | TEXT         | Short item description   |
| price         | DOUBLE       | Price of the item        |
| is_available  | BOOLEAN      | Availability (true/false)|
| rating        | DOUBLE       | Item rating              |
| image_path    | VARCHAR(255) | Image file path          |

### `orders` Table

| Column      | Type         | Description              |
|-------------|--------------|--------------------------|
| id          | INT (PK)     | Order ID                 |
| user_id     | INT (FK)     | Refers to `user.id`      |
| total_price | DOUBLE       | Total order amount       |
| status      | VARCHAR(20)  | Order status             |
| order_time  | TIMESTAMP    | Order placed time        |

### `order_items` Table

| Column     | Type     | Description                     |
|------------|----------|---------------------------------|
| id         | INT (PK) | Order item ID                   |
| order_id   | INT (FK) | Refers to `orders.id`           |
| menu_id    | INT (FK) | Refers to `menu.id`             |
| quantity   | INT      | Quantity of items in the order  |

---

## 🔁 Application Flow (Control Flow)

### 1. **User Authentication**
- Page: `login.jsp`  
- Logic: `LoginServlet` checks credentials via `UserDAOImp`, sets `HttpSession`, and redirects to `home.jsp`.

### 2. **Homepage & Restaurant Listing**
- Page: `home.jsp`  
- Logic: `RestaurantDAOImp` fetches restaurant list → displayed on homepage

### 3. **Menu Display**
- Servlet: `MenuServlet`
- Logic: Fetches menu items by restaurant ID → forwards to `menu.jsp`

### 4. **Add to Cart**
- Action: Clicking "Add to Cart" → menu item added to session-managed cart
- Model: Uses `Cart` and `CartItem` classes

### 5. **Cart & Checkout**
- Page: `cart.jsp`  
- Logic: Items in session cart displayed → On checkout, `OrderServlet` creates an entry in `orders` and `order_items` tables

### 6. **Order History**
- Page: `order_history.jsp`
- Logic: `OrderHistoryServlet` retrieves all orders placed by the user

### 7. **Logout**
- Logic: `LogoutServlet` clears session and redirects to `login.jsp`

---

## 🚀 How to Run the Project

### Step 1: Clone the Repository

```bash
git clone https://github.com/ZeeshanMalik9/Food_Delivery_Web_APP.git
 ``` 
Step 2: Import into IDE

    Open Eclipse or IntelliJ

    Import as a Dynamic Web Project or Maven Project

    Configure project build path if necessary

Step 3: Set Up MySQL

    Create database: food_delivery_db

    Import tables using MySQL Workbench or manually run the SQL schema based on the above structure

Step 4: Configure Database Connection

    File: DBConnection.java
    Update the JDBC connection details:
```bash
String url = "jdbc:mysql://localhost:3306/food_delivery_db";
String user = "root";
String pass = "your_password";
```


Step 5: Deploy to Tomcat

    Right-click on project → Run As → Run on Server → Choose Apache Tomcat

    OR build .war file and deploy it in Tomcat’s /webapps directory

Step 6: Access in Browser
```bash
    http://localhost:8080/Food_Delivery_Web_APP
```

✅ Features Implemented

    🔐 User Login & Signup

    🏬 Restaurant Listing

    🍱 View Menu by Restaurant

    🛒 Add to Cart

    ✅ Place Order

    📜 Order History

    📸 Images for Menu Items

    ⭐ Menu Ratings

    🧩 MVC Architecture

    🚪 Session Management

    🎨 User-friendly UI

🚧 Future Enhancements

    🛠️ Admin Panel (CRUD for menu & restaurants)

    📱 Mobile responsive UI

    🔍 Search by name, rating, or price

    🔒 Password encryption

    📩 Email confirmation on order

    📄 PDF Invoice generation

👨‍💻 Developer

Zeeshan Malik
B.E(Computer Science and Engineering) Gracuate
💻 Java Full Stack Developer
📫 Reach me on:

    GitHub: https://github.com/ZeeshanMalik9/

    LinkedIn: https://www.linkedin.com/in/zeeshanmalik9/


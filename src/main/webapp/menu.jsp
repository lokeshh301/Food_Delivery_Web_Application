<<<<<<< HEAD
 
 
   <%@ page language="java" contentType="text/html; charset=UTF-8"
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
    pageEncoding="UTF-8"%>
    
    
 <%@ page import="com.proj.models.*,java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Restaurant Menu - FooZee</title>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <!-- Scroll Progress Bar -->
    <div class="scroll-progress"></div>

    <!-- Navigation Bar -->
<<<<<<< HEAD
	<nav class="navbar">
		<div class="nav-container">
			<a href="HomeServlet" class="logo"> <i
				class="fas fa-utensils"></i> FooZee
			</a>
			<div class="nav-links">
				<a href="HomeServlet" class="home-button"> <i
					class="fas fa-home"></i> Home
				</a>
				<div class="nav-dropdown">
					<a href="#"> <i class="fas fa-hamburger"></i> Cuisines
					</a>
					<div class="nav-dropdown-content">
						<a href="#"><i class="fas fa-utensils"></i> Indian</a> <a href="#"><i
							class="fas fa-pizza-slice"></i> Italian</a> <a href="#"><i
							class="fas fa-drumstick-bite"></i> Chinese</a> <a href="#"><i
							class="fas fa-pepper-hot"></i> Mexican</a> <a href="#"><i
							class="fas fa-fish"></i> Japanese</a> <a href="#"><i
							class="fas fa-leaf"></i> Thai</a>
					</div>
				</div>
				<div class="nav-dropdown">
					<a href="#"> <i class="fas fa-bolt"></i> Quick Links
					</a>
					<div class="nav-dropdown-content">
						<a href="#"><i class="fas fa-percent"></i> Best Offers</a> <a
							href="#"><i class="fas fa-star"></i> Top Rated</a> <a href="#"><i
							class="fas fa-clock"></i> New Arrivals</a> <a href="#"><i
							class="fas fa-crown"></i> Premium</a>
					</div>
				</div>
				<div class="nav-dropdown">
					<a href="#"> <i class="fas fa-headset"></i> Help
					</a>
					<div class="nav-dropdown-content">
						<a href="#"><i class="fas fa-headset"></i> Contact Us</a> <a
							href="#"><i class="fas fa-question-circle"></i> FAQs</a> <a
							href="#"><i class="fas fa-info-circle"></i> About Us</a> <a
							href="#"><i class="fas fa-file-alt"></i> Terms & Conditions</a>
					</div>
				</div>
				<a href="cart?action=view" class="cart-link"> <i
					class="fas fa-shopping-cart"></i> Cart 
				</a>
				<a href="orderPage.jsp" class="cart-link"><i class="fas fa-shopping-bag"></i>Orders</a>
			</div>
		</div>
	</nav>
=======
    <nav class="navbar">
        <div class="nav-container">
            <a href="Restaurant.html" class="logo">FooZee</a>
            <div class="nav-links">
                <div class="nav-dropdown">
                    <a href="#">Cuisines</a>
                    <div class="nav-dropdown-content">
                        <a href="#"><i class="fas fa-utensils"></i> Indian</a>
                        <a href="#"><i class="fas fa-pizza-slice"></i> Italian</a>
                        <a href="#"><i class="fas fa-drumstick-bite"></i> Chinese</a>
                        <a href="#"><i class="fas fa-pepper-hot"></i> Mexican</a>
                        <a href="#"><i class="fas fa-fish"></i> Japanese</a>
                        <a href="#"><i class="fas fa-leaf"></i> Thai</a>
                    </div>
                </div>
                <div class="nav-dropdown">
                    <a href="#">Quick Links</a>
                    <div class="nav-dropdown-content">
                        <a href="#"><i class="fas fa-percent"></i> Best Offers</a>
                        <a href="#"><i class="fas fa-star"></i> Top Rated</a>
                        <a href="#"><i class="fas fa-clock"></i> New Arrivals</a>
                        <a href="#"><i class="fas fa-crown"></i> Premium</a>
                    </div>
                </div>
                <div class="nav-dropdown">
                    <a href="#">Help</a>
                    <div class="nav-dropdown-content">
                        <a href="#"><i class="fas fa-headset"></i> Contact Us</a>
                        <a href="#"><i class="fas fa-question-circle"></i> FAQs</a>
                        <a href="#"><i class="fas fa-info-circle"></i> About Us</a>
                        <a href="#"><i class="fas fa-file-alt"></i> Terms & Conditions</a>
                    </div>
                </div>
                <a href="Cart.html" class="cart-link">
                    <i class="fas fa-shopping-cart"></i>
                    Cart <span id="cart-count">0</span>
                </a>
            </div>
        </div>
    </nav>
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79

<%
            
            Restaurant rest = (Restaurant)request.getAttribute("restaurant");
            
            
            
            %>

	
    <!-- Restaurant Hero Section -->
<<<<<<< HEAD
    <section class="hero" style="background-image: url('<%=rest.getImagePath()%>');">
=======
    <section class="hero" style="background-image: url('https://images.unsplash.com/photo-1517248135467-4c7edcad34c4?auto=format&fit=crop&w=1200&q=80');">
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
        <div class="hero-content">
            <h1 id="restaurant-name"><%=rest.getName() %></h1>
            <p id="restaurant-description"><%=rest.getAddress()%></p>
            <div class="restaurant-meta">
                <span class="rating"><%=rest.getRating()%> ★</span>
                <span class="eta"><%=rest.getDeliveryTime()%> min</span>
            </div>
        </div>
    </section>

    <!-- Menu Grid -->
    <div class="menu-container">
        <h2>Popular Items</h2>
        <div class="menu-grid">
            <!-- Menu Item 1 -->
            
            
            <%
            	 List<Menu> list = (List<Menu>)request.getAttribute("list");
            	
            
            for(Menu menu : list ){
            %>	
            
            
           
<<<<<<< HEAD
            <div class="menu-card restaurant-card">
                <img src="<%=menu.getImagePath() %>" alt="Healthy Bowl" class="menu-image">
=======
            <div class="menu-card">
                <img src="https://images.unsplash.com/photo-1546069901-ba9599a7e63c?auto=format&fit=crop&w=500&q=60" alt="Healthy Bowl" class="menu-image">
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
                <div class="menu-info">
                    <h3 class="menu-name"><%=menu.getItemName() %></h3>
                    <p class="menu-description"><%=menu.getDescription() %></p>
                    <p class="menu-price">₹<%=menu.getPrice() %></p>
                 
                 <form action="cart">
                 <input type="hidden" value = "<%=menu.getMenuId()%>" name = "itemId">
                 <input type="hidden" value="1" min="1" name="quntity">
                 <input type="hidden" value="<%=menu.getRestaurantId()%>" name = "restId">
<<<<<<< HEAD
                 <input type="hidden" value="<%=menu.getImagePath() %>" name="imagePath">
                 <input type="hidden" value="add" name="action">
                 <input type="submit" value ="Add To Cart" class="add-to-cart">
=======
                 <input type="hidden" value="add" name="action">
                 <input type="submit" value ="Add To Cart">
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
                 </form>
                
                </div>
            </div>
            
            
            
            
            
         <%    }
            
            %>
            
            
            







        </div>
    </div>

    <!-- Item Modal -->
    <div id="item-modal" class="modal">
        <div class="modal-content">
            <!-- Content will be dynamically inserted here -->
        </div>
    </div>

    <!-- Footer -->
    <footer class="footer">
        <div class="footer-container">
            <div class="footer-section">
                <h3>About FooZee</h3>
                <p>Delivering happiness with the best selection of restaurants and food items right to your doorstep.</p>
                <div class="footer-social">
                    <a href="#" class="social-icon"><i class="fab fa-facebook-f"></i></a>
                    <a href="#" class="social-icon"><i class="fab fa-twitter"></i></a>
                    <a href="#" class="social-icon"><i class="fab fa-instagram"></i></a>
                    <a href="#" class="social-icon"><i class="fab fa-linkedin-in"></i></a>
                </div>
            </div>
            
            <div class="footer-section">
                <h3>Quick Links</h3>
                <ul class="footer-links">
                    <li><a href="#">Browse Restaurants</a></li>
                    <li><a href="#">Popular Cuisines</a></li>
                    <li><a href="#">Special Offers</a></li>
                    <li><a href="#">Gift Cards</a></li>
                    <li><a href="#">Become a Partner</a></li>
                </ul>
            </div>
            
            <div class="footer-section">
                <h3>Help & Support</h3>
                <ul class="footer-links">
                    <li><a href="#">Contact Us</a></li>
                    <li><a href="#">FAQs</a></li>
                    <li><a href="#">Terms & Conditions</a></li>
                    <li><a href="#">Privacy Policy</a></li>
                    <li><a href="#">Refund Policy</a></li>
                </ul>
            </div>
            
            <div class="footer-section">
                <h3>Newsletter</h3>
                <p>Subscribe to our newsletter for exclusive offers and updates.</p>
                <form class="newsletter-form">
                    <input type="email" class="newsletter-input" placeholder="Enter your email">
                    <button type="submit" class="newsletter-button">Subscribe</button>
                </form>
            </div>
        </div>
        
        <div class="footer-bottom">
            <p>&copy; 2024 FooZee. All rights reserved.</p>
            <p>Made with <i class="fas fa-heart" style="color: var(--primary-color);"></i> in India</p>
        </div>
    </footer>

    <script src="js/script.js"></script>
    <script>
        // Scroll Progress Bar
        window.addEventListener('scroll', () => {
            const scrollProgress = document.querySelector('.scroll-progress');
            const totalHeight = document.documentElement.scrollHeight - window.innerHeight;
            const progress = (window.scrollY / totalHeight) * 100;
            scrollProgress.style.width = `${progress}%`;
            
            // Add scrolled class to navbar
            const navbar = document.querySelector('.navbar');
            if (window.scrollY > 50) {
                navbar.classList.add('scrolled');
            } else {
                navbar.classList.remove('scrolled');
            }
        });

        // Update restaurant details based on URL parameter
        document.addEventListener('DOMContentLoaded', () => {
            const urlParams = new URLSearchParams(window.location.search);
            const restaurant = urlParams.get('restaurant');
            
            const restaurants = {
                'spice-garden': {
                    name: 'Spice Garden',
                    description: 'Authentic Indian cuisine with a modern twist',
                    image: 'https://images.unsplash.com/photo-1517248135467-4c7edcad34c4?auto=format&fit=crop&w=1200&q=80'
                },
                'pizza-paradise': {
                    name: 'Pizza Paradise',
                    description: 'Authentic Italian pizzas and pasta',
                    image: 'https://images.unsplash.com/photo-1513104890138-7c749659a591?auto=format&fit=crop&w=1200&q=80'
                },
                // Add more restaurants as needed
            };
            
            if (restaurant && restaurants[restaurant]) {
                const restaurantData = restaurants[restaurant];
                document.getElementById('restaurant-name').textContent = restaurantData.name;
                document.getElementById('restaurant-description').textContent = restaurantData.description;
                document.querySelector('.hero').style.backgroundImage = `url('${restaurantData.image}')`;
                document.title = `${restaurantData.name} - FoodExpress`;
            }
        });
    </script>
</body>
</html>
    
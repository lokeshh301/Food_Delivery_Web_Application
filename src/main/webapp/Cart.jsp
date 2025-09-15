<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.proj.models.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Your Cart - FooZee</title>
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<!-- Scroll Progress Bar -->
	<div class="scroll-progress"></div>

	<!-- Navigation Bar -->
	<nav class="navbar">
		<div class="nav-container">
<<<<<<< HEAD
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
=======
			<a href="Restaurant.html" class="logo">FooZee</a>
			<div class="nav-links">
				<div class="nav-dropdown">
					<a href="#">Cuisines</a>
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
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
<<<<<<< HEAD
					<a href="#"> <i class="fas fa-bolt"></i> Quick Links
					</a>
=======
					<a href="#">Quick Links</a>
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
					<div class="nav-dropdown-content">
						<a href="#"><i class="fas fa-percent"></i> Best Offers</a> <a
							href="#"><i class="fas fa-star"></i> Top Rated</a> <a href="#"><i
							class="fas fa-clock"></i> New Arrivals</a> <a href="#"><i
							class="fas fa-crown"></i> Premium</a>
					</div>
				</div>
				<div class="nav-dropdown">
<<<<<<< HEAD
					<a href="#"> <i class="fas fa-headset"></i> Help
					</a>
=======
					<a href="#">Help</a>
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
					<div class="nav-dropdown-content">
						<a href="#"><i class="fas fa-headset"></i> Contact Us</a> <a
							href="#"><i class="fas fa-question-circle"></i> FAQs</a> <a
							href="#"><i class="fas fa-info-circle"></i> About Us</a> <a
							href="#"><i class="fas fa-file-alt"></i> Terms & Conditions</a>
					</div>
				</div>
<<<<<<< HEAD
				<a href="cart?action=view" class="cart-link"> <i
					class="fas fa-shopping-cart"></i> Cart 
				</a>
				<a href="orderPage.jsp" class="cart-link"><i class="fas fa-shopping-bag"></i>Orders</a>
=======
				<a href="Cart.html" class="cart-link"> <i
					class="fas fa-shopping-cart"></i> Cart <span id="cart-count">0</span>
				</a>
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
			</div>
		</div>
	</nav>

	<!-- Cart Container -->
	<div class="cart-container">
		<h1>Your Cart</h1>


		<%
		Cart cart = (Cart) session.getAttribute("cart");
		Integer restId = (Integer) session.getAttribute("restaurantId");
<<<<<<< HEAD
		
		
		
		
=======
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
		%>



		<%
<<<<<<< HEAD
		if (cart != null && cart.getItems() != null && !cart.getItems().isEmpty()) {
=======
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
		for (CartItem item : cart.getItems().values()) {
		%>

		<!-- Cart Items -->
		<div class="cart-items">
			<div class="cart-item">
				<img
<<<<<<< HEAD
					src="<%=item.getImagePath() %>"
=======
					src="https://images.unsplash.com/photo-1546069901-ba9599a7e63c?auto=format&fit=crop&w=500&q=60"
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
					alt="image not found" class="cart-item-image">
				<div class="cart-item-info">
					<h3 class="cart-item-name"><%=item.getName()%></h3>
					<p class="cart-item-price">
						₹<%=item.getPrice()%></p>

					<div class="quantity-controls">



						<form action="cart">
							<input type="hidden" name="itemId" value="<%=item.getId()%>">
							<input type="hidden" name="action" value="update"> <input
								type="hidden" name="quntity" value="-1">
							<button class="quantity-btn" <%if (item.getQuantity() == 1) {%>
								disabled <%}%>>-</button>
						</form>




						<span><%=item.getQuantity()%></span>

						<form action="cart">
							<input type="hidden" name="itemId" value="<%=item.getId()%>">
							<input type="hidden" name="action" value="update"> <input
								type="hidden" name="quntity" value="+1">
							<button class="quantity-btn" <%if (item.getQuantity() > 10) {%>
								disabled <%}%>>+</button>
						</form>

						<form action="cart">
							<input type="hidden" name="itemId" value="<%=item.getId()%>">
							<input type="hidden" name="action" value="delete">
							<button class="remove-item"
								onclick="removeFromCart('${item.id}')">Remove</button>
						</form>
					</div>
				</div>
			</div>
		</div>

		<%
		}
<<<<<<< HEAD
		}
		else{
			%>
			
			<h1>Cart Is empty</h1>
			
			<% 
		}
=======
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
		%>






		<!-- Cart Summary -->
		<div class="cart-summary">
			<h3>Order Summary</h3>
			<div class="summary-item">
				<span>Subtotal:</span> <span>₹<%=cart.getTotalPrice()%></span>
			</div>
			<div class="summary-item">
				<span>Delivery Fee: </span> <span>₹40.00</span>
			</div>
			<div class="summary-item total">
				<span>Total:</span> <span>₹<%=cart.getTotalPrice() + (cart.getTotalPrice() / 100) * 18%>
					(GST: 18%)
				</span>
			</div>
		</div>





		<!-- Cart Buttons -->
		<div class="cart-buttons">
<<<<<<< HEAD
			<a <%if(restId!=null){ %> href="menuServlet?restaurantId=<%=restId%>"<%} else{ %> href="HomeServlet" <% } %>>
			
			<button class="cart-button add-more-btn">Add More Items</button></a>
			
			<a href="check_out.jsp"> <button class="cart-button checkout-btn">Proceed to Checkout</button> </a>
=======
			<a href="menuServlet?restaurantId=<%=restId%>">
			<button class="cart-button add-more-btn">Add More Items</button></a>
			<button class="cart-button checkout-btn"
				onclick="proceedToCheckout()">Proceed to Checkout</button>
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
		</div>
	</div>





	<!-- Footer -->
	<footer class="footer">
		<div class="footer-container">
			<div class="footer-section">
				<h3>About FooZee</h3>
				<p>Delivering happiness with the best selection of restaurants
					and food items right to your doorstep.</p>
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
					<input type="email" class="newsletter-input"
						placeholder="Enter your email">
					<button type="submit" class="newsletter-button">Subscribe</button>
				</form>
			</div>
		</div>

		<div class="footer-bottom">
			<p>&copy; 2024 FooZee. All rights reserved.</p>
			<p>
				Made with <i class="fas fa-heart"
					style="color: var(--primary-color);"></i> in India
			</p>
		</div>
	</footer>

	<!--     <script src="js/script.js"></script> -->
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

        // Initialize cart page
        document.addEventListener('DOMContentLoaded', () => {
            updateCartPage();
        });
    </script>
</body>
</html>

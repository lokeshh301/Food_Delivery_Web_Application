<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.List"%>
<%@ page import="com.proj.DAO.RestaurantDAO"%>
<%@ page import="com.proj.models.Restaurant"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>FooZee - Find Your Favorite Restaurants</title>
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
<link rel="stylesheet" href="css/styles.css">
<<<<<<< HEAD

<style>
.restaurant-card {
	transition: all 0.3s ease;
	border-radius: 12px;
	overflow: hidden;
	box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
	background-color: white;
}

.restaurant-card:hover {
	transform: translateY(-5px);
	box-shadow: 0 0 20px 4px rgba(255, 0, 0, 0.6); /* pink glow */
}

/* Optional: subtle pulse animation for glow */
@
keyframes glowPulse { 0% {
	box-shadow: 0 0 15px 2px rgba(255, 105, 180, 0.5);
}

50
%
{
box-shadow
:
0
0
25px
5px
rgba(
255
,
105
,
180
,
0.9
);
}
100
%
{
box-shadow
:
0
0
15px
2px
rgba(
255
,
105
,
180
,
0.5
);
}
}
.restaurant-card:hover {
	animation: glowPulse 1.2s infinite ease-in-out;
}
</style>



=======
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
</head>
<body>
	<!-- Scroll Progress Bar -->
	<div class="scroll-progress"></div>

	<!-- Navigation Bar -->
	<nav class="navbar">
		<div class="nav-container">
<<<<<<< HEAD
			<a href="HomeServlet" class="logo"> <i class="fas fa-utensils"></i>
				FooZee
			</a>
			<div class="nav-links">
				<a href="HomeServlet" class="home-button"> <i
=======
			<a href="Restaurant.html" class="logo"> <i
				class="fas fa-utensils"></i> FooZee
			</a>
			<div class="nav-links">
				<a href="Restaurant.html" class="home-button"> <i
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
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

	<!-- Slideshow Container -->
	<div class="slideshow-container">
		<div class="slide active"
			style="background-image: url('https://images.unsplash.com/photo-1504674900247-0877df9cc836?auto=format&fit=crop&w=1200&q=80');">
			<div class="slide-content">
				<h1>Delicious Food Delivered</h1>
				<p>Order from your favorite restaurants</p>
			</div>
		</div>
		<div class="slide"
			style="background-image: url('https://images.unsplash.com/photo-1543353071-873f17a7a088?auto=format&fit=crop&w=1200&q=80');">
			<div class="slide-content">
				<h1>Special Offers</h1>
				<p>Up to 50% off on selected restaurants</p>
			</div>
		</div>
		<div class="slide"
			style="background-image: url('https://images.unsplash.com/photo-1513104890138-7c749659a591?auto=format&fit=crop&w=1200&q=80');">
			<div class="slide-content">
				<h1>Pizza Paradise</h1>
				<p>Fresh from the oven to your doorstep</p>
			</div>
		</div>
		<div class="slide"
			style="background-image: url('https://images.unsplash.com/photo-1551024709-8f23befc6f87?auto=format&fit=crop&w=1200&q=80');">
			<div class="slide-content">
				<h1>Healthy Options</h1>
				<p>Discover our range of healthy meals</p>
			</div>
		</div>
		<div class="slide-dots">
			<span class="dot active"></span> <span class="dot"></span> <span
				class="dot"></span> <span class="dot"></span>
		</div>
	</div>

	<!-- Restaurant Grid -->
	<div class="restaurants-container">
		<div class="restaurant-grid">





			<%
			List<Restaurant> allRestaurant = (List<Restaurant>) request.getAttribute("allRestarant");

			for (Restaurant rest : allRestaurant) {

				System.out.println(rest.getName());
			%>

<<<<<<< HEAD
			<a href="menuServlet?restaurantId=<%=rest.getRestaurantId()%>"
				style="text-decoration: none; color: black;">
=======
			<a href="menuServlet?restaurantId=<%=rest.getRestaurantId()%>">
>>>>>>> ad57b6cc383b0309f196cb15cdf85395ab203d79
				<div class="restaurant-card">
					<img src="<%=rest.getImagePath()%>" alt="Healthy Bites"
						class="restaurant-image">
					<div class="restaurant-info">
						<h3 class="restaurant-name"><%=rest.getName()%></h3>
						<p class="restaurant-description"><%=rest.getAddress()%></p>
						<div class="restaurant-meta">
							<span class="rating"><%=rest.getRating()%> ★</span> <span
								class="eta"><%=rest.getDeliveryTime()%> min</span>
						</div>
					</div>
				</div>

			</a>

			<%
			}
			%>






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

        // Slideshow functionality
        let currentSlide = 0;
        const slides = document.querySelectorAll('.slide');
        const dots = document.querySelectorAll('.dot');
        
        function showSlide(n) {
            slides.forEach(slide => slide.classList.remove('active'));
            dots.forEach(dot => dot.classList.remove('active'));
            
            currentSlide = (n + slides.length) % slides.length;
            slides[currentSlide].classList.add('active');
            dots[currentSlide].classList.add('active');
        }
        
        function nextSlide() {
            showSlide(currentSlide + 1);
        }
        
        // Add click events to dots
        dots.forEach((dot, index) => {
            dot.addEventListener('click', () => showSlide(index));
        });
        
        // Auto-advance slides
        setInterval(nextSlide, 5000);
    </script>
</body>
</html>

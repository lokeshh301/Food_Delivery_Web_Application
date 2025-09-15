<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.proj.models.*, java.util.List, com.proj.DOAImp.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Order History</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;600&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
	integrity="sha512-9usAa10IRO0HhonpyAIVpjrylPvoDwiPUiKdWk5t3PyolY1cOd4DSE0Ga+ri4AuTroPR5aQvXU9xC6qOPnzFeg=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
<link rel="stylesheet" href="css/styles.css">
<link rel="stylesheet" href="css/orderPage.css">

</head>
<body>
	<nav class="navbar">
		<div class="nav-container">
			<a href="HomeServlet" class="logo"> <i class="fas fa-utensils"></i>
				FooZee
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
				<a href="orderPage.jsp" class="cart-link"><i
					class="fas fa-shopping-bag"></i>Orders</a>
			</div>
		</div>
	</nav>




	<%
	OrderDAOImp odo = new OrderDAOImp();
	RestaurantDAOImp rdo = new RestaurantDAOImp();
	Users user = (Users) session.getAttribute("user");

	if (user != null) {
		List<Order> allOrders = odo.getAllOrders(user.getUserId());
	%>

	<div class="container">
		<h2>Your Orders</h2>
		<ul class="order-list">
			<%
			if (allOrders != null) {
				for (Order order : allOrders) {
			%>

			<li class="order-item">
				<div class="order-details">
					<h3>
						Order #<%=order.getOrderId()%></h3>
					<p>
						<strong>Restaurant:</strong>
						<%=rdo.getRestName(order.getRestaurantId())%></p>
					<p>
						<strong>Total:</strong>
						<%=order.getTotalAmount()%></p>
					<p class="order-meta">
						Ordered on
						<%=order.getOrderTime()%></p>
					<strong><hr> </strong>
					<p class="order-meta">
						<strong>Payment Method:</strong>
						<%=order.getPaymentMethod()%></p>
					<p class="order-meta">
						<strong>Total Ammount:</strong>
						<%=order.getTotalAmount()%></p>

					<p class="order-meta status status-delivered">
						<i class="fas fa-check-circle"></i> Status:
						<%=order.getStatus()%></p>
				</div>

			</li>
			<%
			}
			}
			}
			%>
		</ul>
	</div>

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
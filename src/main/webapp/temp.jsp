<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.proj.models.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order Confirmation</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="css/order.css">
</head>
<body>

	<% Order order = (Order)session.getAttribute("order"); %>

    <div class="bike-container">
        <div class="road"></div>
        <div class="bike">
            <i class="fas fa-motorcycle"></i>
        </div>
    </div>

    <div class="celebration">🎉 Order Confirmed! 🎉</div>

    <div class="container">
        <h1 class="pulse">Your Order Details</h1>
        <div class="order-details">
            <h3>Order ID: <%=order.getOrderId() %></h3>
            <h3>Delivery Address: <%=order.getAddress() %></h3>
            <h3>Payment Method: <%=order.getPaymentMethod() %></h3>
            <h3>Status: <%=order.getStatus() %></h3>
            <h3>Ordered Time: <%=order.getOrderTime() %></h3>
            <h3>Total Amount: <%=order.getTotalAmount() %></h3>
        </div>
    </div>

    <a href="HomeServlet"><button onclick="window.location.href='../login page/index.html'" class="home-button">
        <i class="fas fa-home"></i> Back to Home
    </button></a>

    <script src="js/order.js"></script>
</body>
</html>
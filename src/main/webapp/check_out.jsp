<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.proj.models.*" %>
 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Checkout | FoodieFiesta</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="css/check_out.css">
</head>
<body>
    <div class="checkout-container">
        <header>
            <h1>Checkout</h1>
        </header>

        <form action="checkOut" >
            <section class="address-form">
                <h2>Enter Delivery Address</h2>
                <div class="form-group">
                    <label for="name">Full Name:</label>
                    <input type="text" id="name" name="name" placeholder="John Doe" required>
                </div>
                <div class="form-group">
                    <label for="address">Street Address:</label>
                    <input type="text" id="address" name="address" placeholder="123 Main St" required>
                </div>
                <div class="form-group">
                    <label for="city">City:</label>
                    <input type="text" id="city" name="city" placeholder="Anytown" required>
                </div>
                <div class="form-group">
                    <label for="zip">Zip Code:</label>
                    <input type="text" id="zip" name="zip" placeholder="12345" required>
                </div>
            </section>

            <section class="payment-options">
                <h2>Select Payment Method</h2>
                <div class="payment-methods">
                    <div class="payment-option">
                        <input type="radio" id="creditCard" name="paymentMethod" value="creditCard" required>
                        <label for="creditCard">Credit Card</label>
                        <div class="card-details" id="cardDetails">
                            <div class="form-group">
                                <label for="cardNumber">Card Number:</label>
                                <input type="text" id="cardNumber" name="cardNumber" placeholder="1234-5678-9012-3456">
                            </div>
                            <div class="form-group">
                                <label for="expiry">Expiry Date:</label>
                                <input type="text" id="expiry" name="expiry" placeholder="MM/YY">
                            </div>
                            <div class="form-group">
                                <label for="cvv">CVV:</label>
                                <input type="text" id="cvv" name="cvv" placeholder="123">
                            </div>
                        </div>
                    </div>
                    <div class="payment-option">
                        <input type="radio" id="paypal" name="paymentMethod" value="paypal">
                        <label for="paypal">PayPal</label>
                    </div>
                    <div class="payment-option">
                        <input type="radio" id="cashOnDelivery" name="paymentMethod" value="cashOnDelivery">
                        <label for="cashOnDelivery">Cash on Delivery</label>
                    </div>
                </div>
            </section>

            <button type="submit" id="placeOrder">Place Order</button>
        </form>
    </div>

  
</body>
</html>
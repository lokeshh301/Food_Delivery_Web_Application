<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login & Registration | FoodieFiesta</title>
    <!-- Font Awesome for Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/login.css">
    
  <style>
    .password-container {
      position: relative;
      width: 100%;
    }

    .password-container input[type="password"],
    .password-container input[type="text"] {
      width: 100%;
      padding: 10px 40px 10px 10px;
      border: 1px solid #ccc;
      border-radius: 8px;
      background-color: #e6f0ff;
      font-size: 16px;
    }

    .toggle-password {
      position: absolute;
      top: 50%;
      right: 10px;
      transform: translateY(-50%);
      cursor: pointer;
      font-size: 18px;
      color: #555;
    }
  </style>
    
</head>
<body>

    <div class="container" id="container">
        <!-- Sign Up Form -->
        <div class="form-container sign-up-container">
            <form action="LoginPage" method="post" id="signUpForm">
                <h1>Create Account</h1>
                <div class="social-container">
                    <a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
                    <a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
                    <a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
                </div>
                <span>or use your email for registration</span>
                <div class="input-group">
                    <input type="text" name="RuserName" id="signUpName" placeholder="Name" required>
                    <small class="error-message"></small>
                </div>
                <div class="input-group">
                    <input type="email" name="Remail" id="signUpEmail" placeholder="Email" required>
                    <small class="error-message"></small>
                </div>
                <div class="input-group">
                    <div class="password-container">
                        <input type="password" name="Rpassword" id="signUpPassword" placeholder="Password" required>
                        <span class="toggle-password" onclick="togglePassword('signUpPassword', this)">👁️</span>
                    </div>
                    <small class="error-message"></small>
                </div>
                <div class="input-group">
                    <input type="number" name="RphoneNumber" id="signUpPhone" placeholder="Phone Number" required>
                    <small class="error-message"></small>
                </div>
                <div class="input-group">
                    <input type="text" name="Raddress" id="signUpAddress" placeholder="Address" required>
                    <small class="error-message"></small>
                </div>
                <div class="input-group">
                    <label for="role">Select Role:</label>
                    <select name="Rrole" id="role">
                        <option value="customer">Customer</option>
                        <option value="restaurant_admin">Restaurant Admin</option>
                        <option value="delivery_agent">Delivery Agent</option>
                        <option value="super_admin">Super Admin</option>
                    </select>
                    <small class="error-message"></small>
                </div>
                <input type="hidden" name="method" value="Register">
                <button type="submit">Sign Up</button>
                <a href="#" class="mobile-link" id="mobileSignInLink">Already have an account? Sign In</a>
            </form>
        </div>

        <!-- Sign In Form -->
        <div class="form-container sign-in-container">

            <%-- show error only here --%>
            <%
                String error = (String) session.getAttribute("error");
                if (error != null && error.equalsIgnoreCase("yes")) {
            %>
                <div style="text-align:center; color:red; font-weight:bold; margin-bottom: 10px;">
                    Wrong email or password
                </div>
            <%
                    session.removeAttribute("error");
                }
            %>

            <form action="LoginPage" method="post" id="signInForm">
                <h1>Sign In</h1>
                <div class="social-container">
                    <a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
                    <a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
                    <a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
                </div>
                <span>or use your account</span>
                <div class="input-group">
                    <input type="email" name="Semail" id="signInEmail" placeholder="Email" required>
                    <small class="error-message"></small>
                </div>
                <div class="input-group">
                    <div class="password-container">
                        <input type="password" name="Spassword" id="signInPassword" placeholder="Password" required>
                        <span class="toggle-password" onclick="togglePassword('signInPassword', this)">👁️</span>
                    </div>
                    <small class="error-message"></small>
                </div>
                <input type="hidden" name="method" value="signIn">
                <a href="#">Forgot your password?</a>
                <button type="submit">Sign In</button>
                <a href="#" class="mobile-link" id="mobileSignUpLink">Don't have an account? Sign Up</a>
            </form>
        </div>

        <!-- Overlay for Desktop Animation -->
        <div class="overlay-container">
            <div class="overlay">
                <div class="overlay-panel overlay-left">
                    <h1>Welcome Back!</h1>
                    <p>To keep connected with us please login with your personal info</p>
                    <button class="ghost" id="signIn">Sign In</button>
                </div>
                <div class="overlay-panel overlay-right">
                    <h1>Hello, Friend!</h1>
                    <p>Enter your personal details and start your journey with us</p>
                    <button class="ghost" id="signUp">Sign Up</button>
                </div>
            </div>
        </div>
    </div>

    <script src="js/login.js"></script>
    <script>
      function togglePassword(inputId, icon) {
        const passwordInput = document.getElementById(inputId);
        if (passwordInput.type === "password") {
          passwordInput.type = "text";
          icon.textContent = "🙈";
        } else {
          passwordInput.type = "password";
          icon.textContent = "👁️";
        }
      }
    </script>
    
</body>
</html>

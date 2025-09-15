// Cart Management
let cart = JSON.parse(localStorage.getItem('cart')) || [];

function updateCart() {
    localStorage.setItem('cart', JSON.stringify(cart));
    updateCartCount();
}

function updateCartCount() {
    const cartCount = document.getElementById('cart-count');
    if (cartCount) {
        cartCount.textContent = cart.reduce((total, item) => total + item.quantity, 0);
    }
}

// Modal Management
function openModal(item) {
    const modal = document.getElementById('item-modal');
    const modalContent = document.querySelector('.modal-content');
    
    modalContent.innerHTML = `
        <span class="close-modal">&times;</span>
        <img src="${item.image}" alt="${item.name}" class="menu-image">
        <h2>${item.name}</h2>
        <p>${item.description}</p>
        <p class="menu-price">₹${item.price}</p>
        <div class="quantity-controls">
            <button onclick="decreaseQuantity('modal-quantity')">-</button>
            <span id="modal-quantity">1</span>
            <button onclick="increaseQuantity('modal-quantity')">+</button>
        </div>
        <button class="add-to-cart" onclick="addToCartFromModal('${item.id}', '${item.name}', ${item.price}, '${item.image}')">
            Add to Cart
        </button>
    `;

    modal.style.display = 'block';

    // Close modal when clicking outside
    modal.onclick = function(event) {
        if (event.target === modal) {
            modal.style.display = 'none';
        }
    };

    // Close modal when clicking X
    const closeBtn = document.querySelector('.close-modal');
    closeBtn.onclick = function() {
        modal.style.display = 'none';
    };
}

function decreaseQuantity(elementId) {
    const quantityElement = document.getElementById(elementId);
    let quantity = parseInt(quantityElement.textContent);
    if (quantity > 1) {
        quantityElement.textContent = quantity - 1;
    }
}

function increaseQuantity(elementId) {
    const quantityElement = document.getElementById(elementId);
    let quantity = parseInt(quantityElement.textContent);
    quantityElement.textContent = quantity + 1;
}

function addToCartFromModal(id, name, price, image) {
    const quantity = parseInt(document.getElementById('modal-quantity').textContent);
    
    const existingItemIndex = cart.findIndex(item => item.id === id);
    
    if (existingItemIndex !== -1) {
        cart[existingItemIndex].quantity += quantity;
    } else {
        cart.push({
            id,
            name,
            price,
            image,
            quantity
        });
    }
    
    updateCart();
    document.getElementById('item-modal').style.display = 'none';
    
    // Show success message
    showToast('Item added to cart!');
}

// Cart Page Functions
//function updateCartPage() {
//    const cartContainer = document.querySelector('.cart-items');
//    const cartSummary = document.querySelector('.cart-summary');
//    
//    if (!cartContainer) return;
//    
//    if (cart.length === 0) {
//        cartContainer.innerHTML = '<p>Your cart is empty</p>';
//        cartSummary.style.display = 'none';
//        return;
//    }
//    
//    cartContainer.innerHTML = cart.map(item => `
//        <div class="cart-item">
//            <img src="${item.image}" alt="${item.name}" class="cart-item-image">
//            <div class="cart-item-info">
//                <h3 class="cart-item-name">${item.name}</h3>
//                <p class="cart-item-price">₹${item.price}</p>
//                <div class="quantity-controls">
//                    <button class="quantity-btn" onclick="updateCartItemQuantity('${item.id}', ${item.quantity - 1})">-</button>
//                    <span>${item.quantity}</span>
//                    <button class="quantity-btn" onclick="updateCartItemQuantity('${item.id}', ${item.quantity + 1})">+</button>
//                    <button class="remove-item" onclick="removeFromCart('${item.id}')">Remove</button>
//                </div>
//            </div>
//        </div>
//    `).join('');
//    
//    updateCartSummary();
//}

function updateCartItemQuantity(id, newQuantity) {
    if (newQuantity < 1) {
        removeFromCart(id);
        return;
    }
    
    const itemIndex = cart.findIndex(item => item.id === id);
    if (itemIndex !== -1) {
        cart[itemIndex].quantity = newQuantity;
        updateCart();
        updateCartPage();
    }
}

function removeFromCart(id) {
    cart = cart.filter(item => item.id !== id);
    updateCart();
    updateCartPage();
}

function updateCartSummary() {
    const cartSummary = document.querySelector('.cart-summary');
    if (!cartSummary) return;
    
    const subtotal = cart.reduce((total, item) => total + (item.price * item.quantity), 0);
    const deliveryFee = 40;
    const total = subtotal + deliveryFee;
    
    cartSummary.innerHTML = `
        <h3>Order Summary</h3>
        <div class="summary-item">
            <span>Subtotal:</span>
            <span>₹${subtotal.toFixed(2)}</span>
        </div>
        <div class="summary-item">
            <span>Delivery Fee:</span>
            <span>₹${deliveryFee.toFixed(2)}</span>
        </div>
        <div class="summary-item total">
            <span>Total:</span>
            <span>₹${total.toFixed(2)}</span>
        </div>
    `;
}

// Toast Notification
function showToast(message) {
    const toast = document.createElement('div');
    toast.className = 'toast';
    toast.textContent = message;
    document.body.appendChild(toast);
    
    setTimeout(() => {
        toast.classList.add('show');
        setTimeout(() => {
            toast.classList.remove('show');
            setTimeout(() => {
                document.body.removeChild(toast);
            }, 300);
        }, 2000);
    }, 100);
}

// Initialize
document.addEventListener('DOMContentLoaded', () => {
    updateCartCount();
    if (window.location.pathname.includes('cart.html')) {
        updateCartPage();
    }
}); 
let searchForm = document.querySelector('.search-form');
 document.querySelector('#search-btn').onclick=()=>{
     searchForm.classList.toggle('active');
    shoppingCart.classList.remove('active');
    login.classList.remove('active');
    navbar.classList.remove('active');
 }
 let shoppingCart= document.querySelector('.shopping-cart');
 document.querySelector('#cart-btn').onclick=()=>{
     shoppingCart.classList.toggle('active');
     searchForm.classList.remove('active');
    login.classList.remove('active');
    navbar.classList.remove('active');
 }
 let login= document.querySelector('.login-form');
 document.querySelector('#login-btn').onclick=()=>{
     login.classList.toggle('active');
     searchForm.classList.remove('active');
    shoppingCart.classList.remove('active');
    navbar.classList.remove('active');
 }
 let navbar= document.querySelector('.navbar');
 document.querySelector('#menu-btn').onclick=()=>{
     navbar.classList.toggle('active');
     searchForm.classList.remove('active');
    shoppingCart.classList.remove('active');
    login.classList.remove('active');
 }

window.onscroll=()=>
{   searchForm.classList.remove('active');
    shoppingCart.classList.remove('active');
    login.classList.remove('active');
    navbar.classList.remove('active');
}
$(document).ready(function() {
    $('.read-more').on('click', function(event) {
        event.preventDefault(); // Prevent default link behavior
        const description = $(this).data('description'); // Get the description from data attribute
        $('#modalDescription').text(description); // Set the description in the modal
        $('#descriptionModal').modal('show'); // Show the modal
    });
});
function addToCart(productName, productPrice) {
    const cartItem = {
        name: productName,
        price: productPrice,
        quantity: 1 // Default quantity
    };

    // Get the existing cart from local storage or initialize an empty cart
    let cart = JSON.parse(localStorage.getItem('shoppingCart')) || [];

    // Check if the item already exists in the cart
    const existingItemIndex = cart.findIndex(item => item.name === productName);
    if (existingItemIndex > -1) {
        // If it exists, increase the quantity
        cart[existingItemIndex].quantity += 1;
    } else {
        // If it doesn't exist, add the new item
        cart.push(cartItem);
    }

    // Save the updated cart back to local storage
    localStorage.setItem('shoppingCart', JSON.stringify(cart));
    updateCartDisplay();
    alert(`${productName} has been added to your cart!`);
}

// Function to update the cart display
function updateCartDisplay() {
    const cartItemsContainer = document.getElementById('cartItems');
    cartItemsContainer.innerHTML = ''; // Clear existing items

    const cart = JSON.parse(localStorage.getItem('shoppingCart')) || [];
    if (cart.length === 0) {
        cartItemsContainer.innerHTML = '<p>Your cart is empty.</p>';
        return;
    }

    cart.forEach((item, index) => {
        const cartItemDiv = document.createElement('div');
        cartItemDiv.className = 'cart-item';
        cartItemDiv.innerHTML = `
            <h5>${item.name} (₹${item.price}) x ${item.quantity}</h5>
            <button class="btn btn-danger btn-sm" onclick="removeFromCart(${index})">Remove</button>
        `;
        cartItemsContainer.appendChild(cartItemDiv);
    });
}

// Function to remove items from the cart
function removeFromCart(index) {
    let cart = JSON.parse(localStorage.getItem('shoppingCart')) || [];
    cart.splice(index, 1); // Remove the item at the specified index
    localStorage.setItem('shoppingCart', JSON.stringify(cart));
    updateCartDisplay();
    alert('Item removed from cart!');
}

// Initial call to update cart display on page load
updateCartDisplay();
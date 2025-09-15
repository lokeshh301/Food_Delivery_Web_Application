/**
 * 
 */

document.addEventListener('DOMContentLoaded', function () {
    const addressForm = document.querySelector('.address-form');
    const paymentOptions = document.querySelector('.payment-options');
    const confirmOrder = document.querySelector('.confirm-order');

    const nextToPaymentButton = document.getElementById('nextToPayment');
    const nextToConfirmButton = document.getElementById('nextToConfirm');
    const backToAddressButton = document.getElementById('backToAddress');
    const backToPaymentButton = document.getElementById('backToPayment');
    const placeOrderButton = document.getElementById('placeOrder');

    const confirmName = document.getElementById('confirmName');
    const confirmAddress = document.getElementById('confirmAddress');
    const confirmCityZip = document.getElementById('confirmCityZip');
    const confirmPaymentMethod = document.getElementById('confirmPaymentMethod');

    const progressBar = document.querySelector('.progress-bar');
    const steps = document.querySelectorAll('.step');

    // Function to update progress bar
    function updateProgressBar(currentStep) {
        steps.forEach((step, index) => {
            if (index < currentStep) {
                step.classList.add('active');
            } else {
                step.classList.remove('active');
            }
        });
    }

    // Next to Payment
    nextToPaymentButton.addEventListener('click', function () {
        addressForm.style.display = 'none';
        paymentOptions.style.display = 'block';
        confirmOrder.style.display = 'none';
        updateProgressBar(1);
    });

    // Next to Confirm
    nextToConfirmButton.addEventListener('click', function () {
        paymentOptions.style.display = 'none';
        confirmOrder.style.display = 'block';
        addressForm.style.display = 'none';
        updateProgressBar(2);

        // Populate confirmation details
        confirmName.textContent = document.getElementById('name').value;
        confirmAddress.textContent = document.getElementById('address').value;
        confirmCityZip.textContent = `${document.getElementById('city').value}, ${document.getElementById('zip').value}`;

        let paymentMethod = document.querySelector('input[name="paymentMethod"]:checked');
        if (paymentMethod) {
            confirmPaymentMethod.textContent = paymentMethod.labels[0].textContent;
        } else {
            confirmPaymentMethod.textContent = 'No payment method selected';
        }
    });

    // Back to Address
    backToAddressButton.addEventListener('click', function () {
        paymentOptions.style.display = 'none';
        addressForm.style.display = 'block';
        confirmOrder.style.display = 'none';
        updateProgressBar(0);
    });

    // Back to Payment
    backToPaymentButton.addEventListener('click', function () {
        paymentOptions.style.display = 'block';
        confirmOrder.style.display = 'none';
        addressForm.style.display = 'none';
        updateProgressBar(1);
    });

    // Place Order
   

    // Payment method selection
    document.querySelectorAll('input[name="paymentMethod"]').forEach(radio => {
        radio.addEventListener('change', function () {
            const cardDetails = document.querySelector('.card-details');
            if (this.value === 'creditCard') {
                cardDetails.style.display = 'block';
            } else {
                cardDetails.style.display = 'none';
            }
        });
    });
});
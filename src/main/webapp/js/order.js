/**
 * 
 */
document.addEventListener('DOMContentLoaded', () => {
    // Function to parse URL parameters
    function getUrlParameter(name) {
        name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
        const regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
        const results = regex.exec(location.search);
        return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
    }

    // Populate order details from URL
    const name = getUrlParameter('name');
    const address = getUrlParameter('address');
    const city = getUrlParameter('city');
    const zip = getUrlParameter('zip');
    const paymentMethod = getUrlParameter('paymentMethod');

    document.getElementById('orderId').textContent = `ORD-${Math.floor(Math.random() * 100000)}`;
    document.getElementById('orderName').textContent = name || 'N/A';
    document.getElementById('orderAddress').textContent = `${address}, ${city}, ${zip}` || 'N/A';
    document.getElementById('paymentMethod').textContent = paymentMethod.replace(/([A-Z])/g, ' $1').trim() || 'N/A';
    document.getElementById('orderStatus').textContent = 'Confirmed';
    document.getElementById('orderTime').textContent = new Date().toLocaleString();

    // Staggered animation for order details
    const orderDetails = document.querySelectorAll('.order-details h3');
    orderDetails.forEach((detail, index) => {
        detail.style.animationDelay = `${3.8 + (index * 0.2)}s`;
    });

    // --- Advanced Animations ---

    // 1. Confetti Effect
    function createConfetti() {
        const confettiCount = 100;
        const colors = ['#ff4e4e', '#4caf50', '#4c79af', '#fdd835', '#9c27b0'];
        for (let i = 0; i < confettiCount; i++) {
            const confetti = document.createElement('div');
            confetti.style.cssText = `
                position: fixed;
                width: ${Math.random() * 10 + 5}px;
                height: ${Math.random() * 10 + 5}px;
                background: ${colors[Math.floor(Math.random() * colors.length)]};
                top: -20px;
                left: ${Math.random() * 100}vw;
                opacity: 1;
                transform: rotate(${Math.random() * 360}deg);
                animation: fall ${Math.random() * 3 + 2}s linear forwards;
            `;
            document.body.appendChild(confetti);
            setTimeout(() => confetti.remove(), 5000);
        }
    }

    // Trigger confetti after the main celebration text appears
    setTimeout(createConfetti, 3100);

    // 2. Button Hover Sound Effect
    const button = document.querySelector('.home-button');
    let hoverAudio;
    try {
        // Pre-decode the audio data for faster playback on hover
        hoverAudio = new Audio('data:audio/mp3;base64,SUQzBAAAAAAAI1RTU0UAAAAPAAADTGF2ZjU4LjI5LjEwMAAAAAAAAAAAAAAA//tQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAWGluZwAAAA8AAAACAAADQABISEhISEhISEhISEhISEhISEhISEhISEhISEhISEhISEhISEhISEhISEhISEhISEhI//////////////////////////////////////////////////////////////////8AAAAATGF2YzU4LjU0AAAAAAAAAAAAAAAAJAAAAAAAAAAAEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA');
        hoverAudio.volume = 0.1;
    } catch (e) {
        console.error("Could not create audio object.", e);
    }

    if (button && hoverAudio) {
        button.addEventListener('mouseenter', () => {
            // Reset and play the sound
            hoverAudio.currentTime = 0;
            hoverAudio.play().catch(error => console.error("Audio play failed:", error));
        });
    }
});
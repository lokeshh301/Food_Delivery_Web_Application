/**
 * 
 */

// --- Elements for Desktop Panel Switching ---
const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');

// --- Elements for Mobile Panel Switching ---
const mobileSignUpLink = document.getElementById('mobileSignUpLink');
const mobileSignInLink = document.getElementById('mobileSignInLink');

// --- Form and Input Elements ---
const signInForm = document.getElementById('signInForm');
const signUpForm = document.getElementById('signUpForm');

const signInEmail = document.getElementById('signInEmail');
const signInPassword = document.getElementById('signInPassword');

const signUpName = document.getElementById('signUpName');
const signUpEmail = document.getElementById('signUpEmail');
const signUpPassword = document.getElementById('signUpPassword');

// --- Desktop Panel Switching Logic ---
if (signUpButton && signInButton && container) {
    signUpButton.addEventListener('click', () => {
        container.classList.add('right-panel-active');
    });

    signInButton.addEventListener('click', () => {
        container.classList.remove('right-panel-active');
    });
}

// --- Mobile Panel Switching Logic ---
if (mobileSignUpLink && mobileSignInLink && container) {
    mobileSignUpLink.addEventListener('click', (e) => {
        e.preventDefault();
        container.classList.add('mobile-show-signup');
    });

    mobileSignInLink.addEventListener('click', (e) => {
        e.preventDefault();
        container.classList.remove('mobile-show-signup');
    });
}

// --- Form Validation Logic ---

const setError = (input, message) => {
    const inputGroup = input.parentElement;
    const errorDisplay = inputGroup.querySelector('.error-message');

    errorDisplay.innerText = message;
    inputGroup.classList.add('error');
    inputGroup.classList.remove('success');
}

const setSuccess = (input) => {
    const inputGroup = input.parentElement;
    const errorDisplay = inputGroup.querySelector('.error-message');

    errorDisplay.innerText = '';
    inputGroup.classList.add('success');
    inputGroup.classList.remove('error');
}

const isValidEmail = email => {
    const re = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(String(email).toLowerCase());
}

const validateSignUp = () => {
    let isValid = true;
    const nameValue = signUpName.value.trim();
    const emailValue = signUpEmail.value.trim();
    const passwordValue = signUpPassword.value.trim();

    if (nameValue === '') {
        setError(signUpName, 'Name is required');
        isValid = false;
    } else {
        setSuccess(signUpName);
    }

    if (emailValue === '') {
        setError(signUpEmail, 'Email is required');
        isValid = false;
    } else if (!isValidEmail(emailValue)) {
        setError(signUpEmail, 'Provide a valid email address');
        isValid = false;
    } else {
        setSuccess(signUpEmail);
    }

    if (passwordValue === '') {
        setError(signUpPassword, 'Password is required');
        isValid = false;
    } else if (passwordValue.length < 8) {
        setError(signUpPassword, 'Password must be at least 8 characters.');
        isValid = false;
    } else {
        setSuccess(signUpPassword);
    }
    return isValid;
};

//signUpForm.addEventListener('submit', e => {
//    e.preventDefault();
//    if (validateSignUp()) {
//        // If validation is successful, you can submit the form or show a success message
//        alert('Sign Up Successful!');
//        // signUpForm.submit(); // Uncomment to allow form submission
//    }
//});

// You can add similar validation for the Sign In form
//signInForm.addEventListener('submit', e => {
//    e.preventDefault();
//    // Add validation logic for sign-in here
//    alert('Sign In button clicked. Add validation!');
//});
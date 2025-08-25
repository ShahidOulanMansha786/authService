package com.authservice.utils;

public class ValidationUtil {
    // Password Regex:
    // ^(?=.*[A-Z])      → kam se kam ek uppercase letter
    // (?=.*[0-9])       → kam se kam ek digit
    // (?=.*[@$!%*?&])   → kam se kam ek special character
    // .{8,}             → minimum 8 characters
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&]).{8,}$";

    // Email Regex:
    // basic email validation
    private static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    // ✅ Password check
    public static boolean isValidPassword(String password) {
        return password != null && password.matches(PASSWORD_PATTERN);
    }

    // ✅ Email check
    public static boolean isValidEmail(String email) {
        return email != null && email.matches(EMAIL_PATTERN);
    }
}

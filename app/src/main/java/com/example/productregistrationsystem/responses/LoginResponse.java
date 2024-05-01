package com.example.productregistrationsystem.responses;

public class LoginResponse {
    private String accessToken;  // Access token for authentication
    private String refreshToken;  // Refresh token for generating new access tokens
    private String tokenType;  // Type of token (usually "bearer")

    // Getters and setters for each field

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}

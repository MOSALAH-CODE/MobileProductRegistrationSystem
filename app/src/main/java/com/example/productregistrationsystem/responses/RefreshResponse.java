package com.example.productregistrationsystem.responses;

public class RefreshResponse {
    private String accessToken;  // New access token after refresh
    private String tokenType;  // Type of token (usually "bearer")

    // Getters and setters for each field

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}

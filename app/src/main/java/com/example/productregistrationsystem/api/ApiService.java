package com.example.productregistrationsystem.api;

import com.example.productregistrationsystem.responses.LoginResponse;
import com.example.productregistrationsystem.models.Product;
import com.example.productregistrationsystem.responses.UserResponse;
import com.example.productregistrationsystem.schemas.UserCreate;
import com.example.productregistrationsystem.schemas.UserUpdate;
import com.example.productregistrationsystem.schemas.ProductCreate;
import com.example.productregistrationsystem.schemas.ProductUpdate;
import com.example.productregistrationsystem.schemas.UserLogin;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.*;

public interface ApiService {
    @POST("/api/v1/users/register")
    Call<UserResponse> registerUser(@Body UserCreate userCreate);

    @GET("/api/v1/users/")
    Call<UserResponse> getCurrentUser();

    @PUT("/api/v1/users/")
    Call<UserResponse> updateUser(@Body UserUpdate userUpdate);

    @DELETE("/api/v1/users/")
    Call<Void> deleteUser();

    @POST("/api/v1/products/")
    Call<Product> createProduct(@Body ProductCreate productCreate);

    @GET("/api/v1/products/{product_id}")
    Call<Product> getProductById(@Path("product_id") int product_id);

    @PUT("/api/v1/products/{product_id}")
    Call<Product> updateProduct(@Path("product_id") int product_id, @Body ProductUpdate productUpdate);

    @DELETE("/api/v1/products/{product_id}")
    Call<Void> deleteProduct(@Path("product_id") int product_id);

    @POST("/api/v1/auth/login")
    Call<LoginResponse> login(@Body UserLogin userLogin);

    @GET("/api/v1/products")  // Endpoint to fetch all products
    Call<List<Product>> getProducts();

//    @POST("/api/v1/auth/refresh")
//    Call<RefreshResponse> refreshToken(@Form("refresh_token") String refresh_token);
}


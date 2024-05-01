package com.example.productregistrationsystem.activities.auth;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.productregistrationsystem.R;
import com.example.productregistrationsystem.activities.products.ProductsActivity;
import com.example.productregistrationsystem.api.ApiService;
import com.example.productregistrationsystem.api.RetrofitClient;
import com.example.productregistrationsystem.responses.LoginResponse;
import com.example.productregistrationsystem.schemas.UserLogin;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class LoginActivity extends AppCompatActivity {
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEditText = findViewById(R.id.editTextEmail);
        passwordEditText = findViewById(R.id.editTextPassword);
        loginButton = findViewById(R.id.buttonLogin);

        loginButton.setOnClickListener(v -> {
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            login(email, password);
        });
    }

    private void login(String email, String password) {
        // TODO implement login
        // Instantiate the RequestQueue.
//        Intent intent = new Intent(LoginActivity.this, ProductsActivity.class);
//        startActivity(intent);
        Retrofit retrofit = RetrofitClient.getClient();
        ApiService apiService = retrofit.create(ApiService.class);

        UserLogin userLogin = new UserLogin();
        userLogin.setEmail(email);
        userLogin.setPassword(password);

        Call<LoginResponse> call = apiService.login(userLogin);

        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()) {
                    LoginResponse loginResponse = response.body();
                    // Store access token and refresh token securely
                    // Navigate to the main activity or dashboard
                } else {
                    Toast.makeText(LoginActivity.this, "Login failed: " + response.message(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Log.d("Network error", t.getMessage());
                Toast.makeText(LoginActivity.this, "Network error: " + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
package com.example.productregistrationsystem.activities.auth;


import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.productregistrationsystem.R;
import com.example.productregistrationsystem.activities.products.ProductsActivity;

public class RegistrationActivity extends AppCompatActivity {
    private EditText fullNameEditText;
    private EditText usernameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        fullNameEditText = findViewById(R.id.editTextFullName);
        usernameEditText = findViewById(R.id.editTextUsername);
        emailEditText = findViewById(R.id.editTextEmail);
        passwordEditText = findViewById(R.id.editTextPassword);
        registerButton = findViewById(R.id.buttonRegister);

        registerButton.setOnClickListener(v -> {
            String fullName = fullNameEditText.getText().toString();
            String username = usernameEditText.getText().toString();
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            register(fullName, username, email, password);
        });
    }

    private void register(String fullName, String username, String email, String password) {
//        TODO implement register
        Intent intent = new Intent(RegistrationActivity.this, ProductsActivity.class);
        startActivity(intent);
//        Retrofit retrofit = RetrofitClient.getClient();
//        ApiService apiService = retrofit.create(ApiService.class);
//
//        UserCreate userCreate = new UserCreate();
//        userCreate.setFullName(fullName);
//        userCreate.setUsername(username);
//        userCreate.setEmail(email);
//        userCreate.setPassword(password);
//
//        Call<UserResponse> call = apiService.registerUser(userCreate);
//
//        call.enqueue(new Callback<UserResponse>() {
//            @Override
//            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
//                if (response.isSuccessful()) {
//                    // Registration successful
//                    // Navigate to login or main activity
//                } else {
//                    Toast.makeText(RegistrationActivity.this, "Registration failed: " + response.message(), Toast.LENGTH_LONG).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<UserResponse> call, Throwable t) {
//                Log.d("Network error", t.getMessage());
//                Toast.makeText(RegistrationActivity.this, "Network error: " + t.getMessage(), Toast.LENGTH_LONG).show();
//            }
//        });
    }
}
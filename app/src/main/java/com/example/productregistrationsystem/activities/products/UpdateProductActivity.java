package com.example.productregistrationsystem.activities.products;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import com.example.productregistrationsystem.R;
import com.example.productregistrationsystem.models.Product;
import com.example.productregistrationsystem.api.RetrofitClient;
import com.example.productregistrationsystem.api.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class UpdateProductActivity extends AppCompatActivity {
    private EditText productNameEditText;
    private EditText productSerialNumberEditText;
    private EditText productDescriptionEditText;
    private Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_product);

        productNameEditText = findViewById(R.id.product_name_edit_text);
        productSerialNumberEditText = findViewById(R.id.product_serial_number_edit_text);
        productDescriptionEditText = findViewById(R.id.product_description_edit_text);
        updateButton = findViewById(R.id.update_button);

        // Get the product from the Intent
        Product product = (Product) getIntent().getSerializableExtra("product");

        if (product != null) {
            productNameEditText.setText(product.getName());
            productSerialNumberEditText.setText(product.getSerialNumber());
            productDescriptionEditText.setText(product.getDescription());

            updateButton.setOnClickListener(v -> {
                // Update product logic
                product.setName(productNameEditText.getText().toString());
                product.setSerialNumber(productSerialNumberEditText.getText().toString());
                product.setDescription(productDescriptionEditText.getText().toString());
                // TODO implement update product with api
//                Retrofit retrofit = RetrofitClient.getClient();
//                ApiService apiService = retrofit.create(ApiService.class);
//
//                Call<Void> call = apiService.updateProduct(product.getId(), product);
//                call.enqueue(new Callback<Void>() {
//                    @Override
//                    public void onResponse(Call<Void> call, Response<Void> response) {
//                        if (response.isSuccessful()) {
//                            Toast.makeText(UpdateProductActivity.this, "Product updated successfully", Toast.LENGTH_LONG).show();
//                        } else {
//                            Toast.makeText(UpdateProductActivity.this, "Failed to update product", Toast.LENGTH_LONG).show();
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(Call<Void> call, Throwable t) {
//                        Toast.makeText(UpdateProductActivity.this, "Network error: " + t.getMessage(), Toast.LENGTH_LONG).show();
//                    }
//                });
            });
        }
    }
}

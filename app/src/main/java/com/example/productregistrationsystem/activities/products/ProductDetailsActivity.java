package com.example.productregistrationsystem.activities.products;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.productregistrationsystem.R;
import com.example.productregistrationsystem.models.Product;

public class ProductDetailsActivity extends AppCompatActivity {
    private TextView productNameTextView;
    private TextView productSerialNumberTextView;
    private TextView productDescriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        productNameTextView = findViewById(R.id.product_name);
        productSerialNumberTextView = findViewById(R.id.product_serial_number);
        productDescriptionTextView = findViewById(R.id.product_description);

        // Get the product from the Intent
        Product product = (Product) getIntent().getSerializableExtra("product");

        if (product != null) {
            productNameTextView.setText(product.getName());
            productSerialNumberTextView.setText(product.getSerialNumber());
            productDescriptionTextView.setText(product.getDescription());
        }
    }
}

package com.example.productregistrationsystem.activities.products;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.productregistrationsystem.R;
import com.example.productregistrationsystem.adapters.ProductAdapter;
import com.example.productregistrationsystem.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsActivity extends AppCompatActivity {
    private RecyclerView productRecyclerView;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        // Initialize RecyclerView
        productRecyclerView = findViewById(R.id.product_recycler_view);
        productRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Fetch products (in this case, from dummy data)
        List<Product> dummyProducts = getDummyProducts();

        productAdapter = new ProductAdapter(this, dummyProducts);  // Set the dummy products to the adapter
        productRecyclerView.setAdapter(productAdapter);

        // Fetch products from the API
//        fetchProductsFromApi();
    }


    private List<Product> getDummyProducts() {
        List<Product> products = new ArrayList<>();

        // Adding dummy products
        products.add(new Product(1, "Product A", "This is product A", "Manufacturer A", "SN123456", 99.99));
        products.add(new Product(2, "Product B", "This is product B", "Manufacturer B", "SN123457", 129.99));
        products.add(new Product(3, "Product C", "This is product C", "Manufacturer C", "SN123458", 79.99));
        products.add(new Product(4, "Product D", "This is product D", "Manufacturer D", "SN123459", 59.99));

        return products;
    }

    private void fetchProductsFromApi() {
        // TODO implement fetchProductsFromApi
//        Retrofit retrofit = RetrofitClient.getClient();
//        ApiService apiService = retrofit.create(ApiService.class);

//        Call<List<ProductResponse>> call = apiService.getProducts();

//        call.enqueue(new Callback<List<ProductResponse>>() {
//            @Override
//            public void onResponse(Call<List<ProductResponse>> call, Response<List<ProductResponse>> response) {
//                if (response.isSuccessful()) {
//                    List<ProductResponse> products = response.body();
//                    productAdapter = new ProductAdapter(products);  // Set the fetched products to the adapter
//                    productRecyclerView.setAdapter(productAdapter);
//                } else {
//                    Toast.makeText(ProductActivity.this, "Failed to fetch products: " + response.message(), Toast.LENGTH_LONG).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<ProductResponse>> call, Throwable t) {
//                Toast.makeText(ProductActivity.this, "Network error: " + t.getMessage(), Toast.LENGTH_LONG).show();
//            }
//        });
    }
}

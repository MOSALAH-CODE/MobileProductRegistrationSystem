package com.example.productregistrationsystem.adapters;

import android.content.Context;  // Required for context-based operations
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.productregistrationsystem.R;
import com.example.productregistrationsystem.activities.products.ProductDetailsActivity;
import com.example.productregistrationsystem.activities.products.UpdateProductActivity;
import com.example.productregistrationsystem.models.Product;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private Context context;  // Reference to context
    private List<Product> products;

    public ProductAdapter(Context context, List<Product> products) {  // Constructor with context and product list
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = products.get(position);
        holder.nameTextView.setText(product.getName());
        holder.serialNumberTextView.setText(product.getSerialNumber());

        // Set click listeners for product item and buttons
        holder.itemView.setOnClickListener(v -> {
            // Navigate to ProductDetailsActivity
            Intent intent = new Intent(context, ProductDetailsActivity.class);
            intent.putExtra("product", product);  // Pass product object
            context.startActivity(intent);
        });

        holder.updateButton.setOnClickListener(v -> {
            // Navigate to UpdateProductActivity
            Intent intent = new Intent(context, UpdateProductActivity.class);
            intent.putExtra("product", product);  // Pass product object
            context.startActivity(intent);
        });

        holder.deleteButton.setOnClickListener(v -> {
            // Implement delete logic
        });
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public TextView serialNumberTextView;
        public Button updateButton;
        public Button deleteButton;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.name_text_view);
            serialNumberTextView = itemView.findViewById(R.id.serial_number_text_view);
            updateButton = itemView.findViewById(R.id.update_button);
            deleteButton = itemView.findViewById(R.id.delete_button);
        }
    }
}

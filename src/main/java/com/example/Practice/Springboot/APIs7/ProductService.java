package com.example.Practice.Springboot.APIs7;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ProductService {
    private HashMap<Integer, Product> productMap = new HashMap<>();

    @PostConstruct
    public void loadSampleProducts() {
        productMap.put(1, new Product(1, "Laptop", 500));
        productMap.put(2, new Product(2, "Phone", 300));
        productMap.put(3, new Product(3, "Tablet", 200));
    }

    public String deleteProductById(int productId) {
        if (productMap.containsKey(productId)) {
            Product removedProduct = productMap.remove(productId);

            return """               
                     Product Deleted Successfully
                    Product ID: %d
                    Product Name: %s
                    Status: Removed from inventory
                    """
                    .formatted(
                            removedProduct.getProductId(),
                            removedProduct.getProductName()
                    );
        }
        return """
                Product not found
                No deletion performed
                """;
    }
}

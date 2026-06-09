package com.example.Practice.Springboot.APIs7.Controllers;

import com.example.Practice.Springboot.APIs7.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProductById(id);
    }
}

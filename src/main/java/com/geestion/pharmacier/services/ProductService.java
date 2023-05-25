package com.geestion.pharmacier.services;

import com.geestion.pharmacier.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    Product saveProduct(Product product);
    Product updateProduct(Product product);
    Product getProduct(Long id);
    List<Product> getAllProducts();
    void deleteProductById(Long id);
    void deleteAllProducts();
}

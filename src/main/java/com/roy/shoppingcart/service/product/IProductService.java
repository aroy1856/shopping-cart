package com.roy.shoppingcart.service.product;

import com.roy.shoppingcart.model.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByPriceRange(double minPrice, double maxPrice);
}

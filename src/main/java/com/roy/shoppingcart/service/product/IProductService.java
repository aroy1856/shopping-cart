package com.roy.shoppingcart.service.product;

import com.roy.shoppingcart.model.Product;

import java.math.BigDecimal;
import java.util.List;

public interface IProductService {
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Long id);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByPriceRange(BigDecimal minPrice, BigDecimal maxPrice);
}

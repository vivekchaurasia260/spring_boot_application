package com.product.service.services;

import com.product.service.entities.Product;

import java.util.List;
import java.util.Map;

public interface ProductCatalogService {

    Product addProduct(Product product);
    Product updateProduct(long prodId, Product product);
    void deleteProduct(long prodId);
    Product getProductById(long prodId);
    List<Product> getAllProducts();
    Product searchProductsByName(String name);
    Map<String, List<Product>> getProductsByCategory();
    void updateProductStock(long prodId, long quantity);
}

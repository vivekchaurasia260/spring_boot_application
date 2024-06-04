package com.product.service.serviceImpl;

import com.product.service.entities.Product;
import com.product.service.repository.ProductRepository;
import com.product.service.services.ProductCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ProductCatalogServiceImpl implements ProductCatalogService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Product updateProduct(long prodId, Product product) {
        //long prodId = product.getProdId();
        Product productDB = this.productRepository.findById(prodId)
                .orElseThrow();

        productDB.setProdName(product.getProdName());
        productDB.setDescription(product.getDescription());
        productDB.setPrice(product.getPrice());
        productDB.setStock(product.isStock());
        productDB.setCategory(product.getCategory());

        return this.productRepository.save(productDB);

    }

    @Override
    public void deleteProduct(long prodId) {
        //Product productDB = this.productRepository.findById(prodId).orElseThrow();
        this.productRepository.deleteById(prodId);
    }

    @Override
    public Product getProductById(long prodId) {
        return this.productRepository.findById(prodId).orElseThrow();
    }

    @Override
    public List<Product> getAllProducts() {

        return this.productRepository.findAll();
    }

    @Override
    public Product searchProductsByName(String name) {
        List<Product> products = this.productRepository.findAll();

        return products.stream()
                .filter(product -> product.getProdName().equals(name))
                .findFirst()
                .orElseThrow();
    }

    // NO IMPLEMENTATIONS FOR BELOW METHODS

    @Override
    public Map<String, List<Product>> getProductsByCategory() {
        List<Product> products = this.productRepository.findAll();

        return products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
    }

    @Override
    public void updateProductStock(long prodId, long quantity) {
        Product product = this.productRepository.findById(prodId).orElseThrow();
        product.setQuantity(quantity);

        this.productRepository.save(product);
    }
}

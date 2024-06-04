package com.product.service.controllers;

import com.product.service.entities.Product;
import com.product.service.services.ProductCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductCatalogService productCatalogService;
    @PostMapping("/")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product productCreated = this.productCatalogService.addProduct(product);

        return new ResponseEntity<Product>(productCreated, HttpStatus.CREATED);
    }
    @GetMapping("/{prodId}")
    public ResponseEntity<Product> getProductById(@PathVariable long prodId) {
        Product productById = this.productCatalogService.getProductById(prodId);

        return new ResponseEntity<>(productById, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> allProducts = this.productCatalogService.getAllProducts();

        return new ResponseEntity<>(allProducts, HttpStatus.OK);
    }

    // Filtering Record By Category : Custom
    @GetMapping("/category")
    public ResponseEntity<Map<String, List<Product>>> getProductByCategory() {
        Map<String, List<Product>> productsByCategory = this.productCatalogService.getProductsByCategory();

        return new ResponseEntity<>(productsByCategory, HttpStatus.OK);
    }
    
    @PutMapping("/{prodId}")
    public ResponseEntity<Product> updateProduct(@PathVariable long prodId, @RequestBody Product product) {
        Product updatedProduct = this.productCatalogService.updateProduct(prodId, product);
        
        return new ResponseEntity<>(updatedProduct, HttpStatus.ACCEPTED);
    }
    
    @DeleteMapping("/{prodId}")
    public ResponseEntity<String> deleteProduct(@PathVariable long prodId) {
        this.productCatalogService.deleteProduct(prodId);
        String message = "Record Deleted Successfully!!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @PatchMapping("/{prodId}/{quantity}")
    public ResponseEntity<String> updateQuantity(@PathVariable long prodId, @PathVariable long quantity) {
        this.productCatalogService.updateProductStock(prodId, quantity);
        String msg = "Product quantity updated successfully!!";

        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

}

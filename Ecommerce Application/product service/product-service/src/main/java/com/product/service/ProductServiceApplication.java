package com.product.service;

import com.product.service.entities.Product;
import com.product.service.services.ProductCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

//	@Autowired
//	ProductCatalogService productCatalogService;

	public static void main(String[] args) {

		SpringApplication.run(ProductServiceApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		Product product = new Product();
//		product.setProdId(101);
//		product.setProdName("Nestle");
//		product.setStock(true);
//		product.setDescription("It's a FMCG product.");
//		product.setPrice(500);
//
//		Product result = this.productCatalogService.addProduct(product);
//
//		System.out.println(result);
//	}
}

package com.product.service.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long prodId;
    @Column(name = "product_name")
    private String prodName;
    private String description;
    private int price;
    private boolean stock;
    private long quantity;
    private String category;

    // CONSTRUCTOR
    public Product() {

    }
    public Product(String prodName, String description, int price, boolean stock, long quantity, String category) {
        this.prodName = prodName;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.quantity = quantity;
        this.category = category;
    }

    public long getProdId() {
        return prodId;
    }

    public void setProdId(long prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) { this.quantity = quantity; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", quantity=" + quantity +
                ", category=" + category +
                '}';
    }
}

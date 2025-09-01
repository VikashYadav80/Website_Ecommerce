package com.example.Ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class OrderItem {


    @Id

    @GeneratedValue

    private Long
            id;

    @ManyToOne

    private Order
            order;

    @ManyToOne

    private Product
            product;

    private int quantity;

    private String name;

    private double price;

    private String
            imageName;

    public void setProduct(Product dbProduct) {
    }

    public void setPrice(double price) {
    }

    public void setQuantity(int i) {
    }

    public void setOrder(Order order) {
    }
}


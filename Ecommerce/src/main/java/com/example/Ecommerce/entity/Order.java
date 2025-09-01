package com.example.Ecommerce.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity

@Table(name
        = "orders")

public class Order {


    @Id
    @GeneratedValue

    private Long
            id;

    private String
            userEmail;

    private LocalDateTime orderDate;

    private double totalAmount;

    @OneToMany(mappedBy
            = "order", cascade = CascadeType.ALL)

    private List<OrderItem> items = new ArrayList<>();

    public void setUserEmail(String name) {
    }

    public void setOrderDate(LocalDateTime now) {
    }

    public Collection<OrderItem> getItems() {
        return items;

    }

    public void setTotalAmount(double total) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId() {
        return "";
    }
}

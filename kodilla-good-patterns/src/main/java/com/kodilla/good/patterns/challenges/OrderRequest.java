package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {

    private User user;
    private Product product;
    private int Quantity;
    private LocalDate orderDate;

    public OrderRequest(User user, Product product, int quantity, LocalDate orderDate) {
        this.user = user;
        this.product = product;
        Quantity = quantity;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return Quantity;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}

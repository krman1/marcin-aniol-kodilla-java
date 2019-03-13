package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;


public class OrderRequest {

    private Product product;
    private int Quantity;
    private LocalDate orderDate;


    public OrderRequest(Product product, int quantity, LocalDate orderDate) {
        this.product = product;
        Quantity = quantity;
        this.orderDate = orderDate;

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

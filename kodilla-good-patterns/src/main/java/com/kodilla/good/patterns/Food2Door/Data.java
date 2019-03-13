package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;

public class Data {

    public OrderRequest dateToOrder() {

        Product product = new Product("krewetki", 300);
        int Quantity = 30;
        LocalDate orderDate = LocalDate.now();

        return new OrderRequest(product, Quantity, orderDate);
    }
}

package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Data {

    public OrderRequest dateToOrder () {

        User user = new User("Jan", "Kowalski", "Janko");
        Product product = new Product("123-236", "Laptop Dell", 3250);
        int Quantity = 1;
        LocalDate orderDate = LocalDate.now();

        return new OrderRequest(user, product, Quantity, orderDate);
    }
}

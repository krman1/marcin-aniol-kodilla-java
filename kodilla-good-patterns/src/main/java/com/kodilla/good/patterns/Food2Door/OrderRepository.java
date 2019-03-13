package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;

public interface OrderRepository {

    void createOrder( Product product, int Quantity, LocalDate orderDate, Producer producer);
}

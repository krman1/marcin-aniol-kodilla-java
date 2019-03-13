package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class MyShopOrderRepository implements OrderRepository {

    private final List<String> orders = new ArrayList<>();


    @Override
    public void createOrder( Product product, int Quantity, LocalDate orderDate, Producer producer) {

        orders.add("Zamówiłeś w sklepie: " + producer.getName() + " w dniu " + orderDate + " " + product.getName()
                + " w ilości: " + Quantity  );


        orders.stream()
                .forEach(System.out ::println);

    }

}

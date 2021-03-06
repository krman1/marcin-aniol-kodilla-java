package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class MyShopOrderRepository implements OrderRepository{

    private final List<String> orders = new ArrayList<>();

    @Override
    public void createOrder(User user, Product product, int Quantity, LocalDate orderDate) {

        orders.add("Urzytkownik: " + user.getLogin()+ " w dniu " + orderDate + " zamówił: "
                + product.getName() + " w ilości: " + Quantity );


        orders.stream()
                .forEach(System.out ::println);

    }

}

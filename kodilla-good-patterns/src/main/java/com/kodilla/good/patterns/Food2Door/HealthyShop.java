package com.kodilla.good.patterns.Food2Door;

public class HealthyShop implements Producer {

    private String name = "HealthyShop";

    @Override
    public boolean process(OrderRequest orderRequest){

        System.out.println("Dziekujemy za skożystanie z oferty sklepu " + getName());
        return true;

    }

    @Override
    public String getName() {
        return name;
    }
}

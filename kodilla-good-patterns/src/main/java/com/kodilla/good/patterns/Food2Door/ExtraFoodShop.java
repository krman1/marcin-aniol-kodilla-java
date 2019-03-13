package com.kodilla.good.patterns.Food2Door;


public class ExtraFoodShop implements Producer {

    private String name = "ExtraFoodShop";

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
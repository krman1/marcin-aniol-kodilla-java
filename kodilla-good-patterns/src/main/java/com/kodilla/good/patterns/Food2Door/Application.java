package com.kodilla.good.patterns.Food2Door;

public class Application {

    public static void main(String[] args) {

        Data data = new Data();
        OrderRequest orderRequest = data.dateToOrder();
        Producer producer = new GlutenFreeShop();
        ProductOrderService productOrderService = new ProductOrderService(new MyShopOrderRepository());

        productOrderService.makeOrder(orderRequest, producer);

    }
}

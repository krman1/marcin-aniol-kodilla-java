package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        Data data = new Data();
        OrderRequest orderRequest = data.dateToOrder();
        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new MyShopOrderService(),
                new MyShopOrderRepository());

        productOrderService.process(orderRequest);

    }
}

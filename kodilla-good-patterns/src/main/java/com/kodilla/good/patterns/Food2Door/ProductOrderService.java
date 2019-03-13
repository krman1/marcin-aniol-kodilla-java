package com.kodilla.good.patterns.Food2Door;


public class ProductOrderService {

    private OrderRepository orderRepository;



    public ProductOrderService(final OrderRepository orderRepository) {
        this.orderRepository = orderRepository;

    }

    public void makeOrder(final OrderRequest orderRequest, final Producer producer) {

        boolean isOrdered = producer.process(orderRequest);

        if (isOrdered) {

           orderRepository.createOrder(orderRequest.getProduct(),orderRequest.getQuantity(),orderRequest.getOrderDate(),producer);

        } else {

            System.out.println("Coś poszło nie tak i zamówienie nie może zostać zrealizowane");
        }
    }
}

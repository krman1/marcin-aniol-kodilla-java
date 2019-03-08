package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderingService,
                          final OrderRepository orderingRepository) {

        this.informationService = informationService;
        this.orderService = orderingService;
        this.orderRepository = orderingRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct());

        if (isOrdered) {

            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getOrderDate());
            return new OrderDto(orderRequest.getUser(), true);

        } else {

            System.out.println("Coś poszło nie tak i zamówienie nie może zostać zrealizowane");
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}

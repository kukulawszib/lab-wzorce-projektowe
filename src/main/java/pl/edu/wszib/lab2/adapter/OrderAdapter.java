package pl.edu.wszib.lab2.adapter;

import pl.edu.wszib.lab2.adapter.toadapt.Order;

public class OrderAdapter {
    private final OrderService orderService;

    public OrderAdapter(OrderService orderService) {
        this.orderService = orderService;
    }

    public void handle(Order order) {
        pl.edu.wszib.lab2.adapter.Order adaptedOrder = null;// TODO zad 1 adaptacja niekompatybilnego interfejsu
        orderService.handle(adaptedOrder);
    }
}

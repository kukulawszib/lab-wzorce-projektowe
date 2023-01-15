package pl.edu.wszib.lab2.adapter;

import pl.edu.wszib.lab2.adapter.toadapt.Order;
import pl.edu.wszib.lab2.adapter.toadapt.OrderItem;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderAdapter {
    private final OrderService orderService;

    public OrderAdapter(OrderService orderService) {
        this.orderService = orderService;
    }

    public void handle(Order order) {
        pl.edu.wszib.lab2.adapter.Order adaptedOrder = adapt(order);
        orderService.handle(adaptedOrder);
    }

    private pl.edu.wszib.lab2.adapter.Order adapt(Order order) {
        return new pl.edu.wszib.lab2.adapter.Order(
                order.id.id,
                adapt(order.items)
        );
    }

    private List<pl.edu.wszib.lab2.adapter.OrderItem> adapt(Set<OrderItem> items) {
        return items.stream()
                .map(this::adapt)
                .collect(Collectors.toList());
    }

    private pl.edu.wszib.lab2.adapter.OrderItem adapt(OrderItem item) {
        return new pl.edu.wszib.lab2.adapter.OrderItem(
                item.productId.id,
                item.quantity,
                item.price
        );
    }
}

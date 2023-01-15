package pl.edu.wszib.lab2.facade;

import pl.edu.wszib.lab2.facade.api.OrderOperations;

public class OrderFacade implements OrderOperations {

    // create, read, update, delete
    private final OrderCreateService orderCreateService;
    private final OrderReadService orderReadService;
    private final OrderUpdateService orderUpdateService;
    private final OrderDeleteService orderDeleteService;

    public OrderFacade(
            final OrderCreateService orderCreateService,
            final OrderReadService orderReadService,
            final OrderUpdateService orderUpdateService,
            final OrderDeleteService orderDeleteService) {
        this.orderCreateService = orderCreateService;
        this.orderReadService = orderReadService;
        this.orderUpdateService = orderUpdateService;
        this.orderDeleteService = orderDeleteService;
    }

    @Override
    public void create() {
        orderCreateService.create();
    }

    @Override
    public void read() {
        orderReadService.read();
    }

    @Override
    public void update() {
        orderUpdateService.update();
    }

    @Override
    public void delete() {
        orderDeleteService.delete();
    }
}

package pl.edu.wszib.lab2.facade;

public class OrderFacade {

    // create, read, update, delete
    private final OrderCreateService orderCreateService;
    private final OrderReadService orderReadService;

    public OrderFacade(
            OrderCreateService orderCreateService,
            OrderReadService orderReadService) {
        this.orderCreateService = orderCreateService;
        this.orderReadService = orderReadService;
    }

    public void create() {
        orderCreateService.create();
    }

    public void read() {
        orderReadService.read();
    }
}

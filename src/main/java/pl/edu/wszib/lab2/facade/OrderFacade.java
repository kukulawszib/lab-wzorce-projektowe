package pl.edu.wszib.lab2.facade;

public class OrderFacade {

    // create, read, update, delete
    private final OrderCreateService orderCreateService;
    private final OrderReadService orderReadService;
    private final OrderUpdateService orderUpdateService;
    private final OrderDeleteService orderDeleteService;

    public OrderFacade(
            OrderCreateService orderCreateService,
            OrderReadService orderReadService,
            OrderUpdateService orderUpdateService,
            OrderDeleteService orderDeleteService) {
        this.orderCreateService = orderCreateService;
        this.orderReadService = orderReadService;
        this.orderUpdateService = orderUpdateService;
        this.orderDeleteService = orderDeleteService;
    }

    public void create() {
        orderCreateService.create();
    }

    public void read() {
        orderReadService.read();
    }

    public void update() {
        orderUpdateService.update();
    }

    public void delete() {
        orderDeleteService.delete();
    }
}

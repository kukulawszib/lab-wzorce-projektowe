package pl.edu.wszib.lab2.facade;

public class Application {
    public static void main(String[] args) {
        // without facade
        OrderCreateService orderCreateService = new OrderCreateService();
        orderCreateService.create();

        OrderReadService orderReadService = new OrderReadService();
        orderReadService.read();

        // with facade
        OrderFacade orderFacade = new OrderFacade(
                new OrderCreateService(),
                new OrderReadService(),
                new OrderUpdateService(),
                new OrderDeleteService(),
                new OrderProcessService());
        orderFacade.create();
        orderFacade.read();

        // SOLID
        // Single responsibility
        // Open-closed
        // Liskov
        // Interface segregation
        // Dependency inversion

        // moduły:
        // - api - dtosy + interfejsy
        // - application/domain - implementacje interfejsów

    }

}

package pl.edu.wszib.lab2.facade;

public class Application {
    public static void main(String[] args) {
        // without facade
        OrderCreateService orderCreateService = new OrderCreateService();
        orderCreateService.create();

        OrderReadService orderReadService = new OrderReadService();
        orderReadService.read();

        // with facade
        OrderFacade orderFacade = new OrderFacade(new OrderCreateService(), new OrderReadService());
        orderFacade.create();
        orderFacade.read();

        // TODO zad: rozszerz fasadę o metody update i delete
    }

}

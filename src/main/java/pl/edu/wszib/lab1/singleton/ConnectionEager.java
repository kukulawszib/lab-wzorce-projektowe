package pl.edu.wszib.lab1.singleton;

public final class ConnectionEager {

    public final static ConnectionEager INSTANCE = new ConnectionEager();

    private ConnectionEager() {
    }

    // TODO zaimplementuj wzorzec singleton - w aplikacji powinna być jedna instancja klasy Connection
    //  implementacja nr 1: niech instancja jest tworzona w sposób zachłanny (EAGER)
    //  implementacja nr 2: niech instancja jest tworzona dopiero przy pierwszej próbie użycia (LAZY) getInstance()
}

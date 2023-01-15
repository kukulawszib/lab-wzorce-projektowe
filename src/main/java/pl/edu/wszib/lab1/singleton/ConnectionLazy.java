package pl.edu.wszib.lab1.singleton;

public final class ConnectionLazy {
    private static ConnectionLazy INSTANCE;

    private ConnectionLazy() {
    }

    public static ConnectionLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConnectionLazy();
        }
        return INSTANCE;
    }
}

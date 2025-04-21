package singleton;

public class LazyDBConnection {
    private static LazyDBConnection instance;

    private LazyDBConnection() {
        System.out.println("DB Connection Created (Lazy)");
    }

    public static LazyDBConnection getInstance() {
        if (instance == null) {
            instance = new LazyDBConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to DB (Lazy)");
    }
}

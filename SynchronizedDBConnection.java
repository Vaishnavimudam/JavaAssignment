package singleton;

public class SynchronizedDBConnection {
    private static SynchronizedDBConnection instance;

    private SynchronizedDBConnection() {
        System.out.println("DB Connection Created (Thread-Safe)");
    }

    public static synchronized SynchronizedDBConnection getInstance() {
        if (instance == null) {
            instance = new SynchronizedDBConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to DB (Thread-Safe)");
    }
}


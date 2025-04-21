package singleton;

public class DoubleLockingDBConnection {
    private static volatile DoubleLockingDBConnection instance;

    private DoubleLockingDBConnection() {
        System.out.println("DB Connection Created (Double-Checked Locking)");
    }

    public static DoubleLockingDBConnection getInstance() {
        if (instance == null) {
            synchronized (DoubleLockingDBConnection.class) {
                if (instance == null) {
                    instance = new DoubleLockingDBConnection();
                }
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to DB (Double-Checked Locking)");
    }
}


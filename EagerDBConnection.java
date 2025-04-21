package singleton;

public class EagerDBConnection {
	private static final EagerDBConnection instance = new EagerDBConnection();

    private EagerDBConnection() {
        System.out.println("DB Connection Created (Eager)");
    }

    public static EagerDBConnection getInstance() {
        return instance;
    }

    public void connect() {
        System.out.println("Connected to DB (Eager)");
    }
}

package week00;

public class Connection {

   /*
   Non-Lazy Initialization
    private static Connection instance = null;
    private Connection() {}
    public static synchronized Connection getInstance() {
        Lazy initialization V 1.0
        if (instance == null) Validation isAlready instantiated
        instance = new Connection(); Initializing
        return instance; Return connection
    }*/

    //   Lazy Initialization
    private static Connection instance = null;

    private Connection() {
    }

    public static Connection getInstance() {
        if (instance == null) {
            synchronized (Connection.class) {
                if (instance == null)
                    instance = new Connection();
            }
        }
        return instance;
    }
}

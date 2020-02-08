/**
 * Non-Lazy Initialization with Thread Safety
 */
public class Connection {
    private static Connection instance = new Connection();

    private Connection() {

    }

    /**
     * A method to get the instance of the class
     *
     * @return instance the instance of connection
     */
    public static Connection getInstance() {
        return instance;
    }
}

/**
 * Lazy Initialization without Thread Safety
 */
class ConnectionLazy {
    private static ConnectionLazy instance = null;

    private ConnectionLazy() {
        // private constructor
    }

    /**
     * A method to get the instance of the class
     *
     * @return instance the instance of connection
     */
    public static ConnectionLazy getInstance() {
        if (instance == null) {
            instance = new ConnectionLazy();
        }

        return instance;
    }
}

/**
 * Lazy Initialization with Thread Safety (version 1)
 */
class ConnectionLazyV1 {
    private static ConnectionLazyV1 instance = null;

    private ConnectionLazyV1() {

    }

    /**
     * A method to get the instance of the class
     *
     * @return instance the instance of connection
     */
    public static synchronized ConnectionLazyV1 getInstance() {
        // making the method synchronized will lock the method which
        // causes slow performance as multiple threads can’t access it simultaneously

        if (instance == null) {
            instance = new ConnectionLazyV1();
        }

        return instance;
    }
}

/**
 * Lazy Initialization with Thread Safety (version 2)
 */
class ConnectionLazyV2 {
    private static ConnectionLazyV2 instance = null;

    private ConnectionLazyV2() {

    }

    /**
     * A method to get the instance of the class
     *
     * @return instance the instance of connection
     */
    public static ConnectionLazyV2 getInstance() {
        if (instance == null) {
            synchronized (ConnectionLazyV2.class) {
                if (instance == null) {
                    instance = new ConnectionLazyV2();
                }
            }
        }

        return instance;
    }
}


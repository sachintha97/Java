public class Connection {
    /**
     * non-lazy initialization
     */
    private static Connection instance = new Connection();

    private Connection() {

    }

    public static Connection getInstance() {
        return instance;
    }
}

/**
 * lazy init without thread safe
 */
class ConnectionLazyV1{
    private static ConnectionLazyV1 instance = null;

    private ConnectionLazyV1(){

    }

    public static synchronized ConnectionLazyV1 getInstance(){
        if(instance == null){
            instance= new ConnectionLazyV1();
        }

        return instance;
    }
}

/**
 * lazy init with thread safe (version 2)
 */
class ConnectionLazyV2{
    private static ConnectionLazyV2 instance = null;

    private ConnectionLazyV2(){

    }

    public static ConnectionLazyV2 getInstance(){
        if(instance== null) {
            synchronized (ConnectionLazyV2.class) {
                if (instance == null) {
                    instance = new ConnectionLazyV2();
                }
            }
        }

        return instance;
    }
}


//for ground thread
//background thread
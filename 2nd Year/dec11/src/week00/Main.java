package week00;

public class Main {
    public static void main(String[] args) {
        /*Connection con = Connection.getInstance();
        System.out.println( "Thread.currentThread().getState() " +
                "= " + Thread.currentThread().getState() );
        for (int i = 0; i < 10; i++) {
            System.out.println( Thread.currentThread().getName() + " : " + i );
            try {
                Thread.sleep( 500 );
                System.out.println( "for : " + Thread.currentThread().getState() );
                if (i == 5)
                    Thread.currentThread().interrupt();
                System.out.println( "Priority : " + i + Thread.currentThread().getPriority() );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }*/
        /*
         * Deamon true = Background
         * */
        Thread t1 = new MyThread( "t1" );
        ss( t1, false );

        /*
        Setting high priority
        * */
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new MyThread( "tt2" );
        ss( t2, false );

        Thread t3 = new MyThread( "ttt3" );
        ss( t3, false );



        /*System.err.println( t1.getName() + " Is Alive : " + t1.isAlive() );
        System.err.println( t2.getName() + " Is Alive : " + t2.isAlive() );
        System.err.println( t3.getName() + " Is Alive : " + t3.isAlive() );*/
    }

    /*Thread*/
    private static void ss(Thread t1, boolean daemon) {
        t1.setDaemon( daemon );
        System.err.println( t1.getName() + " is Alive : " + t1.isAlive() );
        System.err.println( t1.getName() + " is Daemon : " + t1.isDaemon() );
        System.err.println( t1.getName() + " : " + t1.getState() );
        t1.start();
        System.err.println( t1.getName() + " : " + t1.getState() );
    }
}

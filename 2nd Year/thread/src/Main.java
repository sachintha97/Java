import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Thread myThread = new MyThread("T1");

        System.out.println("State : " + myThread.getState());
        // setting the daemon to true will make the thread run in the background
        myThread.setDaemon(false);
        myThread.start();

        // the join method will make other threads run only after T1 has been run
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        for (int i = 1 ; i<=10 ; i++){

            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            if(i==3) {
//                // To show that I/O will make the thread's state BLOCKED
//                Scanner sc = new Scanner(System.in);
//                sc.next();
//           }

            if(i==5){
                // interrupting the current thread
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Priority : " +Thread.currentThread().getPriority());
        System.out.println("State : " + Thread.currentThread().getState());

        //myThread.start();  --> illegalThreadStateException

        Thread myThread2 = new MyThread("T2");
        myThread2.setDaemon(false);
        myThread2.start();

        Thread myThread3 = new MyThread("T3");
        myThread3.setDaemon(false);
        myThread3.start();

        System.out.println("state (Thread1) : " + myThread.getState());
        System.out.println("state (Thread2) : " + myThread2.getState());
        System.out.println("state (Thread3) : " + myThread3.getState());

        System.out.println("is Alive (Thread1) : " + myThread.isAlive());
        System.out.println("is Alive (Thread2) : " + myThread2.isAlive());
        System.out.println("is Alive (Thread3) : " + myThread3.isAlive());

        System.out.println("is Daemon (Thread1) : " + myThread.isDaemon());
        System.out.println("is Daemon (Thread2) : " + myThread2.isDaemon());
        System.out.println("is Daemon (Thread3) : " + myThread3.isDaemon());
    }
}

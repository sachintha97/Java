import java.util.Scanner;

/**
 * Demonstrating Threads in Java
 *
 * @author Guhanathan Poravi
 */
public class Main {
    public static void main(String[] args) {

        Thread myThread1 = new MyThread("T1");
        System.out.println("State : " + myThread1.getState());

        // setting the daemon to true will make the thread run in the background
        myThread1.setDaemon(false);
        myThread1.start();

        // the join method will make other threads run only after T1 has been run
        try {
            myThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runnable r1 = new MyThread2();
        Thread th1 = new Thread(r1,"R1");
        th1.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            if (i == 3) {
//                // To show that I/O will make the thread's state BLOCKED
//                Scanner scanner = new Scanner(System.in);
//                scanner.next();
//            }

            if (i == 5) {
                // interrupting the current thread
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Priority : " + Thread.currentThread().getPriority());
        System.out.println("State : " + Thread.currentThread().getState());

        // You should not start a thread after it's been started because it will throw an IllegalThreadStateException
        // myThread1.start();

        Thread myThread2 = new MyThread("T2");
        myThread2.setDaemon(false);
        myThread2.start();

        Thread myThread3 = new MyThread("T3");
        myThread3.setDaemon(false);
        myThread3.start();

        System.out.println("State (Thread1) : " + myThread1.getState());
        System.out.println("State (Thread2) : " + myThread2.getState());
        System.out.println("State (Thread3) : " + myThread3.getState());

        System.out.println("Is Alive (Thread1) : " + myThread1.isAlive());
        System.out.println("Is Alive (Thread2) : " + myThread2.isAlive());
        System.out.println("Is Alive (Thread3) : " + myThread3.isAlive());

        System.out.println("Is Daemon (Thread1) : " + myThread1.isDaemon());
        System.out.println("Is Daemon (Thread2) : " + myThread2.isDaemon());
        System.out.println("Is Daemon (Thread3) : " + myThread3.isDaemon());
    }
}

public class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 20; i >=10 ; i--) {
            System.out.println(Thread.currentThread().getName()+ " - " +i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MyThread extends Thread {

    public MyThread(String name){
        super(name);
    }

    public void run(){
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Name : " + Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

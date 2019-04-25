package thread;


import java.util.concurrent.CountDownLatch;

public class JoinDemo {
    public static void main(String[] args){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("son Thread start");
                    Thread.sleep(2000);
                    System.out.println("son Thread end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();//start必须在join之前
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main Thread start");
    }
}

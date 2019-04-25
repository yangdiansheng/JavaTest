package thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

    public static void main(String[] args){
        CountDownLatch countDownLatch = new CountDownLatch(2);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("son 1 Thread start");
                    Thread.sleep(2000);
                    countDownLatch.countDown();
                    System.out.println("son 1 Thread end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("son 2 Thread start");
                    Thread.sleep(1000);
                    countDownLatch.countDown();
                    System.out.println("son 2 Thread end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main Thread start");

    }
}

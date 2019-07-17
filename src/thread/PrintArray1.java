package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程0 打印基数
 * 线程1 打印偶数
 */
public class PrintArray1 {

    private int i = 1;
    private int curNum =1;

    private synchronized void printNum() throws InterruptedException {
        while (i < 100){
            notifyAll();
            System.out.println(Thread.currentThread().getName() + "   "+ i);
            i ++;
            System.out.println(Thread.currentThread().getName()+"before");
            wait();
            System.out.println(Thread.currentThread().getName()+"after");
        }
    }


    public static void main(String[] args) {
        PrintArray1 printArray = new PrintArray1();
        new Thread(() ->{
                try {
                    printArray.printNum();
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
        }).start();
        new Thread(() ->{
            try {
                printArray.printNum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

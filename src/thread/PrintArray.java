package thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintArray {

    private int no = 1;
    private final Lock lock = new ReentrantLock();
    private final Condition condition1 = lock.newCondition();
//    private final Condition condition2 = lock.newCondition();
//    private final Condition condition3 = lock.newCondition();
    private int curNum =1;

    private void printNum(){
        if (curNum > 75){
            Thread.currentThread().interrupt();
            return;
        }
        for (int i = 0; i< 5;i++){
            System.out.println(Thread.currentThread().getName() + "  " + (curNum++));
        }
    }

    public void process1(){
        lock.lock();
        try {
            while (no != 1){
                condition1.await();
            }
            printNum();
            no = 2;
            condition1.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void process2(){
        lock.lock();
        try {
            while (no != 2){
                condition1.await();
            }
            printNum();
            no = 3;
            condition1.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void process3(){
        lock.lock();
        try {
            while (no != 3){
                condition1.await();
            }
            printNum();
            no = 1;
            condition1.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        PrintArray printArray = new PrintArray();
        new Thread(() ->{
            while (!Thread.currentThread().isInterrupted()){
                printArray.process1();
            }
        }).start();
        new Thread(() ->{
            while (!Thread.currentThread().isInterrupted()){
                printArray.process2();
            }
        }).start();
        new Thread(() ->{
            while (!Thread.currentThread().isInterrupted()){
                printArray.process3();
            }
        }).start();
    }
}

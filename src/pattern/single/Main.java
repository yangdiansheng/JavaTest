package pattern.single;

import pattern.single.best.SingleInnerClass;
import pattern.single.best.SingleReflect;

import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

public class Main {
    public static void main(String[] args){
//        try {
//            Class classType = SingleReflect.class;
//            Constructor constructor = classType.getDeclaredConstructor();
//            constructor.setAccessible(true);
//            System.out.println(SingleReflect.getInstance() == constructor.newInstance());
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }



//        for (int i=0;i<100;i++){
//
//            System.out.println("222222222");
//            try {
//                Thread thread = new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        System.out.println("111111");
////                    try {
////                        Thread.sleep(200);
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
//                    }
//                });
//                thread.start();
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            System.out.println("33333333");
//            System.out.println("----------");
//        }

        for (int i=0;i< 1000;i++){
            System.out.println((i%10));
        }

    }


}

package pattern.single.best;


/**
 * 线程安全 懒汉式
 */
public class SingleSafeLazyUpper {
    private SingleSafeLazyUpper(){}

    //这里使用volatile 是保证多线程状态下可见的
    private static volatile SingleSafeLazyUpper INSTANCE = null;

    //同步锁保证多线程安全
    public static SingleSafeLazyUpper getInstance(){
        if (INSTANCE == null){
            synchronized (SingleSafeLazyUpper.class){
                if (INSTANCE == null){
                    INSTANCE = new SingleSafeLazyUpper();
                }
            }
        }
        return INSTANCE;
    }
}

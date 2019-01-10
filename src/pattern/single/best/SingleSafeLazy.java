package pattern.single.best;


/**
 * 线程安全 懒汉式
 */
public class SingleSafeLazy {
    private SingleSafeLazy(){}

    //这里使用volatile 是保证多线程状态下可见的
    private static volatile SingleSafeLazy INSTANCE = null;

    //同步锁保证多线程安全
    public static synchronized SingleSafeLazy getInstance(){
        if (INSTANCE == null){
            INSTANCE = new SingleSafeLazy();
        }
        return INSTANCE;
    }
}

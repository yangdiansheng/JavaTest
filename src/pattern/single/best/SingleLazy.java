package pattern.single.best;


/**
 * 非线程安全 懒汉式单例
 */
public class SingleLazy {
    private SingleLazy(){}
    private static SingleLazy INSTANCE = null;

    public static SingleLazy getInstance(){
        if (INSTANCE == null){
            INSTANCE = new SingleLazy();
        }
        return INSTANCE;
    }
}

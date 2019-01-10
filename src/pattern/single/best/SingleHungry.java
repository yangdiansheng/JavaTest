package pattern.single.best;

/**
 * 线程安全的 饿汉式单例
 *
 */
public class SingleHungry {
    private SingleHungry(){}
    private static final SingleHungry INSTANCE = new SingleHungry();
    public static SingleHungry getInstance(){
        return INSTANCE;
    }
}

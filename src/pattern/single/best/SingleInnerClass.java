package pattern.single.best;

/**
 * 线程安全 内部类方式
 * 内部类的方式
 * 1，延迟了创建类的时间
 * 2，多线程下happy-before原则保证了单例的线程安全
 */
public class SingleInnerClass {

    private SingleInnerClass(){}

    private static class SingleHolder{
        static final SingleInnerClass INSTANCE = new SingleInnerClass();
    }
    public static SingleInnerClass getInstance(){
        return SingleHolder.INSTANCE;
    }
}

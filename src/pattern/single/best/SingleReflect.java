package pattern.single.best;

/**
 * 防止反射创建单例
 */
public class SingleReflect {

    private static boolean flag = true;

    private SingleReflect(){
        if (flag){
            flag = false;
        } else {
            throw new RuntimeException("init one more time");
        }
    }

    public static SingleReflect instance = new SingleReflect();

    public static SingleReflect getInstance(){
        return instance;
    }
}

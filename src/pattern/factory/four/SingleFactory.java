package pattern.factory.four;

import java.lang.reflect.Constructor;

public class SingleFactory {
    private static Single INSTANCE;
    static {
        try {
            Class cl = Class.forName(Single.class.getName());
            //获得构造函数
            Constructor constructor = cl.getDeclaredConstructor();
            //设置无参构造可以访问
            constructor.setAccessible(true);
            //产生一个实例对象
            INSTANCE = (Single) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Single getInstance(){
        return INSTANCE;
    }
}

package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args){
//        try {
//            Class clazz = Class.forName("reflect.Daemons");
//            Method method = clazz.getDeclaredMethod("start");
//            method.setAccessible(true);
//            method.invoke(null);
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }

        try {
            Class clazz = Class.forName("reflect.Daemons$FinalizerWatchdogDaemon");
            Method method = clazz.getSuperclass().getDeclaredMethod("stop");
            method.setAccessible(true);
            Field field = clazz.getDeclaredField("INSTANCE");
            field.setAccessible(true);
            method.invoke(field.get(null));
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

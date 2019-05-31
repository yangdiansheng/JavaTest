package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        //字符串存储
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = "abc";
        System.out.println(str1 == str2);
        System.out.println(str1 == str2.intern());
        System.out.println(str1.intern() == str2.intern());
        System.out.println(str3 == str2.intern());


        //绕过泛型向Integer数组添加字符串
        ArrayList<Integer> list = new ArrayList<>();
        List proxylist = (List) Proxy.newProxyInstance(ArrayList.class.getClassLoader(), ArrayList.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("add")){
                    return method.invoke(list,"1111");
                }
                return method.invoke(list);
            }
        });
        proxylist.add(1);
        System.out.println("list = " + list.toString());
    }
}

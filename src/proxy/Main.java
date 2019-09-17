package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args){
        Person man = new Man();
        Person person = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("走代理了");
                        System.out.println("man " + man);
                        args[0] = 5;
                        Bean bean = man.say((Integer) args[0]);
                        bean.i = 2;
                        return bean;
                    }
                });
        Bean bean =  person.say(5);
        System.out.println("bean " + bean.toString());

        person.say2(10);
        System.out.println("bean " + bean.toString());
    }
}

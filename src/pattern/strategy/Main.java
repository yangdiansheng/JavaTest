package pattern.strategy;


import pattern.proxy.one.GamePlayer;
import pattern.proxy.one.GamePlayerA;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args){
        Person person = null;
        person = new Person(new Bowl());
        person.drink();
        person = new Person(new Cup());
        person.drink();
        person = new Person(new Hand());
        person.drink();

        System.out.println("a + b = " + Calculator.ADD.exec(1,2));
        System.out.println("a - b = " + Calculator.ADD.exec(3,1));
    }
}

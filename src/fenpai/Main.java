package fenpai;

public class Main {
    public static void main(String[] args){
        Dispatch dispatch = new Dispatch();
        Person person = new Person();
        Person man = new Man();
        Person woman = new Woman();

        dispatch.sayHello(man);
        dispatch.sayHello(woman);
    }
}

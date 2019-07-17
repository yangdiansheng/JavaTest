package fenpai;


public class Dispatch {
    public void sayHello(Person person){
        System.out.println("person hello");
    }

    public void sayHello(Man person){
        System.out.println("Man hello");
    }

    public void sayHello(Woman person){
        System.out.println("Woman hello");
    }
}

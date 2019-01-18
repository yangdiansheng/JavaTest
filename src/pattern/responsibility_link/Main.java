package pattern.responsibility_link;

import pattern.responsibility_link.two.*;
import pattern.single.Emperor;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        ArrayList<Women> arrayList = new ArrayList<>();
        for (int i =0 ;i<5;i++){
            arrayList.add(new WomenA(random.nextInt(4),"我要出去逛逛"));
        }
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNext(husband);
        husband.setNext(son);
        for (Women women:arrayList){
            father.handleMessage(women);
        }
    }
}

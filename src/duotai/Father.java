package duotai;

public class Father {

    public void methodA(){
        System.out.println("father A");
        methodB();
    }

    public void methodB(){
        System.out.println("father B");
    }
}

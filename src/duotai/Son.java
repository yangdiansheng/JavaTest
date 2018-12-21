package duotai;

public class Son extends Father{

    public void methodA(){
        System.out.println("Son A");
        methodB();
    }

    @Override
    public void methodB(){
        System.out.println("Son B");
    }
}

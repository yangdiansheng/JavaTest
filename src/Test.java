import fenpai.Person;

public class Test implements Father{

    private int aa = 0;
    protected float bb = 1;
    public Test test = new Test();

    public static void main(String[] args){

        Test test = new Test();
        try {
            int sum = test.sum(1,2);
            if (sum == 3){
                test.foo();
            }
        } catch (Exception e){

        }
    }

    public void foo(){
        System.out.println("sum = " + 3);
    }

    public int sum(int i,int j){
        return i + j;
    }

    @Override
    public void show() {
        foo();
    }
}

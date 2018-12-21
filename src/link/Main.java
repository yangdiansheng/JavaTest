package link;

public class Main {
    public static void main(String[] args) {
        Control.INSTANCE.chechCallBack(() -> {
            System.out.println("callback what i want to call ");
        });
    }

}

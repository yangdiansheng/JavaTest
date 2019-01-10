package pattern.factory.one;

public class BlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黑种人");
    }

    @Override
    public void talk() {
        System.out.println("我是黑种人");
    }
}

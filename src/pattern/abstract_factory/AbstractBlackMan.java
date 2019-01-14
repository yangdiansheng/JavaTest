package pattern.abstract_factory;

public abstract class AbstractBlackMan implements Human{
    @Override
    public void getColor() {
        System.out.println("我是黑人");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话了");
    }
}

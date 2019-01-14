package pattern.abstract_factory;

public abstract class AbstractWhiteMan implements Human{
    @Override
    public void getColor() {
        System.out.println("我是白人");
    }

    @Override
    public void talk() {
        System.out.println("白人说话了");
    }
}

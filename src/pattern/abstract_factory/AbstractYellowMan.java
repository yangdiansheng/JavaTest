package pattern.abstract_factory;

public abstract class AbstractYellowMan implements Human{
    @Override
    public void getColor() {
        System.out.println("我是黄人");
    }

    @Override
    public void talk() {
        System.out.println("黄人说话了");
    }
}

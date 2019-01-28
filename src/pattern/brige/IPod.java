package pattern.brige;

public class IPod extends Product{
    @Override
    public void beProducted() {
        System.out.println("生产出的ipod是这样的");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的ipod卖出去了");
    }
}

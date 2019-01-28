package pattern.brige;

public class ShanZhaiCorp extends Corp{

    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    protected void makeMoney() {
        super.makeMoney();
        System.out.println("山寨公司赚大钱");
    }
}

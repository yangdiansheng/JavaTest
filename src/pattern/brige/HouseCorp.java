package pattern.brige;

public class HouseCorp extends Corp{



    public HouseCorp(Product product) {
        super(product);
    }

    @Override
    protected void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱");
    }
}

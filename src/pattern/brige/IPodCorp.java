package pattern.brige;

public class IPodCorp extends Corp{


    public IPodCorp(Product product) {
        super(product);
    }

    @Override
    protected void makeMoney() {
        super.makeMoney();
        System.out.println("赚钱");
    }
}

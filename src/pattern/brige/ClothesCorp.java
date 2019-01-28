package pattern.brige;

public class ClothesCorp extends Corp{

    public ClothesCorp(Product product) {
        super(product);
    }

    @Override
    protected void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱");
    }
}

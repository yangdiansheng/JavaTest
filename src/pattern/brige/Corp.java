package pattern.brige;

public abstract class Corp {
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    protected void makeMoney(){
        this.product.beProducted();
        this.product.beSelled();
    }
}

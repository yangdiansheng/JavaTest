package pattern.responsibility_link.two;

public class Husband extends Handler{

    public Husband() {
        super(Handler.REQUEST_HUSBAND);
    }

    @Override
    protected void response(Women women) {
        System.out.println("\n-------------妻子向丈夫请示------------");
        System.out.println("妻子的请示是：" + women.getRequest());
        System.out.println("丈夫的回到是：同意");
    }
}

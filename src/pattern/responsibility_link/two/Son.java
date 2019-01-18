package pattern.responsibility_link.two;

public class Son extends Handler{

    public Son() {
        super(Handler.REQUEST_SON);
    }

    @Override
    protected void response(Women women) {
        System.out.println("\n-------------母亲向儿子请示------------");
        System.out.println("母亲的请示是：" + women.getRequest());
        System.out.println("儿子的回到是：同意");
    }
}

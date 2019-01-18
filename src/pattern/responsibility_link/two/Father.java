package pattern.responsibility_link.two;

public class Father extends Handler {

    public Father() {
        super(Handler.REQUEST_FATHER);
    }

    @Override
    protected void response(Women women) {
        System.out.println("\n-------------女儿向父亲请示------------");
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println("父亲的回到是：同意");
    }
}

package pattern.status;

public class OpenState extends LiftSate{
    @Override
    public void open() {
        System.out.println("电梯开了。。。");
    }

    @Override
    public void close() {
        super.context.setLiftSate(Context.closeState);
        super.context.getLiftSate().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}

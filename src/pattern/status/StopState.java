package pattern.status;

public class StopState extends LiftSate{
    @Override
    public void open() {
        super.context.setLiftSate(Context.openState);
        super.context.getLiftSate().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.context.setLiftSate(Context.runState);
        super.context.getLiftSate().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停了。。。");
    }
}

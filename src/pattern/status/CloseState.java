package pattern.status;

public class CloseState extends LiftSate{
    @Override
    public void open() {
        super.context.setLiftSate(Context.openState);
        super.context.getLiftSate().open();
    }

    @Override
    public void close() {
        System.out.println("电梯关了。。。");
    }

    @Override
    public void run() {
        super.context.setLiftSate(Context.runState);
        super.context.getLiftSate().run();
    }

    @Override
    public void stop() {
        super.context.setLiftSate(Context.stopState);
        super.context.getLiftSate().stop();
    }
}

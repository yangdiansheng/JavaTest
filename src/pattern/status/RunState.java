package pattern.status;

public class RunState extends LiftSate{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯运行了。。。");
    }

    @Override
    public void stop() {
        super.context.setLiftSate(Context.stopState);
        super.context.getLiftSate().stop();
    }
}

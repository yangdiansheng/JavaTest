package pattern.status;

public class Context {

    public final static LiftSate openState = new OpenState();
    public final static LiftSate closeState = new CloseState();
    public final static LiftSate runState = new RunState();
    public final static LiftSate stopState = new StopState();

    private LiftSate liftSate;

    public LiftSate getLiftSate() {
        return liftSate;
    }

    public void setLiftSate(LiftSate liftSate) {
        this.liftSate = liftSate;
        this.liftSate.setContext(this);
    }

    public void open() {
        this.liftSate.open();
    }

    public void close() {
        this.liftSate.close();
    }

    public void run() {
        this.liftSate.run();
    }

    public void stop() {
        this.liftSate.stop();
    }
}

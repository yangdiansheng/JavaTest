package pattern.status;

public abstract class LiftSate {
    protected Context context;
    public void setContext(Context context){
        this.context = context;
    }
    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}

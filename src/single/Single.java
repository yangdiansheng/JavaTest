package single;

public class Single {
    private Single(){}
    private static class SingleHolder{
        static final Single INSTANCE = new Single();
    }
    public static Single getInstance(){
        return SingleHolder.INSTANCE;
    }
}

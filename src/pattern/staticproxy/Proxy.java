package pattern.staticproxy;

public class Proxy implements Action{

    private Action realObject;

    public Proxy(Action realObject){
        this.realObject = realObject;
    }

    @Override
    public void doSomething() {
        realObject.doSomething();
        System.out.println("Proxy");
    }
}

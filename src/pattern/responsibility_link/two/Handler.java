package pattern.responsibility_link.two;

import com.sun.scenario.effect.impl.prism.PrImage;

/**
 * 控制权对象
 */
public abstract class Handler {

    public final static int REQUEST_FATHER = 1;
    public final static int REQUEST_HUSBAND = 2;
    public final static int REQUEST_SON = 3;

    //能处理的级别
    private int level = 0;
    //责任传递，下一个责任人是谁
    private Handler nextHandler;

    public Handler(int level){
        this.level = level;
    }

    public final void handleMessage(Women women){
        if (women.getType() == this.level){
            this.response(women);
        } else {
            if (this.nextHandler != null){
                this.nextHandler.handleMessage(women);
            } else {
                System.out.println("----没地方请示了，按不同意处理-----");
            }
        }
    }

    public void setNext(Handler handler){
        this.nextHandler = handler;
    }

    protected abstract void response(Women women);
}

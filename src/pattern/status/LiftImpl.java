package pattern.status;

import java.util.List;

public class LiftImpl implements Lift{

    private int state;

    @Override
    public void sate(int state) {

    }

    @Override
    public void open() {
        System.out.println("电梯开了。。。");
    }

    @Override
    public void close() {
        System.out.println("电梯关了。。。");
    }

    @Override
    public void run() {
        System.out.println("电梯运行了。。。");
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了。。。");
    }
}

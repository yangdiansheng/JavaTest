package pattern.build.one;

import java.util.ArrayList;

public abstract class CarModel {
    //这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<>();
    //模型开始跑了
    abstract void start();
    //停止
    abstract void stop();
    //喇叭声音
    abstract void alarm();
    //引擎隆隆响
    abstract void engineBoom();

    public final void run(){
        //循环，谁在前，谁先执行
        for (String s:sequence){
            if (s.equals("start")){
                this.start();
            } else if (s.equals("stop")){
                this.stop();
            }if (s.equals("alarm")){
                this.alarm();
            }if (s.equals("engineBoom")){
                this.engineBoom();
            }
        }
    }

    //把值传递到类内
    public void setSequence(ArrayList sequence){
        this.sequence = sequence;
    }
}

package pattern.build.two;

import pattern.build.one.CarModel;

import java.util.ArrayList;

public abstract class CarBuilder {
    //确定运行的顺序
    public abstract void setSequence(ArrayList<String> sequence);
    public abstract CarModel getCarModel();
}

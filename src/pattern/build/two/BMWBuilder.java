package pattern.build.two;

import pattern.build.one.BMWModel;
import pattern.build.one.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder{

    private BMWModel bmwModel = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmwModel;
    }
}

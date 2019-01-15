package pattern.build.two;

import pattern.build.one.BenzModel;
import pattern.build.one.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder{

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benz;
    }
}

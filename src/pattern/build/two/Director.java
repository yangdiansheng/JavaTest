package pattern.build.two;

import pattern.build.one.BMWModel;
import pattern.build.one.BenzModel;

import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzBuilder() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }

    public BenzModel getBBenzBuilder() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }

    public BMWModel getABMWBuilder() {
        this.sequence.clear();
        this.sequence.add("engineBoom");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel) bmwBuilder.getCarModel();
    }

    public BMWModel getBBMWBuilder() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel) bmwBuilder.getCarModel();
    }
}

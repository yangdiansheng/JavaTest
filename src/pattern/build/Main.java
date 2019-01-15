package pattern.build;


import pattern.build.one.BenzModel;
import pattern.build.two.BenzBuilder;
import pattern.build.two.Director;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
//        BenzModel benz = new BenzModel();
//        ArrayList<String> seqence = new ArrayList<>();
//        seqence.add("start");
//        seqence.add("engineBoom");
//        benz.setSequence(seqence);
//        benz.run();


//        BenzBuilder benz = new BenzBuilder();
//        ArrayList<String> seqence = new ArrayList<>();
//        seqence.add("start");
//        seqence.add("engineBoom");
//        benz.setSequence(seqence);
//        benz.getCarModel().run();

        BenzModel benzModel = new Director().getBBenzBuilder();
        benzModel.run();
    }
}

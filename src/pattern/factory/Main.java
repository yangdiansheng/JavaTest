package pattern.factory;

import pattern.factory.one.*;

public class Main {
    public static void main(String[] args){
//        AbstractHumanFactory humanFactory = new HumanFactory();
//        Human human = humanFactory.createHuman(YellowHuman.class);
//        human.getColor();
//        human.talk();

//        Human human = HumanFactory.createHuman(YellowHuman.class);
//        human.getColor();
//        human.talk();
//
//        Human human = new YellowHumanFactory().createHuman();
//        human.getColor();
//        human.talk();

//        SingleFactory.getInstance().talk();

        Human human1 = pattern.factory.five.HumanFactory.createHuman("yellow");
        human1.getColor();
        human1.talk();
        Human human2 = pattern.factory.five.HumanFactory.createHuman("yellow");
        human2.getColor();
        human2.talk();
        Human human3 = pattern.factory.five.HumanFactory.createHuman("yellow");
        human3.getColor();
        human3.talk();
    }
}

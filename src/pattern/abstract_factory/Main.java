package pattern.abstract_factory;


public class Main {
    public static void main(String[] args){
        Human human = new FemaleFactory().createBlackHuman();
        human.getColor();
        human.getSex();
        human.talk();
    }
}

package pattern.strategy;

public class Hand implements DrinkWaterStrategy{
    @Override
    public void drink() {
        System.out.println("用手捧着喝水");
    }
}

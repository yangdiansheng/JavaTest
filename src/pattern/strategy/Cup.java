package pattern.strategy;

public class Cup implements DrinkWaterStrategy {

    @Override
    public void drink() {
        System.out.println("用杯喝水");
    }
}

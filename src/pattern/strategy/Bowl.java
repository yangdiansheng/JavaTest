package pattern.strategy;

public class Bowl implements DrinkWaterStrategy{
    @Override
    public void drink() {
        System.out.println("用碗喝水");
    }
}

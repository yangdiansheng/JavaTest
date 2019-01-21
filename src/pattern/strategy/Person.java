package pattern.strategy;

public class Person {
    private DrinkWaterStrategy drinkWaterStrategy;

    public Person(DrinkWaterStrategy drinkWaterStrategy){
        this.drinkWaterStrategy = drinkWaterStrategy;
    }

    public void drink(){
        drinkWaterStrategy.drink();
    }
}

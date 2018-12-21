package java8;

public class Dish{
    private final int calories;
    private final String name;
    private final boolean vegetarian;
    private final Type type;

    public enum Type{
        MEAT,FISH,OTHER
    }


    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public Dish(String name,boolean vegetarian, int calories,Type type) {
        this.calories = calories;
        this.name = name;
        this.vegetarian = vegetarian;
        this.type = type;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                '}';
    }
}

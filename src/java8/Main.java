package java8;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );
        int totalCalories = menu.stream().collect(Collectors.summingInt(Dish::getCalories));
        double avgCaloroes = menu.stream().collect(Collectors.averagingInt(Dish::getCalories));
        IntSummaryStatistics menuStatisrics = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        String shortMenu = menu.stream().map(Dish::getName).collect(Collectors.joining(","));
        System.out.println(shortMenu);
        int totalCalories2 = menu.stream().collect(Collectors.reducing(0, Dish::getCalories, (i, j) -> i + j));
        Map<Dish.Type, List<Dish>> dishesByType = menu.stream().collect(Collectors.groupingBy(Dish::getType));
        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = menu.stream().collect(Collectors.groupingBy(dish -> {
            if (dish.getCalories() <= 400)
                return CaloricLevel.DIET;
            else if (dish.getCalories() <= 700)
                return CaloricLevel.NORMAL;
            else
                return CaloricLevel.FAT;
        }));
        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloriesLevel = menu.stream().collect(Collectors.groupingBy(Dish::getType,
                Collectors.groupingBy(dish -> {
                    if (dish.getCalories() <= 400)
                        return CaloricLevel.DIET;
                    else if (dish.getCalories() <= 700)
                        return CaloricLevel.NORMAL;
                    else
                        return CaloricLevel.FAT;
                })));
        Map<Dish.Type, Long> typesCount = menu.stream().collect(Collectors.groupingBy(Dish::getType,
                Collectors.counting()));
        Map<Dish.Type, Optional<Dish>> mostCaloricByType = menu.stream().collect(Collectors.groupingBy(Dish::getType,
                Collectors.maxBy(Comparator.comparing(Dish::getCalories))));
        Map<Dish.Type, Dish> mostCaloricByType2 = menu.stream().collect(Collectors.groupingBy(Dish::getType,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Dish::getCalories)),Optional::get)));
        Map<Boolean,List<Dish>> partitionedMenu = menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian));
    }

    public enum CaloricLevel{
        DIET,NORMAL,FAT
    }
}


package java8;

import java.io.*;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest {

    static List<Apple> lists = new ArrayList<>();
    static List<Transaction> transactions = new ArrayList<>();
    static List<Integer> numbers = new ArrayList<>();

    private void stream(){
        //给苹果按照重量排序
        Collections.sort(lists, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        lists.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));


        //筛选一个目录中隐藏的文件
        File[] hiddenFiles1 = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });

        File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);

        //从一个列表中筛选金额较高的交易，然后按货币分组
        Map<Currency,List<Transaction>> transactionByCurrencies = new HashMap<>();
        for (Transaction transaction:transactions){
            if (transaction.getPrice() > 1000){
                Currency currency = transaction.getCurrency();
                List<Transaction> transactionForCurrency = transactionByCurrencies.get(currency);
                if (transactionForCurrency == null){
                    transactionForCurrency = new ArrayList<>();
                    transactionByCurrencies.put(currency,transactionForCurrency);
                }
                transactionForCurrency.add(transaction);
            }
        }

        Map<Currency,List<Transaction>> transactionByCurrencies2 = transactions.stream()
                        .filter((Transaction transaction) -> transaction.getPrice() > 1000)
                        .collect(Collectors.groupingBy(Transaction::getCurrency));


        List<Apple> heavyApples = lists.stream()
                .filter((Apple apple) -> apple.getWeight() > 150)
                .collect(Collectors.toList());

        List<Apple> heavyApple = lists.parallelStream()
                .filter((Apple apple) -> apple.getWeight() > 150)
                .collect(Collectors.toList());

        Supplier<Apple> c1 = () -> new Apple();
        Apple a1 = c1.get();



    }


    //筛选绿色苹果
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if ("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }


    public static List<Apple> filterGreenApples(List<Apple> inventory,String color){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if (apple.getColor().equals(color)){
                result.add(apple);
            }
        }
        return result;
    }

    //筛选重量超过150克苹果
    public static List<Apple> filterHeavyApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if (apple.getWeight() > 150){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory,int weight){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if (apple.getWeight() > weight){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory,String color,int weight,boolean flag){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if ((flag && apple.getWeight() > weight) ||
                    (!flag && apple.getColor().equals(color))){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate predicate){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if (predicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }


    public static boolean isGreenApple(Apple apple){
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight() > 150;
    }

    public interface Predicate<T>{
        boolean test(T t);
    }

//    static List<Apple> filterApples(List<Apple> inventory,Predicate<Apple> p){
//        List<Apple> result = new ArrayList<>();
//        for (Apple apple:inventory){
//            if (p.test(apple)){
//                result.add(apple);
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) throws IOException {
        filterApples(lists,StreamTest::isGreenApple);
//        filterApples(lists,StreamTest::isHeavyApple);
//
//        filterApples(lists,(Apple apple) -> "green".equals(apple.getColor()));
//        filterApples(lists,(Apple apple) -> apple.getWeight() > 150);
//        filterApples(lists,(Apple apple) -> apple.getWeight() < 150 || "brown".equals(apple.getColor()));
        filterApples(lists,new AppleHeavyWeightPredicate());
        filterApples(lists,new AppleGreenColorPredicate());
        filterApples(lists, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("red");
            }
        });
        filterApples(lists,(Apple apple) -> apple.getColor().equals("yellow"));

        filter(lists,(Apple apple) -> apple.getColor().equals("yellow"));
        filter(numbers,(Integer i) -> i % 2 == 0);

        lists.sort((Apple a1,Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));

        new Thread(() -> System.out.println("111"));

        String result = processFile((BufferedReader br) -> br.readLine() + br.readLine());
        int i = 1000;
        Runnable runnable = () -> System.out.println(i);

    }

    @FunctionalInterface
    public interface BufferedReaderProcessor{
        String process(BufferedReader br) throws IOException;
    }

    public static String processFile(BufferedReaderProcessor processor) throws IOException{
        try (BufferedReader br =
                     new BufferedReader(new FileReader("data.txt"))){
            return processor.process(br);
        }
    }


    public static String processFile() throws IOException{
        try (BufferedReader br =
                     new BufferedReader(new FileReader("data.txt"))){
            return br.readLine();
        }
    }

    public static <T> List<T> filter(List<T> list,Predicate<T> p){
        List<T> result = new ArrayList<>();
        for (T t: list){
            if (p.test(t)){}{
                result.add(t);
            }
        }
        return result;
    }
}

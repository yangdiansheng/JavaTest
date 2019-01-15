package pattern.build.one;

public class BMWModel extends CarModel{
    @Override
    void start() {
        System.out.println("宝马start");
    }

    @Override
    void stop() {
        System.out.println("宝马stop");
    }

    @Override
    void alarm() {
        System.out.println("宝马alarm");
    }

    @Override
    void engineBoom() {
        System.out.println("宝马engineBoom");
    }
}

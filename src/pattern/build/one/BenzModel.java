package pattern.build.one;

public class BenzModel extends CarModel{
    @Override
    void start() {
        System.out.println("奔驰start");
    }

    @Override
    void stop() {
        System.out.println("奔驰stop");
    }

    @Override
    void alarm() {
        System.out.println("奔驰alarm");
    }

    @Override
    void engineBoom() {
        System.out.println("奔驰engineBoom");
    }
}

package proxy;

public class Man implements Person{

    @Override
    public Bean say(int i) {
        System.out.println("我是男人");
        System.out.println("i = " + i);
        return new Bean();
    }

    @Override
    public Bean say2(int i) {
        System.out.println("i2 = " + i);
        return new Bean();
    }
}

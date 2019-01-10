package pattern.single;

/**
 * 皇帝类只能有一个的类
 *
 */
public class Emperor {
    //私有化构造函数
    private Emperor(){}

    private static final Emperor emperor = new Emperor();

    public static Emperor getInstance(){
        return emperor;
    }

    public void say(){
        System.out.println("我就是皇帝某某某。。。。。。。。。");
    }
}

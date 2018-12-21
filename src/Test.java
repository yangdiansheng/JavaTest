public class Test {

    public static long getLong() {
        ThreadLocal<Long> longLocal = new ThreadLocal<Long>();
        return longLocal.get();  //空指针
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.print(Test.getLong());

//          ThreadLocal<Long> longLoca2 = new ThreadLocal<Long>();
//          System.out.print(longLoca2.get());  //  null


    }
}

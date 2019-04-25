package reflect;

import java.lang.reflect.Field;

public class RefectForFinal {

    private final int number = 100;
    private Inner inner = new Inner();

    public class Inner{
        private final int innerNumber;
        public Inner(){
            innerNumber = 200;
        }
    }

    public static void main(String[] args){

        RefectForFinal refectForFinal = new RefectForFinal();
        Inner inner = new RefectForFinal().new Inner();
        System.out.println(inner.innerNumber + "");
//
//        System.out.println(refectForFinal.number + "");
//        Class<RefectForFinal> refectForFinalClass = RefectForFinal.class;
//        for (Field  i:refectForFinalClass.getFields()){
//            System.out.println( i.toString());
//        }

        try {
//            Field field = refectForFinalClass.getDeclaredField("number");
//            field.setAccessible(true);
//            try {
//                field.setInt(refectForFinal,222);
//                System.out.println(refectForFinal.number + "");
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }

            Field field = refectForFinal.getClass().getDeclaredField("inner");
            Class classinner = field.getType();
            Field fieldInner = classinner.getDeclaredField("innerNumber");
            fieldInner.setAccessible(true);
            try {
                fieldInner.set(inner,4444);
                System.out.println(fieldInner.get(inner) + "");
                System.out.println(inner.innerNumber + "");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }


        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
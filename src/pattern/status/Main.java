package pattern.status;

import pattern.single.Emperor;

public class Main {
    public static void main(String[] args){
//        Lift lift = new LiftImpl();
//        lift.open();
//        lift.close();
//        lift.run();
//        lift.stop();

        Context context = new Context();
        context.setLiftSate(Context.closeState);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}

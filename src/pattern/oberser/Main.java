package pattern.oberser;

public class Main {
    public static void main(String[] args){
//        UserInitObserver userInitObserver = new UserInitObserver();
//        LimitObserver limitObserver = new LimitObserver();
//        HomeTopObservable homeTopObservable = new HomeTopObservable();
//        homeTopObservable.addObserver(userInitObserver);
//        homeTopObservable.addObserver(limitObserver);
//        homeTopObservable.notifyObservers();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                    homeTopObservable.setChanged();
//                    homeTopObservable.notifyObservers(userInitObserver);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(2000);
//                    homeTopObservable.setChanged();
//                    homeTopObservable.notifyObservers(limitObserver);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
        showIndexDialog();
    }


    private static void showIndexDialog() {
        if (true) {
            return;
        }
        if (true) {
            if (true) {
                return;
            }
            if (false) {
                return;
            }
            if (false) {
                return;
            }
            System.out.println("22222");
        } else {
            System.out.println("11111");
        }
    }
}

package oberser;

import java.util.Observable;
import java.util.Observer;

public class UserInitObserver implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof UserInitObserver){
            HomeTopObservable homeTopObservable = (HomeTopObservable)o;
            homeTopObservable.mUserInit ++;
            System.out.println(
                    String.format("UserInitObserver is complete %s userinit is %s limit is %s",
                            homeTopObservable.isComplete(),
                            homeTopObservable.mUserInit,
                            homeTopObservable.mLimit));
        }
    }
}

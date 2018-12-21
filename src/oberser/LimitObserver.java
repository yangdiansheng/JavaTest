package oberser;

import sun.rmi.runtime.Log;

import java.util.Observable;
import java.util.Observer;

public class LimitObserver implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof LimitObserver){
            HomeTopObservable homeTopObservable = (HomeTopObservable)o;
            homeTopObservable.mLimit ++;
            System.out.println(
                    String.format("LimitObserver is complete %s userinit is %s limit is %s",
                            homeTopObservable.isComplete(),
                            homeTopObservable.mUserInit,
                            homeTopObservable.mLimit));
        }
    }
}

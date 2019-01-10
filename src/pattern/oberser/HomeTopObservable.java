package pattern.oberser;

import java.util.Observable;

public class HomeTopObservable extends Observable{
    public int mUserInit = 0;
    public int mLimit = 0;

    public boolean isComplete(){
        return mUserInit + mLimit >= countObservers();
    }

    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }
}

package pattern.responsibility_link.one;

public class ProcessCallBack extends ProcessObject{

    public interface CallBack{
        void callBack();
    }

    private CallBack callBack;

    public ProcessCallBack(CallBack callBack){
        this.callBack = callBack;
    }

    @Override
    protected boolean handleWork() {
        if (callBack != null){
            callBack.callBack();
        }
        return true;
    }
}

package delayqueue;

import java.sql.Time;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Content implements Delayed{
    private String mContent;
    private long mExecuteTime;

    public Content(String s, long delayTime) {
        mContent = s;
        mExecuteTime = System.currentTimeMillis() + delayTime;
        System.out.println("System.currentTimeMillis()" + System.currentTimeMillis());
        System.out.println(" delayTime" + delayTime);
        System.out.println(" mExecuteTime" + mExecuteTime);
    }

    public String getContent() {
        return mContent;
    }

    //计算当前时间到执行时间还有多长时间
    @Override
    public long getDelay(TimeUnit unit) {
        System.out.println("getDelay =" + (mExecuteTime - System.currentTimeMillis())/1000);
        return unit.convert(mExecuteTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        //后执行返回正数，先执行返回负数
        if (this.getDelay(TimeUnit.MILLISECONDS) > o.getDelay(TimeUnit.MILLISECONDS)) {
            return -1;
        }
        return 1;
    }
}

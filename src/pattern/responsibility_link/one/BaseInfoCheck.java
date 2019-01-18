package pattern.responsibility_link.one;

public class BaseInfoCheck extends ProcessObject{
    @Override
    protected boolean handleWork() {
        boolean flag = true;
        if (!flag){
            System.out.println("基本信息页 error");
        } else {
            System.out.println("基本信息页 success");
        }
        return flag;
    }
}

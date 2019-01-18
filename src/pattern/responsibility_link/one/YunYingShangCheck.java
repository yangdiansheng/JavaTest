package pattern.responsibility_link.one;

public class YunYingShangCheck extends ProcessObject{
    @Override
    protected boolean handleWork() {
        boolean flag = true;
        if (!flag){
            System.out.println("运营商页 error");
        } else {
            System.out.println("运营商页 success");
        }
        return flag;
    }
}

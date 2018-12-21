package link;

public class BankBindCheck extends ProcessObject{
    @Override
    protected boolean handleWork() {
        boolean flag = true;
        if (!flag){
            System.out.println("银行卡绑定页 error");
        } else {
            System.out.println("银行卡绑定页 success");
        }
        return flag;
    }
}

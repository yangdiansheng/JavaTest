package link;

public class ContactCheck extends ProcessObject{
    @Override
    protected boolean handleWork() {
        boolean flag = true;
        if (!flag){
            System.out.println("联系人认证页 error");
        } else {
            System.out.println("联系人认证页 success");
        }
        return flag;
    }
}

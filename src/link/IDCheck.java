package link;

public class IDCheck extends ProcessObject{

    @Override
    protected boolean handleWork() {
        boolean flag = true;
        if (!flag){
            System.out.println("身份证登录 error");
        } else {
            System.out.println("身份证登录 success");
        }
        return flag;
    }
}

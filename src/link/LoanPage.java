package link;

public class LoanPage extends ProcessObject{
    @Override
    protected boolean handleWork() {
        System.out.println("借款页面，success");
        return true;
    }
}

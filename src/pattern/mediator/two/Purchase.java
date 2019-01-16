package pattern.mediator.two;

/**
 * 采购管理
 */
public class Purchase extends AbstractColleague{

    public Purchase(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    //不要采购IBM电脑
    public void buyIBMcomputer(int number){
        super.mediator.execute("purchase.buy",number);
    }

    //不要在采购IBM电脑
    public void refuseBuyIBM(){
        System.out.println("不要采购IBM电脑");
    }
}

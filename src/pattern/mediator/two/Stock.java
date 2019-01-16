package pattern.mediator.two;

/**
 * 存货管理
 */
public class Stock extends AbstractColleague{
    //最开始库存电脑
    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    //库存增加
    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    //库存降低
    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    //获取库存
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

    //存货压力大了，就要通知采购人员不要采购，销售人员尽快销售
    public void clearStock(){
        super.mediator.execute("clear.stock");
    }
}

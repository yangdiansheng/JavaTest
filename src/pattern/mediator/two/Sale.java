package pattern.mediator.two;

import java.util.Random;

/**
 * 销售管理
 */
public class Sale extends AbstractColleague{

    public Sale(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    //销售IBM电脑
    public void sellIBMComputer(int number){
        super.mediator.execute("sale.offsell",number);
    }

    //反馈销售情况，0~100之间变化，0代表根本就没人买，100代表非常畅销，出一个卖一个
    public int getSaleStatus(){
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑销售情况为：" + saleStatus);
        return saleStatus;
    }

    //折价处理
    public void offSale(){
        super.mediator.execute("sale.offsell");
    }
}

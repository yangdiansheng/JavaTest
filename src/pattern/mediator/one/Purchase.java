package pattern.mediator.one;

/**
 * 采购管理
 */
public class Purchase {

    //不要采购IBM电脑
    public void buyIBMcomputer(int number){
        Stock stock = new Stock();
        Sale sale = new Sale();

        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80){
            //销售情况良好
            System.out.println("采购IBM电脑：" + number+ "台");
            stock.increase(number);
        } else {
            //销售情况不好
            int buyNumber = number/2; //折半采购
            System.out.println("采购IBM电脑：" + buyNumber+ "台");
            stock.increase(number);
        }

    }

    //不要在采购IBM电脑
    public void refuseBuyIBM(){
        System.out.println("不要采购IBM电脑");
    }
}

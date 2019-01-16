package pattern.mediator.one;

import java.util.Random;

/**
 * 销售管理
 */
public class Sale {

    //销售IBM电脑
    public void sellIBMComputer(int number){
        //访问库存
        Stock stock = new Stock();
        //方位采购
        Purchase purchase = new Purchase();
        //库存数量不够
        if (stock.getStockNumber() < number){
            purchase.buyIBMcomputer(number);
        }
        System.out.println("销售IBM电脑：" + number + "台");
        stock.decrease(number);
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
        //库房有多少卖多少
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑：" + stock.getStockNumber() + "台");
    }
}

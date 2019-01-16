package pattern.mediator;


import pattern.mediator.two.Purchase;
import pattern.mediator.two.Sale;
import pattern.mediator.two.Stock;
import pattern.mediator.two.AbstractMediator;
import pattern.mediator.two.Mediator;

public class Main {

    public static void main(String[] args){
//        //采购人员采购电脑
//        System.out.println("----------采购人员采购电脑---------------");
//        Purchase purchase = new Purchase();
//        purchase.buyIBMcomputer(100);
//        System.out.println("----------销售人员销售电脑---------------");
//        Sale sale = new Sale();
//        sale.sellIBMComputer(1);
//        System.out.println("----------库房管理人员清空处理---------------");
//        Stock stock = new Stock();
//        stock.clearStock();


        AbstractMediator mediator = new Mediator();

        //采购人员采购电脑
        System.out.println("----------采购人员采购电脑---------------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
        System.out.println("----------销售人员销售电脑---------------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        System.out.println("----------库房管理人员清空处理---------------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }

}

package pattern.mediator.two;


public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")){
            //采购电脑
            buyCompter((Integer)objects[0]);
        } else  if (str.equals("sale.sell")){
            //销售电脑
            sellComputer((Integer)objects[0]);
        } else  if (str.equals("sale.offsell")){
            //折价销售
            offSell();
        } else  if (str.equals("clear.stock")){
            //清仓处理
            clearStock();
        }
    }

    private void buyCompter(int number){
        int saleStatus = super.sale.getSaleStatus();
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

    private void sellComputer(int number){
        //库存数量不够
        if (super.stock.getStockNumber() < number){
            super.purchase.buyIBMcomputer(number);
        }
        System.out.println("销售IBM电脑：" + number + "台");
        super.stock.decrease(number);
    }

    private void offSell(){
        System.out.println("折价销售IBM电脑：" + stock.getStockNumber() + "台");
    }

    private void clearStock(){
        //要求折价销售
        super.sale.offSale();
        //要求采购人员不要采购
        super.purchase.refuseBuyIBM();
    }
}

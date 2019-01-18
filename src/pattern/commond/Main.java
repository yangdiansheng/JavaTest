package pattern.commond;

public class Main {

    public static void main(String[] args){
//        System.out.println("--------------客户要求增加一项需求---------------");
//        Group rg = new RequirementGroup();
//        rg.find();
//        rg.add();
//        rg.plan();
//
//        System.out.println("--------------客户要求删除一项页面---------------");
//        Group pg = new PageGroup();
//        pg.find();
//        pg.delete();
//        pg.plan();

        //定义接头人
        Invoker invoker = new Invoker();
        System.out.println("--------------客户要求增加一项需求---------------");
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
    }

}

package pattern.adapter;


import pattern.build.one.BenzModel;
import pattern.build.two.Director;

public class Main {
    public static void main(String[] args){
//        UserInfo info = new StaffIn();
//        UserInfo info = new StaffOut();
//        System.out.println("员工姓名：" +info.getName() );
//        System.out.println("员工年龄：" +info.getAge() );
//        System.out.println("员工地址：" +info.getAddress() );
//        System.out.println("员工身份证号：" +info.getIDNumber() );


        PsersonInfo psersonInfo = new PsersonInfo();
        AddressInfo addressInfo = new AddressInfo();
        IDInfo idInfo = new IDInfo();
        UserInfo info = new StaffOut2(psersonInfo,addressInfo,idInfo);
        System.out.println("员工姓名：" +info.getName() );
        System.out.println("员工年龄：" +info.getAge() );
        System.out.println("员工地址：" +info.getAddress() );
        System.out.println("员工身份证号：" +info.getIDNumber() );
    }
}

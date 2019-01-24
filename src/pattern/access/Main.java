package pattern.access;


import pattern.abstract_factory.FemaleFactory;
import pattern.abstract_factory.Human;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        for (Employee employee:mockEmployee()){
            employee.accept(new VisitorImpl());
        }
    }

    public static List<Employee> mockEmployee(){
        List<Employee> employees = new ArrayList<>();
        CommonEmplyee zhangsan = new CommonEmplyee();
        zhangsan.setJob("编写java程序的苦逼程序员");
        zhangsan.setName("张三");
        zhangsan.setSalary(1800);
        zhangsan.setSex(Employee.MALE);
        employees.add(zhangsan);


        CommonEmplyee lisi = new CommonEmplyee();
        lisi.setJob("页面美工");
        lisi.setName("李四");
        lisi.setSalary(1900);
        lisi.setSex(Employee.FEMALE);
        employees.add(lisi);

        Manager wangwu = new Manager();
        wangwu.setPerformance("我会拍马屁");
        wangwu.setName("王五");
        wangwu.setSalary(18080);
        wangwu.setSex(Employee.MALE);
        employees.add(wangwu);

        return employees;
    }
}

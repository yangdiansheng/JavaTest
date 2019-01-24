package pattern.access;

public class VisitorImpl implements Visitor{
    @Override
    public void visit(CommonEmplyee commonEmplyee) {
        System.out.println(this.getCommonEmployee(commonEmplyee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    private String getBaseInfo(Employee employee){
        StringBuffer buffer = new StringBuffer();
        buffer.append("姓名：" + employee.getName() + "\t");
        buffer.append("性别：" +(employee.getSex() == Employee.MALE ? "男" : "女")+ "\t");
        buffer.append("薪水：" + employee.getSalary() + "\t");
        return buffer.toString();
    }

    private String getManagerInfo(Manager manager){
        StringBuffer buffer = new StringBuffer();
        buffer.append(this.getBaseInfo(manager));
        buffer.append("业绩：" + manager.getPerformance()+ "\t");
        return buffer.toString();
    }

    private String getCommonEmployee(CommonEmplyee commonEmplyee){
        StringBuffer buffer = new StringBuffer();
        buffer.append(this.getBaseInfo(commonEmplyee));
        buffer.append("工作：" + commonEmplyee.getJob() + "\t");
        return buffer.toString();
    }


}

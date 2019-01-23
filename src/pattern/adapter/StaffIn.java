package pattern.adapter;

public class StaffIn implements UserInfo{

    @Override
    public String getName() {
        return "张三";
    }

    @Override
    public String getAge() {
        return "16";
    }

    @Override
    public String getAddress() {
        return "北京市";
    }

    @Override
    public String getIDNumber() {
        return "10000";
    }
}

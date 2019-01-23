package pattern.adapter;

public class StaffOut extends OtherUser implements UserInfo{
    @Override
    public String getName() {
        return super.getBaseInfo().get("name");
    }

    @Override
    public String getAge() {
        return super.getBaseInfo().get("age");
    }

    @Override
    public String getAddress() {
        return super.getAddressInfo().get("address");
    }

    @Override
    public String getIDNumber() {
        return super.getIdInfo().get("id");
    }
}

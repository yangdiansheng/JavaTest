package pattern.adapter;

public class StaffOut2 implements UserInfo{

    private PsersonInfo psersonInfo;
    private AddressInfo addressInfo;
    private IDInfo idInfo;

    public StaffOut2(PsersonInfo psersonInfo,AddressInfo addressInfo,IDInfo idInfo){
        this.psersonInfo = psersonInfo;
        this.addressInfo = addressInfo;
        this.idInfo = idInfo;
    }


    @Override
    public String getName() {
        return this.psersonInfo.getName();
    }

    @Override
    public String getAge() {
        return this.psersonInfo.getAge();
    }

    @Override
    public String getAddress() {
        return this.addressInfo.getAddress();
    }

    @Override
    public String getIDNumber() {
        return this.idInfo.getID();
    }
}

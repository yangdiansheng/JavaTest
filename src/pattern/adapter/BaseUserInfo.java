package pattern.adapter;

import java.util.Map;

public interface BaseUserInfo {
    Map<String,String> getBaseInfo();
    Map<String,String> getAddressInfo();
    Map<String,String> getIdInfo();
}

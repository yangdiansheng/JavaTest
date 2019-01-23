package pattern.adapter;

import java.util.HashMap;
import java.util.Map;

public class OtherUser implements BaseUserInfo {
    @Override
    public Map<String, String> getBaseInfo() {
        Map<String,String> map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("age","20");
        return map;
    }

    @Override
    public Map<String, String> getAddressInfo() {
        Map<String,String> map = new HashMap<>();
        map.put("address","shanghai");
        return map;
    }

    @Override
    public Map<String, String> getIdInfo() {
        Map<String,String> map = new HashMap<>();
        map.put("id","3000");
        return map;
    }
}

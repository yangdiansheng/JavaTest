package pattern.factory.five;

import pattern.factory.one.BlackHuman;
import pattern.factory.one.Human;
import pattern.factory.one.WhiteHuman;
import pattern.factory.one.YellowHuman;

import java.util.HashMap;
import java.util.Map;

public class HumanFactory {
    private static final Map<String,Human> humanMap = new HashMap<>();
    public static synchronized Human createHuman(String type){
        Human human = null;
        if (humanMap.containsKey(type)){
            human = humanMap.get(type);
        } else {
            if (type.equals("yellow")){
                human = new YellowHuman();
            } else if (type.equals("black")){
                human = new BlackHuman();
            } else {
                human = new WhiteHuman();
            }
            humanMap.put(type,human);
        }
        return human;
    }
}

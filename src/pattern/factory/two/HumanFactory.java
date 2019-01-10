package pattern.factory.two;

import pattern.factory.one.AbstractHumanFactory;
import pattern.factory.one.Human;

public class HumanFactory{

    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("生成人种错误");
        }
        return (T)human;
    }
}

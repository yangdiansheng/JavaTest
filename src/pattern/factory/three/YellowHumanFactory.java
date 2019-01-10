package pattern.factory.three;

import pattern.factory.one.BlackHuman;
import pattern.factory.one.Human;
import pattern.factory.one.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}

package pattern.factory.three;

import pattern.factory.one.BlackHuman;
import pattern.factory.one.Human;
import pattern.factory.one.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}

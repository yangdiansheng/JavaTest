package pattern.factory.three;

import pattern.factory.one.BlackHuman;
import pattern.factory.one.Human;

public class BlackHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}

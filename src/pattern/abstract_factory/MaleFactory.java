package pattern.abstract_factory;

public class MaleFactory implements HumanFactory{
    @Override
    public Human createYellowHuman() {
        return new MaleYellowMan();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackMan();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteMan();
    }
}

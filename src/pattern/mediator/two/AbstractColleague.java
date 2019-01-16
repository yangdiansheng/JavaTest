package pattern.mediator.two;

public abstract class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator abstractMediator){
        this.mediator = abstractMediator;
    }
}

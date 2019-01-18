package pattern.mediator.two;

/**
 * 抽象伙伴类
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator abstractMediator){
        this.mediator = abstractMediator;
    }
}

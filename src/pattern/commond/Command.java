package pattern.commond;

public abstract class Command {
    //把三组都定义好子类可以直接使用
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();
    //只有一个方法你要我做什么事
    public abstract void execute();
}

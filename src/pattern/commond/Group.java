package pattern.commond;

public abstract class Group {
    //甲乙双方办公，如果你要和某个组讨论，首先要找到这个组
    public abstract void find();
    //被要求增加功能
    public abstract void add();
    //被要求删除功能
    public abstract void delete();
    //被要求修改功能
    public abstract void change();
    //被要求给出所有变更计划
    public abstract void plan();
}

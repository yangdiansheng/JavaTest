package pattern.template;

public abstract class AbstractClass {
    //基本方法
    protected abstract void doSomething();
    //基本方法
    protected abstract void doAnything();
    //模板方法
    public final void templateMethod(){
        /**
         * 调用基本方法完成相关逻辑
         */
        this.doSomething();
        if (this.canDoAnything()){
            this.doAnything();
        }
    }

    /**
     * 钩子，是否可以执行公共算法中的方法
     * @return
     */
    protected abstract boolean canDoAnything();
}

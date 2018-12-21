package link;

public abstract class ProcessObject<Boolean> {
    private ProcessObject<Boolean> successor;

    public void setSuccessor(ProcessObject<Boolean> successor){
        this.successor = successor;
    }

    abstract protected boolean handleWork();

    public boolean handle(){
        boolean flag = handleWork();
        if (flag && successor != null){
            flag = successor.handle();
        }
        return flag;
    }
}

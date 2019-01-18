package pattern.commond;

//接口人
public class Invoker {
    private Command command;

    //客户发出命令
    public void setCommand(Command command){
        this.command = command;
    }

    //执行客户命令
    public void action(){
        this.command.execute();
    }
}

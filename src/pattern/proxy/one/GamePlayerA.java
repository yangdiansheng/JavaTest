package pattern.proxy.one;

public class GamePlayerA implements GamePlayer{

    private String name;

    public GamePlayerA(String name){
        this.name = name;
    }


    @Override
    public void login(String user, String password) {
        System.out.println(name + " 登录成功" + " 登录名为" + user);
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "恭喜你 升级了");
    }
}

package pattern.proxy.two;

import pattern.proxy.one.GamePlayer;

public class GamePlayerB implements GamePlayer{

    private String name;

    public GamePlayerB(GamePlayer gamePlayer, String name) throws Exception {
        if (gamePlayer == null){
            throw new Exception("不能创建真是角色");
        } else {
            this.name = name;
        }
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

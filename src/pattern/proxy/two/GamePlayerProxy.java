package pattern.proxy.two;

import pattern.proxy.one.GamePlayer;

public class GamePlayerProxy implements GamePlayer{

    private GamePlayer gamePlayer;

    public GamePlayerProxy(String name){
        try {
            gamePlayer = new GamePlayerB(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}

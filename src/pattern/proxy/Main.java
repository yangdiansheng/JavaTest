package pattern.proxy;


import pattern.proxy.one.GamePlayer;
import pattern.proxy.one.GamePlayerA;
import pattern.proxy.one.GamePlayerProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args){
        GamePlayer gamePlayer = new GamePlayerA("张三");
        GamePlayer gamePlayerProxy = (GamePlayer) Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(),
                gamePlayer.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return method.invoke(gamePlayer,args);
                    }
                });
        gamePlayerProxy.login("zhangsan","password");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();


//        GamePlayer gamePlayer = new GamePlayerA("张三");
//        gamePlayer.login("zhangsan","password");
//        gamePlayer.killBoss();
//        gamePlayer.upgrade();


//        GamePlayer gamePlayer = new GamePlayerA("张三");
//        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(gamePlayer);
//        gamePlayerProxy.login("zhangsan","password");
//        gamePlayerProxy.killBoss();
//        gamePlayerProxy.upgrade();

//        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy("张三");
//        gamePlayerProxy.login("zhangsan","password");
//        gamePlayerProxy.killBoss();
//        gamePlayerProxy.upgrade();
    }
}

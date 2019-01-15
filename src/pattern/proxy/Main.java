package pattern.proxy;


import pattern.proxy.two.GamePlayerProxy;

public class Main {
    public static void main(String[] args){
//        RealObject realObject = new RealObject();
//        Action action = (Action) Proxy.newProxyInstance(realObject.getClass().getClassLoader(),
//                realObject.getClass().getInterfaces(),
//                new InvocationHandler() {
//                    @Override
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("11111");
//                        return method.invoke(realObject,args);
//                    }
//                });
//        action.doSomething();

//        GamePlayer gamePlayer = new GamePlayerA("张三");
//        gamePlayer.login("zhangsan","password");
//        gamePlayer.killBoss();
//        gamePlayer.upgrade();

//        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(gamePlayer);
//        gamePlayerProxy.login("zhangsan","password");
//        gamePlayerProxy.killBoss();
//        gamePlayerProxy.upgrade();

        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy("张三");
        gamePlayerProxy.login("zhangsan","password");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
    }
}

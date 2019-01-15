package pattern.proxy;

import pattern.staticproxy.RealObject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler{

    private RealObject realObject;

    public ProxyHandler(RealObject realObject){
        this.realObject = realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理扩展逻辑
        System.out.println("ProxyHandler");
        System.out.println(method.toString());

        return method.invoke(realObject,args);
    }
}

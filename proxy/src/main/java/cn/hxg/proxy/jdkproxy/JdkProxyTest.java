package cn.hxg.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* 基于接口的动态代理
* */
public class JdkProxyTest implements InvocationHandler {

    private Object target = null;

    public Object bind(Object target) {

        this.target = target;

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);

    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if("saleBook".equals(method.getName())) {

            return method.invoke(target, (Double)args[0] * 0.8);

        }

        return null;
    }

}

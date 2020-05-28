package cn.hxg.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CglibTest implements MethodInterceptor {

    private Object target = null;

    public Object bind(Object target) {

        this.target = target;

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);

        return enhancer.create();

    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        if("saleCompany".equals(method.getName())) {
            return method.invoke(target, (Double)objects[0] * 0.8);
        }

        return null;

    }

}

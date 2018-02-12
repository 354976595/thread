package main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/7/11.
 */
public class JdkDBQueryHandler implements InvocationHandler {
    IDBQuery real=null;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (real==null){
            real=new DBQuery();
        }return real.request();
    }
    public static IDBQuery createProxy(){
        IDBQuery jdkproxy= (IDBQuery) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{IDBQuery.class},new JdkDBQueryHandler());
        System.out.println(jdkproxy.getClass());
        return jdkproxy;
    }

    public static void main(String[] args) {
        System.out.println(JdkDBQueryHandler.createProxy().request()); ;
    }
}

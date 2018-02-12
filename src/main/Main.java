package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/7/10.
 */
public class Main  {
    public static void main(String[] args) {
        TestThread testThread=new TestThread();
        ExecutorService e= Executors.newCachedThreadPool();

      Thread thread1=  new Thread(testThread);
        e.submit(thread1);
//        thread1.setName("窗口1");
//        Thread thread2=  new Thread(testThread);
//        thread2.setName("窗口2");
//        thread1.start();
//        thread2.start();
    }
}

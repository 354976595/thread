package main;

/**
 * Created by Administrator on 2017/7/10.
 */
public class TestThread implements Runnable {
    private int i=5;
    @Override
    public void run() {
        try {
            runThread();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    private    void runThread() throws InterruptedException {
        for (int j = 0; j <=i; i--) {
            Thread.currentThread().sleep(1000);
            System.out.println(Thread.currentThread().getName()+"卖出了第"+i+"张票");
        }
    }
}

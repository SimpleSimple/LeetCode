package DesignPatternEx_02.Singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonTest {
    private static int clientNum = 100;
    // 需要使用CountdownLatch计数器
    static CountDownLatch doneSingal = new CountDownLatch(clientNum);

    public static void main(String[] args) {
        // 实现线程池，线程池执行获取单例实例的方法
        ExecutorService exec = Executors.newFixedThreadPool(10);
        for (int i = 0; i < clientNum; i++) {
            exec.execute(new MyRunnable());
            doneSingal.countDown();
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            // 获取单例实例 Singleton.getInstance()
            try {
                doneSingal.await(); // 好像是计数器进行等待
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(Singleton.getInstance());
        }
    }

}

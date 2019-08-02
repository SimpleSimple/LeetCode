package DesignPatternEx_02.Singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileConfigTest {
    private static int clientNum = 1000;
    final static CountDownLatch doneSingal = new CountDownLatch(clientNum); // 一个计数器，表示线程任务完成的信号

    public static void main(String[] args) {
        //FileConfig config = FileConfig.getInstance();
        //FileConfig config2 = FileConfig.getInstance();
        //
        //if (config == config2) {
        //    System.out.println("config 和 config2 是一样的");
        //}

        /**
         * 建立线程池
         */
        ExecutorService exec = Executors.newFixedThreadPool(10);
        for (int i = 0; i < clientNum; i++) {
            MyRunnable runnable = new MyRunnable(String.valueOf(i));
            exec.execute(runnable);
            doneSingal.countDown(); // 计数器减值（-1）
        }
    }

    static class MyRunnable implements Runnable {
        private String name;
        public MyRunnable(String name) {
                this.name = name;
        }

        @Override
        public void run() {
            try {
                doneSingal.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread #" + name + " " + FileConfig.getInstance() + "=");
        }
    }
}

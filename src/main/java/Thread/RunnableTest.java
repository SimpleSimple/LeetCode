package Thread;

public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable mr1 = new MyRunnable("mr1");
        MyRunnable mr2 = new MyRunnable("mr2");
        MyRunnable mr3 = new MyRunnable("mr3");
        Thread t1=new Thread(mr1);
        Thread t2=new Thread(mr2);
        Thread t3=new Thread(mr3);
        t1.start();
        t2.start();
        t3.start();
        /**
         *  总结：
         *  MyRunnable先进行实例化在放进线程方法里要比new Thread(new Runnable())在线程里new一个Runnable实例看到多线程
         *  效果好
         *  第二种进行实例化有时看不到多线程效果
         */

    }
}

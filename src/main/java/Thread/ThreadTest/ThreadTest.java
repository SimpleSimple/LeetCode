package Thread.ThreadTest;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread1=new MyThread("Thread1");
        MyThread myThread2=new MyThread("Thread2");
        MyThread myThread3=new MyThread("Thread3");
        myThread1.start();
        myThread2.start();
        myThread3.start();
        /**
         *  总结：
         *  好奇怪，MyThread继承Thread，实现Thread类下的run方法，但是运行run方法的时候显示并没有多线程穿插方式运行，
         *  而是依次按顺序运行的3个线程
         */


    }

}

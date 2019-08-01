package Thread;

/**
 * extends 和 implements区别
 * Java中extends是使用于继承类
 * implements是使用于实现接口
 */
public class MyRunnable implements Runnable {
    String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread name is ：" + name + " i=" + i);
        }
    }

}

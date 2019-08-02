package Thread.ThreadTest;

public class MyThread extends Thread {

    private final String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
                System.out.println("this thread name is ：" + name + " i=" + i);
        }
    }
}

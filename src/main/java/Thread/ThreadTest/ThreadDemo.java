package Thread.ThreadTest;


public class ThreadDemo {
        public static void main(String[] args) {
            /**
             *  开启线程有两个方法start()和run()
             */
            Thread t = new Thread(){
                @Override
                public void run() {
                    threadMethod();
                }
            };
        // 注意如下该句不要写到线程方法里面，否则执行之后的线程会是执行线程的子线程
        System.out.println("Current thread name : " + Thread.currentThread().getName());
        t.start();
    }

    static void threadMethod() {
        // 获取执行当前方法的线程名
        System.out.println("current thread name : " + Thread.currentThread().getName());
    }
}

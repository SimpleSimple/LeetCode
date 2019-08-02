package DataStructureEx.Queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<Integer>();
        myQueue.enQueue(10);
        System.out.println("Queue size：" + myQueue.size());

        myQueue.deQueue();
        System.out.println("Queue size after dequeue：" + myQueue.size());
    }
}

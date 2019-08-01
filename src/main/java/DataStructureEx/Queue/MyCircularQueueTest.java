package DataStructureEx.Queue;

public class MyCircularQueueTest {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(6);

        myCircularQueue.enQueue(111);
        System.out.println("Circular Queue size：" + myCircularQueue.size);
        myCircularQueue.enQueue(222);
        myCircularQueue.enQueue(333);
        myCircularQueue.enQueue(444);
        myCircularQueue.enQueue(555);
        myCircularQueue.enQueue(666);
        myCircularQueue.enQueue(777);
        myCircularQueue.enQueue(888);
        System.out.println("Circular Queue size：" + myCircularQueue.size);

        myCircularQueue.deQueue();
        System.out.println("Circular Queue size：" + myCircularQueue.size);
    }
}

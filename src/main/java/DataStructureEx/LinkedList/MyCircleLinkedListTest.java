package DataStructureEx.LinkedList;

public class MyCircleLinkedListTest {
    public static void main(String[] args) {
        MyCircleLinkedList myCircleLinkedList = new MyCircleLinkedList();
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        head.next = node2;
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = node2;
        //long beforeUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        //System.out.println(beforeUsedMem);
        System.out.println(myCircleLinkedList.hasCycle(head));
        //long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        //System.out.println(afterUsedMem);
        //Long actualUsedMem = afterUsedMem - beforeUsedMem;
        //System.out.println("Actual used memeory：" + actualUsedMem+" MB");
    }
}

package swapPairs;

public class swapPairsTest {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        swapPairsTest test = new swapPairsTest();
        ListNode node = test.swapPairs(head);
        while (node != null) {
            //System.out.println(node.val + " node.next：" + node.next.val);
            System.out.println(node.val);
            node = node.next;
        }
    }

    ListNode cur;

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode n = head.next;
        // 第一次head = 1
        // 第二次head = 3
        // 第三次head以3开始，按head.next.next变为5
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }
}


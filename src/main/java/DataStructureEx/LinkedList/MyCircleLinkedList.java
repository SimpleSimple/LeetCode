package DataStructureEx.LinkedList;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
class MyCircleLinkedList {
    public boolean hasCycle(ListNode head) {
        ListNode pslow = head;
        ListNode pfast = head;

        while (pslow != null && pfast != null && pfast.next != null) {
            pslow = pslow.next;
            pfast = pfast.next.next;
            if (pslow == pfast) {
                return true;
            }
        }
        return false;

        // 注释之前错误思路
//        if (head.next == null && tail == null)
//            return false;
//
//        if (head.next != null && tail != null) { //有环
//            return true;
//        }
//        return false;


    }

    // 如果没有环，快指针将停在链表的末尾
    // 如果有环，快指针将停与慢指针相遇
}
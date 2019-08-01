package DataStructureEx.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        //int param_1 = obj.get(0);
        //System.out.println("get 0-index：" + param_1);
        //obj.addAtHead(1);
        //obj.addAtTail(2);
        //obj.addAtIndex(2, 11);
        //obj.addAtIndex(-1, 0);
        //obj.deleteAtIndex(1);
        //
        //for (int i = 0; i < obj.size(); i++) {
        //    System.out.println("item：" + obj.get(i));
        //}

        int param_1 = obj.get(0);
        System.out.println("get 0-index：" + param_1);
        obj.addAtHead(1);
        //obj.addAtTail(3);
        obj.addAtIndex(1, 2);
        System.out.println(obj.get(1));
        System.out.println(obj.get(0));
        //obj.deleteAtIndex(1);
        System.out.println(obj.get(2));

        /**
         * ["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
         * [[],[1],[3],[1,2],[1],[1],[1]]
         * Expected answer
         * [null,null,null,null,2,null,3]
         *
         * ["MyLinkedList","addAtHead","addAtIndex","get","get","get"]
         * [[],[1],[1,2],[1],[0],[2]]
         *
         */
    }
}

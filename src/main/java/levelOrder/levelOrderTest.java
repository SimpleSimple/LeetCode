package levelOrder;

import org.omg.CORBA.INTERNAL;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class levelOrderTest {
    static List<TreeNode> list = new ArrayList<TreeNode>();

    public static void main(String[] args) {
        //Queue<Integer> queue = new LinkedList<>();
        //queue.offer(1);
        //queue.offer(2);
        //
        //for (int i = 0; i < queue.size(); i++) {
        //    System.out.println("队列的元素：" + queue.peek());
        //}

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode node_20 = new TreeNode(20);
        root.right = node_20;
        TreeNode node_15 = new TreeNode(15);
        TreeNode node_7 = new TreeNode(7);
        node_20.left = node_15;
        node_20.right = node_7;

        levelOrderTest test = new levelOrderTest();
        test.levelOrder(root);
    }

    public void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if (root == null) return;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelnum = queue.size();
            TreeNode cur = queue.poll();
            System.out.println(cur.val);
            for (int i = 0; i < levelnum; i++) {
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
                //subList.add(queue.poll().val);
            }
            //wrapList.add(subList);
        }
        //return wrapList;
    }
}

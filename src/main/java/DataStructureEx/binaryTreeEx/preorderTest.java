package DataStructureEx.binaryTreeEx;

import java.util.LinkedList;
import java.util.List;

public class preorderTest {
    public static void main(String[] args) {
        preorderTest test = new preorderTest();

        String s = "[1,null,2,3]";
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        node2.right = node1;
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node4.left = node2;
        node4.right = node3;
        TreeNode node5 = new TreeNode(5);
        TreeNode root = new TreeNode(0);
        root.left = node4;
        root.right = node5;
        test.preorderTraversal(root);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) return list;
        list.add(root.val);
        if (root.left != null)
            list.addAll(preorderTraversal(root.left));
        if (root.right != null)
            list.addAll(preorderTraversal(root.right));

        return list;
    }
}

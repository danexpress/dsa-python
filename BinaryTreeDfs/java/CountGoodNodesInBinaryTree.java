package BinaryTreeDfs.java;

public class CountGoodNodesInBinaryTree {
    int count = 0;

    public int goodNodes(TreeNode root) {
        helper(root, root.val);
        return count;

    }

    private void helper(TreeNode root, int max) {
        if (root != null) {
            if (root.val >= max) {
                count++;
            }
            helper(root.left, Math.max(root.val, max));
            helper(root.right, Math.max(root.val, max));
        }
    }
}

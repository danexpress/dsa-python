package BinaryTreeDfs.java;

public class LongestZigZagPathInABinaryTree {
    int max = 0;

    public int longestZigZag(TreeNode root) {
        path(root.left, 0, false);
        path(root.right, 0, true);
        return max;
    }

    private void path(TreeNode node, int depth, boolean direction) {
        max = Math.max(max, depth);
        if (node == null)
            return;
        path(node.left, (direction) ? depth + 1 : 0, false);
        path(node.right, (!direction) ? depth + 1 : 0, true);
    }
}

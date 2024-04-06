package BinaryTreeDfs.java;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        if (root.left == null)
            return 1 + maxDepth(root.right);
        if (root.right == null)
            return 1 + maxDepth(root.left);
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }
}

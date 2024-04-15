package BinaryTreeBFS.java;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSum {
    int mxSum = Integer.MIN_VALUE;
    int minLevel = 1;

    public int maxLevelSum(TreeNode root) {
        int level = 1;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (queue.size() > 0) {
            int size = queue.size();
            int sum = 0;
            while (size-- > 0) {
                TreeNode node = queue.remove();
                sum += node.val;
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            if (sum > mxSum) {
                minLevel = level;
                mxSum = sum;
            }
            level++;
        }
        return minLevel;
    }
}

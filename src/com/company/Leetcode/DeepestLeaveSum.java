package com.company.Leetcode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class DeepestLeaveSum {
    //https://joomn11.tistory.com/31 참고하였음
    int result = 0;
    int maxLevel = 0;

    public int deepestLeavesSum(TreeNode root) {
        int level = 0;

        if (root != null) {
            dfs(root, level);
        }

        return result;
    }

    private void dfs(TreeNode node, int level) {
        if (level > maxLevel) {
            result = 0;
            maxLevel = level;
        }

        if (level == maxLevel) {
            result += node.val;
        }

        if (node.right != null) {
            dfs(node.right, level + 1);
        }

        if (node.left != null) {
            dfs(node.left, level + 1);
        }
    }
}

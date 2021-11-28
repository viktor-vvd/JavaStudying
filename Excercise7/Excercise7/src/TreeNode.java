public class TreeNode {
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

class Solution1 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } 

        int leftNode=maxDepth(root.left);
        int rightNode=maxDepth(root.right);

        if(leftNode>rightNode)
        {
            return leftNode + 1;
        }
        else 
        {
            return rightNode + 1;
        }
    }
}
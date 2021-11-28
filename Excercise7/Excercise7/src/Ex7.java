public class Ex7 {
    public static void main(String[] args) throws Exception {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.left = null;
        t.left.right = null;
        t.right.left = new TreeNode(4);
        t.right.right = new TreeNode(5);
        t.right.right.right = new TreeNode(6);
        t.right.right.left = null;

        System.out.println((new Solution1()).maxDepth(t));
    }
}

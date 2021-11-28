import static org.junit.Assert.assertEquals;

import org.junit.Test;

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

    @Test
    public void textEx() {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left = null;
        t1.left.right = null;
        t1.right.left = new TreeNode(4);
        t1.right.right = new TreeNode(5);
        assertEquals(3, (new Solution1()).maxDepth(t1));

        t1.right.right.right = new TreeNode(6);
        t1.right.right.left = null;      
        assertEquals(4, (new Solution1()).maxDepth(t1));

        TreeNode t2 = new TreeNode(1);
        t2.left = null;
        t2.right = new TreeNode(2);
        assertEquals(2, (new Solution1()).maxDepth(t2));

        TreeNode t3 = null;
        assertEquals(0, (new Solution1()).maxDepth(t3));

        TreeNode t4 = new TreeNode(1);
        assertEquals(1, (new Solution1()).maxDepth(t4));

    }

}

package algorithms.easy.trees;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (q == null && p == null) {
            return true;
        }

        if (q == null || p == null) {
            return false;
        }

        if (q.value != p.value) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        System.out.println(new SameTree().isSameTree(root, root1));
    }

}

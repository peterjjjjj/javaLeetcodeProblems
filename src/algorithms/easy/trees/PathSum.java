package algorithms.easy.trees;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        //Preorder.
        if (root == null) return false;

        targetSum -= root.value;

        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        boolean left = hasPathSum(root.left, targetSum);
        boolean right = hasPathSum(root.right, targetSum);

        return left || right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(3);
        System.out.println(new PathSum().hasPathSum(root, 4));
    }
}

package algorithms.easy.trees;

public class DiameterBinaryTree {
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxDiameter;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDiameter = dfs(root.left);
        int rightDiameter = dfs(root.right);

        maxDiameter = Math.max(maxDiameter, leftDiameter + rightDiameter);

        return Math.max(leftDiameter, rightDiameter) + 1;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(new DiameterBinaryTree().diameterOfBinaryTree(root));
    }

}

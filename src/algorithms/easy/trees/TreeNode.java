package algorithms.easy.trees;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void assignLeft(TreeNode left) {
        this.left = left;
    }

    public void assignRight(TreeNode right) {
        this.right = right;
    }


}

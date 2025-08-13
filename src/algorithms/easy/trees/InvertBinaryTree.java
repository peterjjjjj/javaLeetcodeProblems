package algorithms.easy.trees;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        invertTree(root.left);
        invertTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }

    public TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree2(root.left);
        TreeNode right = invertTree2(root.right);

        TreeNode temp = left;
        root.left = right;
        root.right = temp;

        return root;
    }

    public static void main(String[] args) {
        InvertBinaryTree test = new InvertBinaryTree();
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        System.out.println(test.invertTree(tree));
        System.out.println(test.invertTree2(tree));

    }
}

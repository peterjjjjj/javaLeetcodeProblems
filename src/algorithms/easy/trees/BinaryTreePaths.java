package algorithms.easy.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryTreePaths {

    public


    List<Integer> currentPath = new ArrayList<>();
    List<String> allPaths = new ArrayList<>();

    public List<String> TreePath(TreeNode root) {

        dfs(root);
        return allPaths;
    }

    public void dfs(TreeNode root) {

        if (root == null) {
            return;
        }

        currentPath.add(root.value);
        if (root.left == null && root.right == null) {
            String pathString = currentPath.stream().
                    map(String::valueOf).
                    collect(Collectors.joining("->"));

            allPaths.add(pathString);

        }

        dfs(root.left);
        dfs(root.right);
        currentPath.removeLast();

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        // Assign its children, which must also be TreeNode objects
        root.left = new TreeNode(2);
        root.assignRight(new TreeNode(3));
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(new BinaryTreePaths().TreePath(root));
    }



}

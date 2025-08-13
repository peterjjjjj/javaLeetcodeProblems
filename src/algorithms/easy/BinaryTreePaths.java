package algorithms.easy;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryTreePaths {
    int value;
    BinaryTreePaths left;
    BinaryTreePaths right;

    public BinaryTreePaths(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    List<Integer> currentPath = new ArrayList<>();
    List<String> allPaths = new ArrayList<>();

    public List<String> TreePath(BinaryTreePaths root) {

        dfs(root);
        return allPaths;
    }

    public void dfs(BinaryTreePaths root) {

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
        BinaryTreePaths tree = new BinaryTreePaths(1);
        tree.left = new BinaryTreePaths(2);
        tree.right = new BinaryTreePaths(3);
        System.out.println(tree.TreePath(tree));
    }



}

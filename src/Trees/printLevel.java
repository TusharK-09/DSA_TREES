package Trees;

public class printLevel {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }

    public static void printLevelElements(TreeNode root, int level) {
        if (root == null) return;

        if (level == 1) {
            System.out.println(root.data + " ");
        } else {
            printLevelElements(root.left, level - 1);
            printLevelElements(root.right, level - 1);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(100);
        root.left = new TreeNode(50);
        root.right = new TreeNode(150);
        root.left.left = new TreeNode(29);
        root.left.right = new TreeNode(56);

        System.out.println("Nodes at level 2: \uD83D\uDC47");
        printLevelElements(root, 2); // This works fine now
    }
}

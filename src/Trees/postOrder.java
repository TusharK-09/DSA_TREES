package Trees;

public class postOrder {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }

    // Move this method outside TreeNode class and fix it
    public static void visitPostOrder(TreeNode root) {
        if (root == null) return;

        visitPostOrder(root.left);
        visitPostOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(70);

        System.out.print("Postorder traversal: ");
        visitPostOrder(root);
    }
}

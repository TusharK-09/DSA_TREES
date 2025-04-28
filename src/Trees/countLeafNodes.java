package Trees;

public class countLeafNodes {


    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int value) {
            data = value;
            left = right = null;
        }
    }

    static int key = 9;
    static boolean isKeyFound = false;
    static int leafNodes = 0;

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;

        if (root.data == key) {
            isKeyFound = true;
        }

        if(root.left == null && root.right == null){
            leafNodes++;
        }
        int leftNode = countNodes(root.left);
        int rightNode = countNodes(root.right);

        return leftNode + rightNode + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int total = countNodes(root);
        System.out.println("Total nodes -> " + total);
        System.out.println("Total leaf nodes -> " + leafNodes);

        if (isKeyFound) {
            System.out.println("Key " + key + " is present in the Tree.");
        } else {
            System.out.println("Key " + key + " is NOT present in the Tree.");
        }
    }
}


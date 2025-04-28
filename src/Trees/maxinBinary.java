package Trees;

public class maxinBinary {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int val){
            data=val;
            left=right=null;
        }
    }
    public static int findMax(TreeNode root) {
        if(root==null) return Integer.MIN_VALUE;
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        return Math.max(root.data, Math.max(leftMax,rightMax));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(60);
        root.right.right=new TreeNode(70);
        System.out.println("Maxiumum value -> "+findMax(root));
    }
}

package Trees;

import javax.xml.stream.events.EndElement;
import java.util.LinkedList;
import java.util.Queue;

public class InsertNode {

    static  class TreeNode {
        int data;
        TreeNode left,right;

        TreeNode(int val){
            data = val;
            left=right=null;
        }
    }

    //insert function
    public static void insert(TreeNode root, int Element) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();

            if (temp.left == null) {
                temp.left = new TreeNode(Element);
                return;
            } else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new TreeNode(Element);
                return;
            } else {
                queue.add(temp.right);
            }
        }
    }

    public static void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        System.out.println(root.data +" ");
        inorder(root.right);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        System.out.println("Before insertion -> ");
        inorder(root);
        insert(root,12);
        System.out.println("After insertion -> ");
        inorder(root);
    }
}

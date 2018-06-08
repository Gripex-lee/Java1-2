package day6_8;

import java.util.LinkedList;
import java.util.Queue;

public class A045 {  
    TreeNode last;  
    TreeNode nlast;  
    public void printTree(TreeNode root) {  
        Queue<TreeNode> queue = new LinkedList<>();  
        queue.offer(root);  
        last = root;    //记录当前层最后一个节点  
        nlast = root;   //记录下一层的最后一个节点  
        int flag = 1;  
        while (!queue.isEmpty()) {  
            TreeNode t = queue.peek();  
            if(flag == 1){  
                System.out.print(queue.poll().data + " ");  
                flag = 0;  
            }else{  
                queue.poll();  
            }  
                  
            if (t.left != null) {  
                queue.offer(t.left);  
                nlast = t.left;  
            }  
            if (t.right != null) {  
                queue.offer(t.right);  
                nlast = t.right;  
            }  
            // 如果当前输出结点是最右结点，那么换行  
            if (last == t) {  
                flag = 1;  
                last = nlast;  
            }  
        }  
    }  
  
    public static void main(String[] args) {  
        // 构建二叉树  
        TreeNode root = new TreeNode(1);  
        root.left = new TreeNode(2);  
        root.right = new TreeNode(3);  
        root.left.left = new TreeNode(4);  
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);  
        root.right.right = new TreeNode(7);  
        root.right.right.left = new TreeNode(8);  
        root.right.right.right = new TreeNode(9);  
        A045 test = new A045();  
        test.printTree(root);  
    }  
}  
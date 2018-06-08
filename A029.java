package day6_5;

import java.util.Scanner;

class Node {//节点
    int data;
    Node left, right, nextRight;
    Node(int item){
        data = item;
        left = right = nextRight = null;
    }
}

class BinaryTree{
    Node root;
    boolean printAncestors(Node node, int target) {
        if (node == null)
            return false;
        if (node.data == target)
            return true;
        if (printAncestors(node.left, target)
                || printAncestors(node.right, target)) {
            System.out.print(node.data + " ");
            return true;
        }
        return false;
    }
}
public class A029{
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        /*二叉树
                  1
                /   \
               2     3
              / \   / \
             4   5 6   7
                  /     \
                 8       9
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);
        tree.root.right.left.left=new Node(8);
        tree.root.right.right.right=new Node(9);
        Scanner br=new Scanner(System.in);
        int n=br.nextInt();
        br.close();
        tree.printAncestors(tree.root,n);
    }
}

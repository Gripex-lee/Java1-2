package day6_7;

import day6_7.Nodes;

class BinaryTrees{
    Nodes root;
    int diameter(Nodes root){
        if (root == null)
            return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);
        return Math.max(lheight + rheight + 1,
                        Math.max(ldiameter, rdiameter));
    }
    int diameter(){
        return diameter(root);
    }
    static int height(Nodes node){
        if (node == null)
            return 0;
        return (1 + Math.max(height(node.left), height(node.right)));
    }
}
public class A033{
    public static void main(String args[])
    {
        BinaryTrees tree = new BinaryTrees();
        tree.root = new Nodes(1);
        tree.root.left = new Nodes(2);
        tree.root.right = new Nodes(3);
        tree.root.right.left = new Nodes(5);
        tree.root.right.right = new Nodes(6);
        tree.root.right.left.left = new Nodes(7);
        tree.root.right.left.right = new Nodes(8);
        System.out.println(tree.diameter());
    }
}

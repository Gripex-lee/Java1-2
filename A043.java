package day6_8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    private int value;
    public int getValue() {
        return value;
    }
    TreeNode tl;
    TreeNode tr;
	public Object left;
    public TreeNode(int value) {
        this.value = value;
    }
    public TreeNode() {
    }
    public void traversal2(TreeNode node) {
        Queue<TreeNode> q1 = new LinkedList<>();
            Queue<TreeNode> q2 = new LinkedList<>();
            q1.add(node);
            while (!q1.isEmpty()) {
                    while (!q1.isEmpty()) {
                            TreeNode temp = q1.poll();
                            System.out.print(temp.getValue()+" ");

                            if (temp.tl!=null){
                                    q2.add(temp.tl);
                                }
                            if (temp.tr!=null){
                                    q2.add(temp.tr);
                                }
                        }
                    Queue<TreeNode> temp = new LinkedList<>();
                    temp=q1;
                    q1=q2;
                    q2=temp;

                }
        }
    public void traversal(TreeNode node) {
        if (node==null){
            return;
        }
        int head=0;
        int end = 0;
        List<TreeNode> list =new ArrayList<>();
        list.add(node);
        System.out.println(node.getValue());
        while (head<list.size()){
            end=list.size();
            while (head<end){
                if (list.get(head).tl!=null){
                    list.add(list.get(head).tl);
                }
                if (list.get(head).tr!=null){
                    list.add(list.get(head).tr);
                }
                head++;
            }
        }
    }
}
public class A043{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        root.tl = node2;
        root.tr = node3;
        node2.tl = node4;
        node2.tr = node5;
        node3.tl = node6;
        node3.tr = node7;
        node6.tl = node8;
        node7.tr = node9;
        root.traversal2(root);
    }
}

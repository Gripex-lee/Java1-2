package day6_5;

import java.util.Scanner;

public class A028 {
	public static void print(NodeTree root) { // 中序遍历  
        if (root != null) {  
            print(root.left);  
            System.out.print(root.data + " ");  
            print(root.right);
        }
    }
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int []a=new int[6];
		for(int i=0;i<6;i++) {
			a[i]=br.nextInt();
		}
		//int[]a= {10,5,20,9,3,2};
		NodeTree root = new NodeTree(a[0]);   //创建二叉树  
        for(int i=1;i<a.length;i++){  
         root.add(root, a[i]);       //向二叉树中插入数据  
        }  
        print(root); 
	}
}
class NodeTree {  
    int data; //根节点数据  
    NodeTree left; //左子树  
    NodeTree right; //右子树  
    public NodeTree() {  
       super();  
    }
    public NodeTree(int data) { //实例化二叉树  
       super();
       this.data = data;  
       left=null;
       right=null;
    }  
    public void add(NodeTree root,int data){  
        if(data>root.data){ //如果插入的节点大于跟节点  
            if(root.right==null){          //如果右子树为空，就插入，如果不为空就再创建一个节点                                                           
            root.right=new NodeTree(data); //就把插入的节点放在右边  
            }else{  
                this.add(root.right, data);  
            }  
        }else{  //如果插入的节点小于根节点  
            if(root.left==null){ //如果左子树为空，就插入，如果不为空就再创建一个节点             
                root.left=new NodeTree(data); //就把插入的节点放在左边边  
            }else{  
                this.add(root.left, data);  
            }  
        }  
    }  
}  
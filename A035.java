package day6_7;

import java.util.LinkedList;
import day6_7.Nodes;  

public class A035 { 
	static int x=0;
	public static int count(Nodes root) {
		if (root != null) {
			if(root.right==null&&root.left==null)x++;
			count(root.left);
			count(root.right);
		}
		return x;
	}
    public static void getPath(Nodes root){  
        if(root==null) return;  
        LinkedList<Nodes> list = new LinkedList<>();  
        getpathcore(root,list);  
    } 
    private static void getpathcore(Nodes root, LinkedList<Nodes> list) {  
    	if(root==null) return;  
        list.add(root);
        if(root.left==null&&root.right==null){ 
            for(Nodes temp:list){  
                System.out.print(temp.data+" ");  
            }
            System.out.println();  
            list.removeLast(); 
            return;
        }
        getpathcore(root.left,list);  
        getpathcore(root.right,list);  
        list.removeLast();//返回时一定要清除    
    }  
    public static void main(String[] args) {  
        Nodes root = new Nodes(1);  
        root.left = new Nodes(2);  
        root.right = new Nodes(3);  
        root.left.left = new Nodes(4);  
        root.left.right = new Nodes(5);  
        root.right.left = new Nodes(6); 
        root.right.right = new Nodes(7); 
        root.right.left.left = new Nodes(8); 
        root.right.right.right = new Nodes(9); 
        x=count(root);
        System.out.println("有"+x+"个从根节点到叶子节点的路径:");
        getPath(root);  
    }  
} 

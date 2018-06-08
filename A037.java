package day6_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import day6_7.Nodes;

public class A037 {
	Nodes root;
	public void print(Nodes node, int dist, Map<Integer, List<Integer>> map) {
		if (node == null)
			return;
		if (!map.containsKey(dist)){
			List<Integer> list = new ArrayList<>();
			list.add(node.data);
			map.put(dist, list);
		}else {
			map.get(dist).add(node.data);
		}
		print(node.left, dist - 1, map);
		print(node.right, dist + 1, map);
	}
	public static void main(String[] args) {
		A037 tree = new A037();
		Map<Integer, List<Integer>> map = new TreeMap<>();
		tree.root = new Nodes(1);
		tree.root.left = new Nodes(2);
		tree.root.right = new Nodes(3);
		tree.root.right.left = new Nodes(5);
		tree.root.right.right = new Nodes(6);
		tree.root.right.left.left = new Nodes(7);
		tree.root.right.left.right = new Nodes(8);
		tree.print(tree.root, 0, map);
		for (List<Integer> value : map.values()) {
			for(Integer x : value)
				System.out.print(x + " ");
		  	  	System.out.println();
		}
	}
}

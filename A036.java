package day6_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import day6_7.Nodes;

public class A036 {
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
		A036 tree = new A036();
		Map<Integer, List<Integer>> map = new TreeMap<>();//TreeMap保证添加进去的顺序
		tree.root = new Nodes(1);
		tree.root.left = new Nodes(2);
		tree.root.right = new Nodes(3);
		tree.root.right.left = new Nodes(5);
		tree.root.right.right = new Nodes(6);
		tree.root.right.left.left = new Nodes(7);
		tree.root.right.left.right = new Nodes(8);
		tree.print(tree.root, 0, map);
		List<Integer>a=new ArrayList<Integer>();
		for (List<Integer> value : map.values()) {
			int sum=0;
			for(int x=0;x<value.size();x++) {
				sum+=value.get(x);
			}
				a.add(sum);
		}
		System.out.println("第一列和为"+a.get(0)+"，第二列和为"+a.get(1)+"，第三列和为"+a.get(2)+"，第四列和为"+a.get(3));
	}
}

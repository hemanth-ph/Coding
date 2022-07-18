package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
	public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> graph, int n) {
		Queue<Integer> que = new LinkedList<Integer>();
		ArrayList<Integer> op = new ArrayList<Integer>();
		ArrayList<Integer> v = new ArrayList<Integer>();
		int temp, temp_size;
		que.add(0);
		v.add(0);
		System.out.print(graph);
		while (que.size() > 0) {
			temp_size = que.size();
			while (temp_size > 0) {
				temp = que.poll();
				op.add(temp);
				for (int i : graph.get(temp)) {
					if (!v.contains(i)) {
						que.add(i);
						v.add(i);
					}
				}
				temp_size--;
			}
		}
		return op;
	}
}

package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Dfs {
	public static ArrayList<Integer> dfs_helper(ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> v,ArrayList<Integer> op,int n){
		for(int i:graph.get(n)) {
			if(!v.contains(i)) {
				op.add(i);
				v.add(i);
				op=dfs_helper(graph, v,op,i);
			}
		}
		return op;
	}
	public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> graph, int n) {
//		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<Integer> op = new ArrayList<Integer>();
		ArrayList<Integer> v = new ArrayList<Integer>();
		int temp_size,temp;
//		stack.push(0);
		v.add(0);
		op.add(0);
		return dfs_helper(graph, v, op, 0);
	}
}

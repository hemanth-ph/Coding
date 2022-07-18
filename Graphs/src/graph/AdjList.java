package graph;

import java.util.ArrayList;

public class AdjList {
	public static ArrayList<ArrayList<Integer>> formBiDirGraph(int[][] links, int nodes, int edges) {
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp;
		int i;
		for (i = 0; i < nodes; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for (i = 0; i < edges; i++) {
			temp = graph.get(links[i][0]);
			if (!temp.contains(links[i][1])) {
				temp.add(links[i][1]);
			}
			graph.set(links[i][0], temp);
			temp = graph.get(links[i][1]);
			if (!temp.contains(links[i][0])) {
				temp.add(links[i][0]);
			}
			graph.set(links[i][1], temp);
		}
		return graph;
	}

	public static ArrayList<ArrayList<Integer>> formUniDirGraph(int[][] links, int nodes, int edges) {
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp;
		int i;
		for (i = 0; i < nodes; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for (i = 0; i < edges; i++) {
			temp = graph.get(links[i][0]);
			if (!temp.contains(links[i][1])) {
				temp.add(links[i][1]);
			}
			graph.set(links[i][0], temp);
		}
		return graph;
	}
}

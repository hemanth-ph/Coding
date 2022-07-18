package graph;

import java.util.ArrayList;
import java.util.Scanner;
import graph.AdjList;

public class CreateGraph {
	public static ArrayList<ArrayList<Integer>> UniGraph() {
		int nodes, edges, i;
		Scanner ip = new Scanner(System.in);
		nodes = ip.nextInt();
		edges = ip.nextInt();
		int[][] links = new int[edges][2];
		for (i = 0; i < edges; i++) {
			links[i][0] = ip.nextInt();
			links[i][1] = ip.nextInt();
		}
		return AdjList.formUniDirGraph(links, nodes, edges);
	}

	public static ArrayList<ArrayList<Integer>> BiGraph() {
		int nodes, edges, i;
		Scanner ip = new Scanner(System.in);
		nodes = ip.nextInt();
		edges = ip.nextInt();
		int[][] links = new int[edges][2];
		for (i = 0; i < edges; i++) {
			links[i][0] = ip.nextInt();
			links[i][1] = ip.nextInt();
		}
		return AdjList.formBiDirGraph(links, nodes, edges);
	}
}

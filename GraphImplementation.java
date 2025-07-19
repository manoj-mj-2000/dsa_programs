//$Id$
package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class GraphImplementation {

	public static void main(String[] args) {
		// Create and work with Graph DataStructure
		
		Graph graph = new Graph();
		
		for(int i=0;i<5;i++) {
			graph.insertElement(i);
		}
		
		graph.insertEdge(0, 1);
		graph.insertEdge(2, 3);
		graph.insertEdge(1, 2);
		graph.insertEdge(3, 4);
		graph.insertEdge(0, 4);
		graph.insertEdge(1, 4);
		
		graph.printAllConnections();

	}
	
}

class Graph{
	
	List<List<Integer>> graph;
	public Graph() {
		graph = new ArrayList();		
	}

	public void bfs(int v) {
		boolean[] visited = new boolean[graph.size()];
		
		visited[v] = true;
		System.out.println();
		Queue<Integer> q = new LinkedList();
		q.add(v);
		
		while(!q.isEmpty()) {
			int vertex = q.remove();
			System.out.print("  "+vertex);
			for(int i : graph.get(vertex)) {
				if(!visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
	
	public void printAllConnections() {
		for(int i=0;i<5;i++) {
			System.out.println("\nPrinting connections of "+i);
			for(int j=0;j<graph.get(i).size();j++) {
				System.out.print(" "+ graph.get(i).get(j));
			}
		}
	}

	public void insertElement(int val) {
		graph.add(new ArrayList());
	}
	
	public void insertEdge(int u, int v) {
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	
}

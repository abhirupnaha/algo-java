package algo.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import structure.graph.AdjacencyList;

// count number of island in a graph
// or count number of connected graph in graph
// solution is same as bfs for a graph
class NoOfISland {
    public static void main(String[] args) {
        AdjacencyList adj = new AdjacencyList(9);
        adj.addEdge(0, 1);
        adj.addEdge(0, 2);
        adj.addEdge(3, 4);
        adj.addEdge(5, 6);
        adj.addEdge(5, 7);
        adj.addEdge(7, 8);
        // System.out.println(adj);

        ArrayList<ArrayList<Integer>> adjList = adj.getList();
        boolean[] visited = new boolean[adjList.size()];
        int i = 0, count = 0;

        while (i < visited.length) {
            if (!visited[i]) {
                visitIslandVertices(adjList, visited, i);
                count ++;
            }
            i ++;
        }

        System.out.println(count);
    }

    static void visitIslandVertices(
        ArrayList<ArrayList<Integer>> adjList,
        boolean[] visited,
        int root
    ) {
        Queue<Integer> queue = new LinkedList<>();
        int v = root;

        queue.offer(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            v = queue.poll();
            for (int vi : adjList.get(v)) {
                if (!visited[vi]) {
                    queue.offer(vi);
                    visited[vi] = true;
                }
            }
        }
    }
}

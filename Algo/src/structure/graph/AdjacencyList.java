package structure.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// undirected
public class AdjacencyList {
    private ArrayList<ArrayList<Integer>> list;
    private int v; // no of vertex

    public AdjacencyList(int v) {
        this.v = v;
        list = new ArrayList<ArrayList<Integer>>(this.v);

        for (int i = 0; i < v; i ++)
            list.add(new ArrayList<Integer>());
    }

    public void addEdge(int vIdx1, int vIdx2) {
        list.get(vIdx1).add(vIdx2);
        list.get(vIdx2).add(vIdx1);
    }

    public void bfs() { bfs(0); }

    // O(V + E) (v -> no of vertices, e -> no of edges)
    // bfs for disconnected and connected graph
    public void bfs(int vIdx) {
        boolean[] visited = new boolean[v];
        int i = vIdx;

        do {
            if (!visited[i]) bfsConnected(i, visited);
            i = (i + 1) % v;
        } while (i != vIdx);
    }

    // bfs for connected graph
    // O(E)
    private void bfsConnected(int vIdx, boolean[] visited) {
        int v;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(vIdx);
        visited[vIdx] = true;

        while (!queue.isEmpty()) {
            v = queue.poll();
            System.out.println(v);

            for (int e : list.get(v)) {
                if (!visited[e]) {
                    queue.offer(e);
                    visited[e] = true;
                }
            }
        }
    }

    public void dfs() {dfs(0);}

    public void dfs(int vIdx) {
        boolean[] visited = new boolean[v];

        int i = 0;
        while (i < visited.length) {
            if (!visited[i]) dfs(i, visited);
            i ++;
        }
    }

    private void dfs(int vIdx, boolean[] visited) {
        visited[vIdx] = true;

        for (int v : list.get(vIdx))
            if (!visited[v]) dfs(v, visited);

        System.out.println(vIdx);
    }

    @Override
    public String toString() {
        String st = "";

        Iterator<ArrayList<Integer>> it = list.iterator();
        while (it.hasNext()) {
            st += it.next().toString() + (it.hasNext()? "\n" : "");
        }

        return st;
    }

    public ArrayList<ArrayList<Integer>> getList() {
        return list;
    }
}

class DemoAdjacencyList {
    public static void main(String[] args) {
        // System.out.println("test for connected graph");
        // testConnected();
        // System.out.println("test for disconnected graph");
        // testDisconnected();
        testDfs();
    }

    static void testDfs() {
        AdjacencyList g1 = new AdjacencyList(6);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(2, 3);
        g1.addEdge(3, 1);
        g1.addEdge(1, 4);
        g1.addEdge(4, 5);
        System.out.println(g1);
        g1.dfs();
    }

    static void testConnected() {
        AdjacencyList al2 = new AdjacencyList(6);
        al2.addEdge(0, 1);
        al2.addEdge(1, 3);
        al2.addEdge(3, 5);
        al2.addEdge(0, 5);
        al2.addEdge(0, 2);
        al2.addEdge(2, 4);
        al2.addEdge(4, 5);
        System.out.println(al2);
        System.out.println("bfs of 0");
        al2.bfs(0);
        System.out.println("bfs of 1");
        al2.bfs(1);
    }

    static void testDisconnected() {
        AdjacencyList g = new AdjacencyList(7);
        g.addEdge(0, 1);
        g.addEdge(1, 3);
        g.addEdge(3, 2);
        g.addEdge(0, 2);
        g.addEdge(4, 5);
        g.addEdge(5, 6);
        g.addEdge(6, 4);
        System.out.println(g);
        g.bfs(0);
    }
}

/*
Author: Dinesh Sinnathamby
Date: November 12th, 2026
Description: Traverses a directed graph using breadth-first search and a queue.
*/

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    private String[] vertices;
    private int[][] adj;

    public BreadthFirstSearch(String[] vertices, int[][] adj) {
        this.vertices = vertices;
        this.adj = adj;
    }

    public void search(int start) {
        boolean[] visited = new boolean[vertices.length];
        Queue<Integer> queue = new LinkedList<Integer>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.remove();
            System.out.print(vertices[current] + " ");

            for (int neighbour : adj[current]) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
    }
}

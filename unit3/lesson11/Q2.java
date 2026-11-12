/*
Author: Dinesh Sinnathamby
Date: November 12th, 2026
Description: Tests breadth-first search on the four-vertex directed graph.
*/

public class Q2 {
    public static void main(String[] args) {
        String[] vertices = {"0", "1", "2", "3"};
        int[][] adj = {
            {1, 2}, {2}, {0, 3}, {3}
        };

        BreadthFirstSearch graph = new BreadthFirstSearch(vertices, adj);
        graph.search(2);
    }
}

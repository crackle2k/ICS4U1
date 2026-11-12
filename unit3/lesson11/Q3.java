/*
Author: Dinesh Sinnathamby
Date: November 12th, 2026
Description: Tests breadth-first search on the directed graph with vertices A to H.
*/

public class Q3 {
    public static void main(String[] args) {
        String[] vertices = {"A", "B", "C", "D", "E", "F", "G", "H"};
        int[][] adj = {
            {1, 3}
            {2, 5},
            {4, 6, 7},
            {5},
            {1, 5},
            {0},
            {4, 7},
            {0}
        };

        BreadthFirstSearch graph = new BreadthFirstSearch(vertices, adj);
        graph.search(0);
    }
}

package com.kourouma.training.datastructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    List<GraphNode> nodeList = new ArrayList<>();
    int[][] adjacencyMatrix;

    public Graph(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void AddUndirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("  ");
        for (int i = 0; i < nodeList.size(); i++) {
            sb.append(nodeList.get(i).name + " ");
        }
        sb.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            sb.append(nodeList.get(i).name + ": ");
            for (int j : adjacencyMatrix[i]) {
                sb.append((j) + " ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public List<GraphNode> getNeighbors(GraphNode node) {
        List<GraphNode> neighbors = new ArrayList<>();
        int nodeIndex = node.index;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1) {
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }

    void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            List<GraphNode> neighbors = getNeighbors(currentNode);
            for (GraphNode neighbor : neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

   public void bfs() {
        for (GraphNode neighbor : nodeList) {
            if (!neighbor.isVisited) {
                bfsVisit(neighbor);
            }
        }
    }
}

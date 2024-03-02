package com.kourouma.training.datastructure.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphClient {

    public static void main(String[] args) {

        List<GraphNode> nodeList = new ArrayList<>();

        nodeList.add(new GraphNode("A",0));
        nodeList.add(new GraphNode("B",1));
        nodeList.add(new GraphNode("C",2));
        nodeList.add(new GraphNode("D",3));
        nodeList.add(new GraphNode("E",4));

        Graph graph = new Graph(nodeList);
        graph.AddUndirectedEdge(0,1);
        graph.AddUndirectedEdge(0,2);
        graph.AddUndirectedEdge(0,3);
        graph.AddUndirectedEdge(1,4);
        graph.AddUndirectedEdge(2,3);
        graph.AddUndirectedEdge(3,4);

        System.out.println(graph.toString());

        graph.bfs();
    }
}

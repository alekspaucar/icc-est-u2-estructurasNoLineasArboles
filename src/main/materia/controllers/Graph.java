package main.materia.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import main.materia.models.NodeGraph;

public class Graph {
    private List<NodeGraph> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public NodeGraph addNodeG(int value) {
        NodeGraph nodeGraph = new NodeGraph(value);
        nodes.add(nodeGraph);
        return nodeGraph;
    }

    public void addEdge(NodeGraph src, NodeGraph dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src); 
    }

    public void printGraph() {
        for (NodeGraph nodeGraph : nodes) {
            System.out.print("vertice: " + nodeGraph.getValue() + ": ");
            for (NodeGraph nei : nodeGraph.getNeighbors()) {
                System.out.print(nei.getValue() + " - ");
            }
            System.out.println();
        }
    }

    public void addEdgeUni(NodeGraph src, NodeGraph dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);  
    }

    // Método DFS no dirigido
    public void getDFS(NodeGraph start) {
        Set<NodeGraph> visitados = new HashSet<>();
        System.out.print("DFS no dirigido desde el nodo " + start.getValue() + ": ");
        getDFSUtil(start, visitados);
        System.out.println();
    }

    private void getDFSUtil(NodeGraph node, Set<NodeGraph> visitados) {
        if (visitados.contains(node)) {
            return;
        }
        System.out.print(node.getValue() + " ");
        visitados.add(node);

        for (NodeGraph neighbor : node.getNeighbors()) {
            getDFSUtil(neighbor, visitados);
        }
    }

    // Método BFS no dirigido
    public void getBFS(NodeGraph start) {
        Set<NodeGraph> visitados = new HashSet<>();
        Queue<NodeGraph> cola = new LinkedList<>();
        System.out.print("BFS no dirigido desde el nodo " + start.getValue() + ": ");
        cola.add(start);
        visitados.add(start);

        while (!cola.isEmpty()) {
            NodeGraph actual = cola.poll();
            System.out.print(actual.getValue() + " ");

            for (NodeGraph neighbor : actual.getNeighbors()) {
                if (!visitados.contains(neighbor)) {
                    visitados.add(neighbor);
                    cola.add(neighbor);
                }
            }
        }
        System.out.println();
    }

}















    /* 
    public int[][] getAdjacencyMatrix(){
        return null;
    }
    public void printAdjacencyMatrix(){
    }
}
*/
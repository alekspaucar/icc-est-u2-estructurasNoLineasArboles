package main.materia.models;


import java.util.LinkedList;
import java.util.List;

public class NodeGraph {
    private int value;
    private List <NodeGraph> neighbors;

    public NodeGraph(int value) {
        this.value = value;
        this.neighbors = new LinkedList<>();
    }

    public int getValue() {
        return value;
    }
    public List<NodeGraph> getNeighbors() {
        return neighbors;
    }
  
    public void addNeighbor(NodeGraph neighbor){
        if (!neighbors.contains(neighbor)) {
            neighbors.add(neighbor);
        }
    }
}

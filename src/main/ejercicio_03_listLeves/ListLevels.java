package main.ejercicio_03_listLeves;

import java.util.*;
import main.materia.controllers.models.Node;

public class ListLevels {

    public List<List<Node>> ListLevels(Node root) {
        List<List<Node>> levels = new ArrayList<>();

        if (root == null) {
            return levels;  
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);  

        while (!queue.isEmpty()) {
            int levelSize = queue.size();  
            List<Node> level = new ArrayList<>();  

            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                level.add(currentNode); 


                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }

            levels.add(level); 
        }

        return levels; 
    }
}


import java.util.List;

import common.Node;
import main.ejercicio_01_insert.InsertBST;
import main.ejercicio_03_listLeves.ListLevels;
import main.materia.controllers.ArbolAVL;
import main.materia.controllers.ArbolBinario;
import main.materia.controllers.ArbolRecorridos;
import main.materia.controllers.Graph;
import main.materia.models.NodeGraph;

public class App {
    public static void main(String[] args) {
// Llamamos al método para correr el árbol binario
        //runArbolBinario();
        // runEjercicio();
        //runArbolAvl();
        //runInsertBST();
        runGraph();

    }
    private static void runGraph(){
    // Grafo 1 (original con nodos y conexiones ya definidos)
    Graph grafo1 = new Graph();

    NodeGraph g1node0 = grafo1.addNode(0);
    NodeGraph g1node1 = grafo1.addNode(1);
    NodeGraph g1node2 = grafo1.addNode(2);
    NodeGraph g1node3 = grafo1.addNode(3);
    NodeGraph g1node4 = grafo1.addNode(4);
    NodeGraph g1node5 = grafo1.addNode(5);

    System.out.println("GRAFO 1 - DIRECCIONAL:");
    grafo1.addEdgeUnit(g1node0, g1node3);
    grafo1.addEdgeUnit(g1node0, g1node5);
    grafo1.addEdgeUnit(g1node3, g1node2);
    grafo1.addEdgeUnit(g1node3, g1node4);
    grafo1.addEdgeUnit(g1node4, g1node1);
    grafo1.addEdgeUnit(g1node2, g1node1);
    grafo1.addEdgeUnit(g1node1, g1node0);

    grafo1.printGraph();
    System.out.println();

    System.out.println("RECORRIDOS GRAFO 1:");
    grafo1.getDFS(g1node0);
    grafo1.getBFS(g1node0);
    System.out.println();

    Graph grafo2 = new Graph();

    // Crear nodos según la imagen
    NodeGraph g2node0 = grafo2.addNode(0);
    NodeGraph g2node1 = grafo2.addNode(1);
    NodeGraph g2node2 = grafo2.addNode(2);
    NodeGraph g2node3 = grafo2.addNode(3);
    NodeGraph g2node4 = grafo2.addNode(4);
    NodeGraph g2node5 = grafo2.addNode(5);
    NodeGraph g2node7 = grafo2.addNode(7);
    NodeGraph g2node8 = grafo2.addNode(8);
    NodeGraph g2node9 = grafo2.addNode(9);

    // Conexiones del grafo según la imagen (dirigidas)
    grafo2.addEdgeUnit(g2node0, g2node1);
    grafo2.addEdgeUnit(g2node0, g2node5);
    grafo2.addEdgeUnit(g2node0, g2node7);
    grafo2.addEdgeUnit(g2node1, g2node2);
    grafo2.addEdgeUnit(g2node2, g2node3);
    grafo2.addEdgeUnit(g2node3, g2node4);
    grafo2.addEdgeUnit(g2node4, g2node1);
    grafo2.addEdgeUnit(g2node3, g2node7);
    grafo2.addEdgeUnit(g2node7, g2node9);
    grafo2.addEdgeUnit(g2node9, g2node5);
    grafo2.addEdgeUnit(g2node7, g2node8);

    System.out.println("----------------------------------------------------");
    System.out.println("GRAFO 2 - REPRESENTACIÓN DE LA IMAGEN:");
    grafo2.printGraph();

    System.out.println("\nRECORRIDOS GRAFO 2:");
    grafo2.getDFS(g2node0);
    grafo2.getBFS(g2node0);
/* 

        Graph grafo = new Graph();
        NodeGraph nodo1 = grafo.addNodeG(5);
        NodeGraph nodo2 = grafo.addNodeG(7);
        NodeGraph nodo3 = grafo.addNodeG(9);
        NodeGraph nodo4 = grafo.addNodeG(11);
        NodeGraph nodo5 = grafo.addNodeG(3);
        grafo.addEdge(nodo1, nodo5);
        grafo.addEdge(nodo1, nodo2);
        grafo.addEdge(nodo1,nodo3);
        grafo.addEdge(nodo2, nodo3);
        grafo.addEdge(nodo5, nodo3);
        grafo.addEdge(nodo5, nodo4);

        grafo.printGraph();
*/


    }
    public static void runInsertBST() {
        InsertBST bst = new InsertBST();
        Node root = null;
    
        root = bst.insert(root, 50);  
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);
        root = bst.insert(root, 20);
        root = bst.insert(root, 40);
        root = bst.insert(root, 60);
        root = bst.insert(root, 80);
   
        System.out.print("InOrder Traversal: ");
        bst.inOrder(root); 
        System.out.println();
    }
    private static void runArbolAvl() {
    int [] values = {10,20,15,24,9,8,21,23,50,25};   
    ArbolAVL arbolavl = new ArbolAVL();
        for(int num : values){
            arbolavl.insert(num);
        }
        arbolavl.printTree();

    }
    private static void runEjercicio() {
        ArbolBinario arbolbinario = new ArbolBinario();
        int[] valores = {4, 2, 7, 1, 3, 6, 9};
        for (int valor : valores) {
            arbolbinario.insert(valor);
        }
        System.out.println("Árbol binario:");
        arbolbinario.printTree();
        ListLevels levels = new ListLevels();
        List<List<Node>> result = levels.ListLevels(arbolbinario.getRoot());
        System.out.println("\nNiveles del árbol:");
        for (int i = 0; i < result.size(); i++) {
            List<Node> level = result.get(i);
            System.out.print("Nivel " + i + ": ");
            for (Node node : level) {
                System.out.print(node.getValue() + " ");
            }
            System.out.println();
        }
    }
    public static void runArbolBinario() {
        ArbolBinario arbolbinario = new ArbolBinario();
        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
        for (int valor : valores) {
            arbolbinario.insert(valor);
        }

       arbolbinario.printTree();
        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();
        //recorrido PRE ORder iterativa
        System.out.println("\nRecorrido en Preorden (Iterativo):");
        arbolRecorridos.preOrderIterativo(arbolbinario.getRoot());  
        // recorrido Pre order recursivo
        System.out.println("\nrecorrido en Preorde (recursivo): ");
        arbolRecorridos.preOrderRecursivo(arbolbinario.getRoot());
        //recorrido Post Order Recursivo
        System.out.println("\nrecorrido en Post order (Recursivo)");
        arbolRecorridos.postOrderRecursivo(arbolbinario.getRoot());
        //recorrido in Order Recursivo
        System.out.println("\nrecorrido en in Order (recursivo)");
        arbolRecorridos.inOrderRecursivo(arbolbinario.getRoot());






   
   
   


    }
}
 
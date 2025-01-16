
import java.util.List;

import common.Node;
import main.ejercicio_01_insert.InsertBST;
import main.ejercicio_03_listLeves.ListLevels;
import main.materia.controllers.ArbolAVL;
import main.materia.controllers.ArbolBinario;
import main.materia.controllers.ArbolRecorridos;

public class App {
    public static void main(String[] args) {
// Llamamos al método para correr el árbol binario
        //runArbolBinario();
        // runEjercicio();
        //runArbolAvl();
        
        runInsertBST();
    }public static void runInsertBST() {
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
 
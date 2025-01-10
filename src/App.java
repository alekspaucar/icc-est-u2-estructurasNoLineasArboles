
import main.ejercicio_03_listLeves.ListLevels;
import main.materia.controllers.ArbolBinario;
import main.materia.controllers.ArbolRecorridos;

public class App {
    public static void main(String[] args) {
        // Llamamos al método para correr el árbol binario
        runArbolBinario();
        runEjercicio();
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

    private static void runEjercicio(){
        ArbolBinario arbolbinario = new ArbolBinario();
        ListLevels levels= new ListLevels();

        int[] valores = { numeros };
        
        for (int valor : valores) {
            arbolbinario.insert(valor);
        }

       arbolbinario.printTree();
        int lista = levels.ListLevels(arbolbinario.getRoot());
        System.out.println(lista);
    }
}

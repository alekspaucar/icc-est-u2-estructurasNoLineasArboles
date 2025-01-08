
import main.materia.controllers.ArbolBinario;

public class App {
    public static void main(String[] args) {
        // Llamamos al método para correr el árbol binario
        runArbolBinario();
    }


    public static void runArbolBinario() {
        ArbolBinario arbolbinario = new ArbolBinario();

        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};

        for (int valor : valores) {
            arbolbinario.insert(valor);
        }

        arbolbinario.printTree();
    }
}

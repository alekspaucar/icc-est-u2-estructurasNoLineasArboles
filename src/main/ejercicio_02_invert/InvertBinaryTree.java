package main.ejercicio_02_invert;

import common.Node;

public class InvertBinaryTree {

    public Node invertTree(Node root) {
        if (root == null) {
            return null;
        }

        // Intercambiar los hijos izquierdo y derecho
        Node temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

        // Llamar recursivamente para los subárboles
        invertTree(root.getLeft());
        invertTree(root.getRight());

        return root;
    }

    // Método para mostrar el árbol en orden
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getValue() + " ");
            inOrder(root.getRight());
        }
    }
}

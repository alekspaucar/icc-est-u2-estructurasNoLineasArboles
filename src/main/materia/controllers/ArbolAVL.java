
package main.materia.controllers;
import common.Node;

public class ArbolAVL {
private Node root;

    public void insert(int value){
            System.out.println("Nodo a insertar: "+value);
            root = insert(root,value);
}
    private Node insert(Node nodo, int value){
        if(nodo == null){
           Node newNode = new Node(value);
           newNode.setHeight(1); //altura es 1 de cualquier nodo al ingresar

           return newNode;
        }
        if(value <nodo.getValue()){
            nodo.setLeft(insert(nodo.getLeft(),value));
        }else if(value > nodo.getValue()){
            nodo.setRight(insert(nodo.getRight(),value));
        }else{
            return nodo;
        }
        nodo.setHeight( 1 + 
                        Math.max(
                        height(nodo.getLeft()),
                        height(nodo.getRight())));
        //obtener el balance o factor de equilibrio:
        int balance = getBalance (nodo);
        //caso izquierda - izquierda
        if(balance > 1 && value < nodo.getLeft().getValue()){
            return rightRotate(nodo);

        }
        //caso Derecha - Derecha
        if(balance < -1 && value > nodo.getRight().getValue()){
            return leftRotate(nodo);
        }
        //caso Izquierda - derecha
        if(balance > 1 && value > nodo.getLeft().getValue()){
            nodo.setLeft(leftRotate(nodo.getLeft()));
            return rightRotate(nodo);
        }
        //caso Derecha - Izquierda
        if(balance < 1 && value < nodo.getRight().getValue()){
            nodo.setRight(rightRotate(nodo.getRight()));
            return leftRotate(nodo);
        }
        //devolvemos el nodo sin cambios 
        
        return nodo;
    }
    private int height(Node node){
        if(node == null){
            return 0;
        }
        return node.getHeight();
    }
    private int getBalance(Node node){
        if(node == null){
            return 0;
        }
        return height(node.getLeft()) - height(node.getRight());

    }

public void printTree() {
        printTree(root, " ", true);
    }
    
    private void printTree(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "-----" : "-----") + node.getValue());
            if (node.getLeft() != null || node.getRight() != null) {
                if (node.getLeft() != null) {
                    printTree(node.getLeft(), prefix + (isLeft ? "|   " : "   "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "|   " : "   ") + "---- null");
                }
                if (node.getRight() != null) {
                    printTree(node.getRight(), prefix + (isLeft ? "|   " : "   "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "l   " : "   ") + "---null");
                }
            }
        }
    }
//rotacion a la derecha
private Node rightRotate(Node y) {
    if (y == null || y.getLeft() == null) {
        return y; // Si no se puede rotar, devolvemos el nodo tal cual.
    }
    
    Node x = y.getLeft();
    Node temp = x.getRight();

    // Imprimir la información antes de la rotación
    System.out.println("Rotamos derecha el nodo: " + y.getValue());
    
    // Realizamos la rotación
    x.setRight(y);
    y.setLeft(temp);

    // Actualizar las alturas
    y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())));
    x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())));

    // Imprimir la información después de la rotación
    System.out.println("Nueva raíz después de la rotación: " + x.getValue());
    
    // Devolver la nueva raíz
    return x;
}
//rotacion a la Izquierda
    private Node leftRotate(Node x) {
        Node y = x.getRight();
        Node temp = y.getLeft();
        //imprimir la infromacion antes de la toracion
        System.out.println("Rotamos izquierda el nodo: "+x.getValue()+",balance:");
        //realizamos la rotacion
        y.setLeft(x);
        x.setRight(temp);
        //actualizar las alturas
        x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())) + 1);
        y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())) + 1);
        //imprimir la informacion despues de la rotacion
        System.out.println("nueva raiz despues de la rotacion: "+y.getValue());
        //devolver la nueva raiz
        return y;
    }

}

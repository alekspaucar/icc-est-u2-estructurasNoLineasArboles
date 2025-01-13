package main.materia.controllers;

import java.util.Stack;
import main.materia.controllers.models.Node;

public class ArbolRecorridos {
    public void preOrderIterativo(Node root){
    Stack <Node> stack= new Stack<>();
    stack.push(root);
    while(!stack.isEmpty()){
        Node node = stack.pop();
        System.out.print(node.getValue()+" ");

        if(node.getRight()!= null){
            stack.push(node.getRight());
        }
        if(node.getLeft() != null){
            stack.push(node.getLeft());

            }
        }
    }
    public void preOrderRecursivo(Node node){
        //verifica si el nodo esta vacio 
        if( node != null){
            //imprimir el valor actual 
            System.out.print(node.getValue() + ", ");            
            //metodo recursivo en el lado izquierdo
            preOrderRecursivo(node.getLeft());
            //metodo recursivo en el lado derecho
            preOrderRecursivo(node.getRight());
        }
    }
    public void inOrderRecursivo(Node node){
        if(node != null){
            inOrderRecursivo(node.getLeft());

            System.out.print(node.getValue()+", ");

            inOrderRecursivo(node.getRight());

        }
    }
    public void postOrderRecursivo(Node node){
        if(node!=null){
            postOrderRecursivo(node.getLeft());   
            postOrderRecursivo(node.getRight());
            System.out.print(node.getValue()+", ");
        }
    }
}
package common;

public class Node {
    private int value;
    private Node left;
    private Node right;
    private Integer height; // Usamos Integer para que pueda ser null en árboles binarios simples.

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.height = null; // Por defecto, no usamos la altura.
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm507projekt2;

/**
 *
 * @author Mads
 */
public class Node {


    private Node leftChild = null;
    private Node rightChild = null;
    private int key;
    private String data; //is not used in this project

    public Node(Node leftChild, Node rightChild, int key) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.key = key;
    }

    public Node() {
    }

    public Node(int key) {
        this.key = key;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getData() {
        return data;
    }
}

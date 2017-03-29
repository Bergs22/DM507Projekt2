/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm507projekt2;

/**
 * @author Mads
 */
public class DictBinTree implements Dict {

    private Node root = null;
    private int size = 0;

    public DictBinTree() {
    }

    @Override
    public void insert(int key) {
        size++;
        Node newNode = new Node(key);
        Node y = null;
        Node x = root;
        while (x != null) {
            y = x;
            if (newNode.getKey() < x.getKey()) {
                x.setLeftChild(x);
                
            } else {
                x.setRightChild(x);

            }
        }
        if (y == null) {
            root = newNode;
        } else if (newNode.getKey() < y.getKey()) {
            y.setLeftChild(newNode);
        } else {
            y.setRightChild(newNode);
        }
    }

    @Override
    public int[] orderedTraversal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean search(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

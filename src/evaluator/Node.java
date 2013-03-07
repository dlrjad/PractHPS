/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluator;

/**
 *
 * @author jorge
 */
public abstract class Node<Generic> {
    protected Node left, right;
    public abstract Generic evaluate();

    public void setLeft(Node left) {
        this.left =left;
    }
    public void setRight(Node right) {
        this.right = right;
    }
}

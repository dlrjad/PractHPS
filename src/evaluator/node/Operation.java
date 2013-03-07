/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluator.node;

import evaluator.Node;

/**
 *
 * @author jorge
 */
public abstract class Operation<Generic> extends Node{
    protected char operator;
    @Override
    public abstract Generic evaluate();
}

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
public class Constant<Generic> extends Node{
    
    private Generic information;
    
    public Constant(Generic information){
        this.information = information;
        left = null;
        right = null;
    }

    @Override
    public Generic evaluate() {
        return information;
    }
    
}

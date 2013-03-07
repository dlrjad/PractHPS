/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluator.node.operation;

import evaluator.node.Operation;
import evaluator.calculator.NumberCalculator;

/**
 *
 * @author jorge
 */
public class Unary<Generic> extends Operation{

    private NumberCalculator nc = new NumberCalculator();
    
    public Unary(char operator){
        this.operator = operator;
        left = null;
        right = null;
    }

    @Override
    public Generic evaluate() {
        switch(operator){
            case '|' : 
                if((left.evaluate() instanceof Double)){
                    return (Generic) nc.abs(Double.valueOf(String.valueOf(left.evaluate())));
                }
                
            case '#' : 
                if((left.evaluate() instanceof Double)){
                    return (Generic) nc.squareRoot(Double.valueOf(String.valueOf(left.evaluate())));
                }
            default: return null;
        }
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDiv;

import evaluator.Node;
import evaluator.node.Constant;
import evaluator.node.operation.Binary;
import static java.lang.System.out;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author jorge
 */
public class TestDivDouble {
    
    private Constant newConstantNode;
    private Binary OperatorNode;
    private Node root;
    
    @Test
    public void Result(){
        OperatorNode = new Binary('/');
        root = OperatorNode;
        newConstantNode= new Constant(5.0);
        root.setLeft(newConstantNode);
        newConstantNode= new Constant(-0.0);
        root.setRight(newConstantNode);
        try{
            Assert.assertEquals(Double.NEGATIVE_INFINITY, OperatorNode.evaluate());
        }
        catch(NullPointerException e){ out.println("Null Pointer"); }
        catch(ArithmeticException e){ out.println("Division by zero"); }
        
        OperatorNode.calculate();
        //OperatorNode.getMethodSignature(Calculator.NumberCalculator.substractDouble(java.lang.Double,java.lang.Double));
    }
}

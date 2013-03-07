/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestNumberAbsolute;

import evaluator.Node;
import evaluator.node.Constant;
import evaluator.node.operation.Unary;
import static java.lang.System.out;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author jorge
 */
public class TestNumberAbsolute {
    private Constant newConstantNode;
    private Unary OperatorNode;
    private Node root;
    
    @Test
    public void Result(){
        OperatorNode = new Unary('|');
        root = OperatorNode;
        newConstantNode= new Constant(-6.0);
        root.setLeft(newConstantNode);
        try{
            Assert.assertEquals(6.0, OperatorNode.evaluate());
        }catch(NullPointerException e){ out.println("Null Pointer"); }
    }
}

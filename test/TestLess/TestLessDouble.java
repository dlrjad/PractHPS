/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLess;

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
public class TestLessDouble {
    
    private Constant newConstantNode;
    private Binary OperatorNode;
    private Node root;
    
    @Test
    public void ResultFalse(){
        OperatorNode = new Binary('<');
        root = OperatorNode;
        newConstantNode= new Constant(5.0);
        root.setLeft(newConstantNode);
        newConstantNode= new Constant(0.0);
        root.setRight(newConstantNode);
        try{
            Assert.assertEquals(false, OperatorNode.evaluate());
        }
        catch(NullPointerException e){ out.println("Null Pointer"); }
    }
    
    @Test
    public void ResultTrue(){
        OperatorNode = new Binary('<');
        root = OperatorNode;
        newConstantNode= new Constant(1.0);
        root.setLeft(newConstantNode);
        newConstantNode= new Constant(2.0);
        root.setRight(newConstantNode);
        try{
            Assert.assertEquals(true, OperatorNode.evaluate());
        }catch(NullPointerException e){ out.println("Null Pointer"); }
    }  
}

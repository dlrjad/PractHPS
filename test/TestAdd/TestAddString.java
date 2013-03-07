/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestAdd;

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
public class TestAddString {
    
    private Constant newConstantNode;
    private Binary OperatorNode;
    private Node root;
    
    @Test
    public void Result(){
        OperatorNode = new Binary('+');
        root = OperatorNode;
        newConstantNode= new Constant("Hello ");
        root.setLeft(newConstantNode);
        newConstantNode= new Constant("World");
        root.setRight(newConstantNode);
        try{
            Assert.assertEquals("Hello World", OperatorNode.evaluate());
        }catch(NullPointerException e){ out.println("Null Pointer"); }  
    }
}

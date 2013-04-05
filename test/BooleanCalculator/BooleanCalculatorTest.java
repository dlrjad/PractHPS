package BooleanCalculator;

import evaluator.Token;
import evaluator.operator.BinaryOperator;
import evaluator.token.Constant;
import evaluator.token.operation.BinaryOperation;
import junit.framework.Assert;
import org.junit.Test;

public class BooleanCalculatorTest {
    
    @Test
    public void doubleDoubleEqualTest() {
        Token token = new BinaryOperation(new Constant(new evaluator.type.Double(2.5)), new Constant(new evaluator.type.Double(2.5)), BinaryOperator.EQUAL);
        Assert.assertEquals(true, token.evaluate().getValue());
    }
    
    @Test
    public void doubleDoubleNotEqualTest() {
        Token token = new BinaryOperation(new Constant(new evaluator.type.Double(-2.5)), new Constant(new evaluator.type.Double(2.5)), BinaryOperator.EQUAL);
        Assert.assertEquals(false, token.evaluate().getValue());
    }
    
    @Test
    public void doubleDoubleLessTest() {
        Token token = new BinaryOperation(new Constant(new evaluator.type.Double(1.5)), new Constant(new evaluator.type.Double(2.5)), BinaryOperator.LESS);
        Assert.assertEquals(true, token.evaluate().getValue());
    }
    
    @Test
    public void doubleDoubleNotLessTest() {
        Token token = new BinaryOperation(new Constant(new evaluator.type.Double(4.5)), new Constant(new evaluator.type.Double(2.5)), BinaryOperator.LESS);
        Assert.assertEquals(false, token.evaluate().getValue());
    }
    
    @Test
    public void doubleDoubleHigherTest() {
        Token token = new BinaryOperation(new Constant(new evaluator.type.Double(4.5)), new Constant(new evaluator.type.Double(2.5)), BinaryOperator.HIGHER);
        Assert.assertEquals(true, token.evaluate().getValue());
    }
    
    @Test
    public void doubleDoubleNotHigherTest() {
        Token token = new BinaryOperation(new Constant(new evaluator.type.Double(-2.5)), new Constant(new evaluator.type.Double(2.5)), BinaryOperator.HIGHER);
        Assert.assertEquals(false, token.evaluate().getValue());
    }
    
}

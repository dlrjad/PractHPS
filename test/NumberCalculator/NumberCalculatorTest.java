package NumberCalculator;

import evaluator.Token;
import evaluator.operator.BinaryOperator;
import evaluator.operator.UnaryOperator;
import evaluator.token.Constant;
import evaluator.token.operation.BinaryOperation;
import evaluator.token.operation.UnaryOperation;
import evaluator.type.Double;
import evaluator.type.Integer;
import junit.framework.Assert;
import org.junit.Test;

public class NumberCalculatorTest {
    
    @Test
    public void doubleAbsTest() {
        Token token = new UnaryOperation(new Constant(new Double(-2.5)), UnaryOperator.abs);
        Assert.assertEquals(2.5, token.evaluate().getValue());
    }
    
    @Test
    public void doubleSqrtTest() {
        Token token = new UnaryOperation(new Constant(new Double(2.25)), UnaryOperator.sqrt);
        Assert.assertEquals(1.5, token.evaluate().getValue());
    }
    
    @Test
    public void doubleDoubleAddTest() {
        Token token = new BinaryOperation(new Constant(new Double(2.5)), new Constant(new Integer(-2)), BinaryOperator.ADD);
        Assert.assertEquals(0.5, token.evaluate().getValue());
    }
    
    @Test
    public void doubleIntegerAddTest() {
        Token token = new BinaryOperation(new Constant(new Integer(-1)), new Constant(new Integer(-2)), BinaryOperator.ADD);
        Assert.assertEquals(-3, token.evaluate().getValue());
    }
    
    @Test
    public void integerDoubleAddTest() {
        Token token = new BinaryOperation(new Constant(new Integer(4)), new Constant(new Double(1.75)), BinaryOperator.ADD);
        Assert.assertEquals(5.75, token.evaluate().getValue());
    }
    
    @Test
    public void integerIntegerAddTest() {
        Token token = new BinaryOperation(new Constant(new Integer(-1)), new Constant(new Integer(-2)), BinaryOperator.ADD);
        Assert.assertEquals(-3, token.evaluate().getValue());
    }

    @Test
    public void integerDoubleMultiplyTest() {
        Token token = new BinaryOperation(new Constant(new Integer(-1)), new Constant(new Double(2.0)), BinaryOperator.MULTIPLY);
        Assert.assertEquals(-2.0, token.evaluate().getValue());
    }

    @Test
    public void doubleIntegerMultiplyTest() {
        Token token = new BinaryOperation(new Constant(new Double(1.0)), new Constant(new Integer(2)), BinaryOperator.MULTIPLY);
        Assert.assertEquals(2.0, token.evaluate().getValue());
    }

    @Test
    public void doubleDoubleMultiplyTest() {
        Token token = new BinaryOperation(new Constant(new Double(1.0)), new Constant(new Double(2.0)), BinaryOperator.MULTIPLY);
        Assert.assertEquals(2.0, token.evaluate().getValue());
    }

    @Test
    public void integerIntegerMultiplyTest() {
        Token token = new BinaryOperation(new Constant(new Integer(-1)), new Constant(new Integer(-2)), BinaryOperator.MULTIPLY);
        Assert.assertEquals(2, token.evaluate().getValue());
    }
    
}

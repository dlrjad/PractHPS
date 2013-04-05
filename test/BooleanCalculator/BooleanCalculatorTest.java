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
        Token token = new BinaryOperation(new Constant(new evaluator.type.Double(2.5)), new Constant(new evaluator.type.Double(-2.5)), BinaryOperator.EQUAL);
        Assert.assertEquals(false, token.evaluate().getValue());
    }
}

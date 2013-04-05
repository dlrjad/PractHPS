package StringCalculator;

import evaluator.Token;
import evaluator.operator.BinaryOperator;
import evaluator.token.Constant;
import evaluator.token.operation.BinaryOperation;
import junit.framework.Assert;
import org.junit.Test;

public class StringCalculatorTest {
    
    @Test
    public void stringStringEqualTest() {
        Token token = new BinaryOperation(new Constant(new evaluator.type.Strings("Test de...")), new Constant(new evaluator.type.Strings("string")), BinaryOperator.ADD);
        Assert.assertEquals("Test de...string", token.evaluate().getValue());
    }
    
    @Test
    public void stringDoubleEqualTest() {
        Token token = new BinaryOperation(new Constant(new evaluator.type.Strings("Valor de...")), new Constant(new evaluator.type.Double(3.75)), BinaryOperator.ADD);
        Assert.assertEquals("Valor de...3.75", token.evaluate().getValue());
    }

}

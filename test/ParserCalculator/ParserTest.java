package ParserCalculator;

import evaluator.Parser;
import evaluator.Token;
import evaluator.operator.BinaryOperator;
import evaluator.token.Constant;
import evaluator.token.operation.BinaryOperation;
import evaluator.type.Double;
import org.junit.Assert;
import org.junit.Test;

public class ParserTest {
    
    @Test
    public void parserTest(){
        Parser parser = new Parser();
        Assert.assertNull(parser.getTree(""));
    }
    
    @Test
    public void doubleAddTest(){
        Parser parser = new Parser();
         Token addToken = 
             new BinaryOperation(
                 new BinaryOperation(
                    new Constant(new Double(1.1)),
                    new Constant(new Double(2.6)),
                    BinaryOperator.ADD),
                 new Constant(new Double(6.5)), 
                 BinaryOperator.ADD
             );
         Token token = parser.getTree("1.1 + 2.6 + 6.5");
         Assert.assertEquals(token.toString(), addToken.toString());    
    }
    
    @Test
    public void addMultiplyTest(){
        Parser parser = new Parser();
         Token addToken = 
             new BinaryOperation(
                 new BinaryOperation(
                    new Constant(new Double(1.1)),
                    new Constant(new Double(2.6)),
                    BinaryOperator.MULTIPLY),
                 new Constant(new Double(6.5)), 
                 BinaryOperator.ADD
             );
         Token token = parser.getTree("1.1 * 2.6 + 6.5");
         Assert.assertEquals(token.evaluate().getValue(), addToken.evaluate().getValue());    
    }
    
}

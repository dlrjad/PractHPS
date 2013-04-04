package Mockito;

import evaluator.Token;
import evaluator.token.operation.BinaryOperation;
import evaluator.token.operation.UnaryOperation;
import evaluator.type.Double;
import junit.framework.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class MockitoTest {

    @Test
    public void simpleAddMockTest() {
        Token addToken = Mockito.mock(BinaryOperation.class);
        Mockito.when(addToken.evaluate()).thenReturn(new Double(3.0));
        Assert.assertEquals(3.0, addToken.evaluate().getValue());
    }
    
    @Test
    public void simpleAbsMockTest() {
        Token absToken = Mockito.mock(UnaryOperation.class);
        Mockito.when(absToken.evaluate()).thenReturn(new Double(7.75));
        Assert.assertEquals(7.75, absToken.evaluate().getValue());
    }

    @Test
    public void treeToStringMockTest() {
        Token addToken = Mockito.mock(BinaryOperation.class);
        Mockito.when(addToken.toString()).thenReturn("(1.0+2.0)*2.0");
        Assert.assertEquals("(1.0+2.0)*2.0", addToken.toString());

    }

}

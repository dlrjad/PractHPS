package evaluator.operator;

import evaluator.Operator;
import evaluator.annotation.Operators;

public class UnaryOperator extends Operator {

    @Operators
    public static final UnaryOperator abs = new UnaryOperator("abs", "abs", 1);
    
    @Operators
    public static final UnaryOperator sqrt = new UnaryOperator("sqrt", "sqrt", 1);
    
    @Operators
    public static final UnaryOperator sin = new UnaryOperator("sin", "sin", 1);
    
    @Operators
    public static final UnaryOperator cos = new UnaryOperator("cos", "cos", 1);
    
    @Operators
    public static final UnaryOperator tan = new UnaryOperator("tan", "tan", 1);

    private UnaryOperator(String symbol, String name, int precedence) {
        super(symbol, name, precedence);
    }
}

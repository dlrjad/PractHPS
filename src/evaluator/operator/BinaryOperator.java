package evaluator.operator;

import evaluator.Operator;
import evaluator.annotation.Operators;

public class BinaryOperator extends Operator {

    @Operators
    public static final BinaryOperator ADD = new BinaryOperator("+", "add", 1);
    @Operators
    public static final BinaryOperator SUBSTRACT = new BinaryOperator("-", "substract", 1);
    @Operators
    public static final BinaryOperator MULTIPLY = new BinaryOperator("*", "multiply", 2);
    @Operators
    public static final BinaryOperator DIVISION = new BinaryOperator("/", "division", 2);
    
    @Operators
    public static final BinaryOperator EQUAL = new BinaryOperator("=", "equal", 1);
    @Operators
    public static final BinaryOperator LESS = new BinaryOperator("<", "less", 1);
    @Operators
    public static final BinaryOperator HIGHER = new BinaryOperator(">", "higher", 1);

    private BinaryOperator(String symbol, String name, int precedence) {
        super(symbol, name, precedence);
    }
}

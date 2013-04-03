package evaluator.token.operation;

import evaluator.CalculatorSolver;
import evaluator.Operator;
import evaluator.Token;
import evaluator.Type;

public class Unary extends Token{

    private final Token child;
    private final Operator operator;
    private CalculatorSolver calculatorSolver= new CalculatorSolver();

    public Unary(Token child, Operator operator) {
        this.child = child;
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
    }
    
    public Token getChild() {
        return child;
    }

    @Override
    public Type evaluate() {
        return calculatorSolver.getResult(operator, new Type[]{child.evaluate()});
    }

    @Override
    public String toString() {
        return child.toString()+operator.getSymbol();
    }
    
}

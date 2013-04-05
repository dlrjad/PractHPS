package evaluator.calculator;

import evaluator.Calculator;
import evaluator.annotation.Operation;
import evaluator.type.Boolean;
import evaluator.type.Double;

public class BooleanCalculator implements Calculator{
    
    public BooleanCalculator(){
    }
    
    @Operation("=")
    public static Boolean equal(Double p0, Double p1) {
        return (p0.getValue().equals(p1.getValue())) ? new Boolean(true) : new Boolean(false);      
    }
    
    @Operation("<")
    public static Boolean less(Double p0, Double p1) {
        return (p0.getValue()<p1.getValue()) ? new Boolean(true) : new Boolean(false);      
    }
    
    @Operation(">")
    public static Boolean higher(Double p0, Double p1) {
        return (p0.getValue()>p1.getValue()) ? new Boolean(true) : new Boolean(false);      
    }
}

package evaluator.calculator;

import evaluator.annotation.Operation;
import evaluator.type.Double;

public class BooleanCalculator {
    @Operation("=")
    public static Boolean equal(Double p0, Double p1) {
        return (p0.getClass() == p1.getClass()) ? true : false;
        
    }
}

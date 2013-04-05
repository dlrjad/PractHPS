package evaluator.calculator;

import evaluator.Calculator;
import evaluator.annotation.Operation;

public class StringCalculator implements Calculator{
    
    @Operation("+")
    public static String add(String p0, String p1) {
        return p0.concat(p1);
    }
    
}

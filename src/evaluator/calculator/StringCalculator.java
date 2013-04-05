package evaluator.calculator;

import evaluator.Calculator;
import evaluator.annotation.Operation;
import evaluator.type.Double;
import evaluator.type.Strings;

public class StringCalculator implements Calculator{
    
    public StringCalculator(){
        
    }
    
    @Operation("+")
    public static Strings add(Strings p0, Strings p1) {
        return new Strings(p0.getValue()+p1.getValue());
    }
    
    @Operation("+")
    public static Strings add(Strings p0, Double p1) {
        return new Strings(p0.getValue().toString().concat(p1.getValue().toString()));
    }
    
}

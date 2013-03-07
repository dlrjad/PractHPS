/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluator.node.operation;

import evaluator.node.Operation;
import evaluator.calculator.BooleanCalculator;
import evaluator.calculator.NumberCalculator;
import evaluator.calculator.StringCalculator;
import evaluator.Type;
import java.lang.reflect.Method;

/**
 *
 * @author jorge
 */
public class Binary<Generic> extends Operation{
    
    private NumberCalculator nc = new NumberCalculator();
    private StringCalculator sc = new StringCalculator();
    private BooleanCalculator bc = new BooleanCalculator();
  
    public Binary(char operator){
        this.operator = operator;
        left = null;
        right = null;
    }

    @Override
    public Generic evaluate() {
        
        switch(operator){
            case '+' :
                if((left.evaluate() instanceof Double) && (right.evaluate() instanceof Double)){
                    return (Generic) nc.add(Double.valueOf(String.valueOf(left.evaluate())), Double.valueOf(String.valueOf(right.evaluate())));
                }
                if((left.evaluate() instanceof Double) && (right.evaluate() instanceof Integer)){
                    return (Generic) nc.add(Double.valueOf(String.valueOf(left.evaluate())), Integer.parseInt(String.valueOf(right.evaluate())));
                }
                if((left.evaluate() instanceof String) && (right.evaluate() instanceof String)){
                    return (Generic) sc.addString(String.valueOf(left.evaluate()), String.valueOf(right.evaluate()));
                }
                if((left.evaluate() instanceof String) && (right.evaluate() instanceof Double)){
                    return (Generic) sc.addStringDouble(String.valueOf(left.evaluate()), Double.valueOf(String.valueOf(right.evaluate())));
                }
                if((left.evaluate() instanceof String) && (right.evaluate() instanceof Integer)){
                    return (Generic) sc.addStringInteger(String.valueOf(left.evaluate()), Integer.parseInt(String.valueOf(right.evaluate())));
                }
            
            case '*' :
                if((left.evaluate() instanceof Double) && (right.evaluate() instanceof Double)){
                    return (Generic)  nc.multDouble(Double.valueOf(String.valueOf(left.evaluate())), Double.valueOf(String.valueOf(right.evaluate())));
                }
                
            case '/' : 
                if((left.evaluate() instanceof Double) && (right.evaluate() instanceof Double)){
                    return (Generic)  nc.divDouble(Double.valueOf(String.valueOf(left.evaluate())), Double.valueOf(String.valueOf(right.evaluate())));

                }
                
            case '-' : 
                if((left.evaluate() instanceof Double) && (right.evaluate() instanceof Double)){
                    return (Generic)  nc.substractDouble(Double.valueOf(String.valueOf(left.evaluate())), Double.valueOf(String.valueOf(right.evaluate())));
                }
                
            case '<' :
                if((left.evaluate() instanceof Double) && (right.evaluate() instanceof Double)){
                    return (Generic) bc.lessDouble(Double.valueOf(String.valueOf(left.evaluate())), Double.valueOf(String.valueOf(right.evaluate())));
                }
            default: return null;
        }
    }
    
    public Type calculate(){
        for(Method method : NumberCalculator.class.getDeclaredMethods()){
            if(getMethodSignature(method).equals(getSignature())){
                //return (Type) method.invoke(this, left, right);
            }
        }
        return null;
    }
    
    
    
    public static String getMethodSignature(Method method){
        String result = method.getName();
        for(Class<?> parameter : method.getParameterTypes()) {
            result += parameter.getSimpleName();   
        }
        return result;
    }
    
    private String getSignature(){
        return null;
    }
 
}

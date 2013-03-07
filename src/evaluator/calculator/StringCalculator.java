/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluator.calculator;

import evaluator.Calculator;

/**
 *
 * @author jorge
 */
public class StringCalculator extends Calculator{
    
    public String addString(String x, String y){
        return x.concat(y);
    }
    
    public String addStringDouble(String x, Double y){
        return x.concat(String.valueOf(y));
    }
    
    public String addStringInteger(String x, Integer y){
        return x.concat(String.valueOf(y));
    }
    
}

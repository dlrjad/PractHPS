/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluator.calculator;

import evaluator.Calculator;
import evaluator.annotation.Function;
import evaluator.annotation.Operator;

/**
 *
 * @author jorge
 */
public class NumberCalculator extends Calculator {

    @Function
    public Double abs(Double x) {
        return Math.abs(x);
    }

    @Function("sqrt")
    public Double squareRoot(Double x) {
        return Math.sqrt(x);
    }

    @Operator("+")
    public Double add(Double x, Double y) {
        return x + y;
    }

    @Operator("+")
    public Double add(Double x, Integer y) {
        return x + y;
    }

    public Double multDouble(Double x, Double y) {
        return x * y;
    }

    public Double divDouble(Double x, Double y) {
        return x / y;
    }

    public Double substractDouble(Double x, Double y) {
        return x - y;
    }
    
}

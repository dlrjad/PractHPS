package evaluator.calculator;

import evaluator.Calculator;
import evaluator.annotation.Constant;
import evaluator.annotation.Function;
import evaluator.annotation.Operation;
import evaluator.type.Double;
import evaluator.type.Integer;

public class NumberCalculator implements Calculator {
    
    private final Range range;

    public NumberCalculator(Range range) {
        this.range = range;
    }
    public Range getRange() {
        return range;
    }

    public java.lang.Double getUpperLimit() {
        return range.getUpperLimit();
    }

    public java.lang.Double getLowerLimit() {
        return range.getLowerLimit();
    }
    
    @Constant
    public static final double PI = Math.PI;
    
    @Constant
    public static final double E = Math.E;
    
    @Function("abs")
    public static Double abs(Double p) {
        return new Double(Math.abs(p.getValue()));
    }

    @Operation("+")
    public static Double add(Double p0, Double p1) {
        return new Double(p0.getValue() + p1.getValue());
    }

    @Operation("+")
    public static Double add(Double p0, Integer p1) {
        return new Double(p0.getValue() + p1.getValue());
    }

    @Operation("+")
    public static Double add(Integer p0, Double p1) {
        return new Double(p0.getValue() + p1.getValue());
    }

    @Operation("+")
    public static Integer add(Integer p0, Integer p1) {
        return new Integer(p0.getValue() + p1.getValue());
    }

    @Operation("-")
    public static Double substract(Double p0, Double p1) {
        return new Double(p0.getValue() - p1.getValue());
    }

    @Operation("-")
    public static Double substract(Double p0, Integer p1) {
        return new Double(p0.getValue() - p1.getValue());
    }

    @Operation("-")
    public static Double substract(Integer p0, Double p1) {
        return new Double(p0.getValue() - p1.getValue());
    }

    @Operation("-")
    public static Integer substract(Integer p0, Integer p1) {
        return new Integer(p0.getValue() - p1.getValue());
    }

    @Operation("*")
    public static Double multiply(Double p0, Double p1) {
        return new Double(p0.getValue() * p1.getValue());
    }

    @Operation("*")
    public static Double multiply(Double p0, Integer p1) {
        return new Double(p0.getValue() * p1.getValue());
    }

    @Operation("*")
    public static Double multiply(Integer p0, Double p1) {
        return new Double(p0.getValue() * p1.getValue());
    }

    @Operation("*")
    public static Integer multiply(Integer p0, Integer p1) {
        return new Integer(p0.getValue() * p1.getValue());
    }
}

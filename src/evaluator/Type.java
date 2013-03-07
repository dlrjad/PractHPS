/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluator;

/**
 *
 * @author jorge
 */
public class Type<T> {
    private T value;

    public Type(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
}

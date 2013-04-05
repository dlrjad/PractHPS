package evaluator.type;

import evaluator.Type;

public class Boolean extends Type<java.lang.Boolean>{
    
    public Boolean(java.lang.Boolean value) {
        super(value);
    }
    
    public Boolean(String value) {
        super(java.lang.Boolean.valueOf(value));
    }
    
}

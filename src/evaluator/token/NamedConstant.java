package evaluator.token;

import evaluator.Type;
import evaluator.type.Double;
import java.util.HashMap;

public class NamedConstant {
    
    private static HashMap<String, NamedConstant> constants;
    
    private final String name;
    private final Type value;

    private NamedConstant(String name, Type<?> value) {
        this.name = name;
        this.value = value;
    }
    
    public static NamedConstant get(String name) {
        checkConstants();
        return constants.get(name);
    }
    
    private static void checkConstants() {
        if (constants != null){ return;}
        constants = new HashMap<>();
        putConstant(new NamedConstant("PI", new Double(Math.PI)));

    }

    private static void putConstant(NamedConstant namedConstant) {
        constants.put(namedConstant.name, namedConstant);
    }
}

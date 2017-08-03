package pattern.interpreter;

import java.util.Map;

/**
 * Created by Naver on 2017. 8. 3..
 */
public class Variable implements Expression {

    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        if (variables.get(name) == null) {
            return 0;
        }

        return variables.get(name).interpret(variables);
    }
}

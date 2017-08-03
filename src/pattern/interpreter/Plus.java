package pattern.interpreter;

import java.util.Map;

/**
 * Created by Naver on 2017. 8. 3..
 */
public class Plus implements Expression {

    private final Expression leftOperand;
    private final Expression rightOperand;

    public Plus(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}

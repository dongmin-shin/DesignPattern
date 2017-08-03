package pattern.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * Created by Naver on 2017. 8. 3..
 */
public class Evaluator implements Expression {

    private static final String WHITE_SPACE = " ";
    private static final String PLUS = "+";
    private static final String MINUS = "-";

    private Expression syntaxTree;

    public Evaluator(final String expression) {

        final Stack<Expression> expressionsStack = new Stack<>();
        for (final String token : expression.split(WHITE_SPACE)) {
            if (token.equals(PLUS)) {
                final Expression subExpression = new Plus(expressionsStack.pop(), expressionsStack.pop());
                expressionsStack.push(subExpression);

            } else if (token.equals(MINUS)) {
                final Expression right = expressionsStack.pop();
                final Expression left = expressionsStack.pop();
                final Expression subExpression = new Minus(left, right);
                expressionsStack.push(subExpression);

            } else {
                expressionsStack.push(new Variable(token));

            }
        }

        syntaxTree = expressionsStack.pop();
    }

    @Override
    public int interpret(Map<String, Expression> context) {
        return syntaxTree.interpret(context);
    }
}

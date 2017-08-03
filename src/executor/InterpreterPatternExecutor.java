package executor;

import pattern.interpreter.Evaluator;
import pattern.interpreter.Expression;
import pattern.interpreter.Number;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Naver on 2017. 8. 3..
 */
public class InterpreterPatternExecutor implements PatternExecutor {

    @Override
    public void execute() {
        final String expression = "w x z - +";
        final Evaluator sentence = new Evaluator(expression);
        final Map<String, Expression> variables = new HashMap<>();
        variables.put("w", new Number(5));
        variables.put("x", new Number(10));
        variables.put("z", new Number(42));

        final int result = sentence.interpret(variables);

        System.out.println(result);
    }
}

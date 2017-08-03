package pattern.interpreter;

import java.util.Map;

/**
 * Created by Naver on 2017. 8. 3..
 */
public class Number implements Expression {

    private final int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return number;
    }
}

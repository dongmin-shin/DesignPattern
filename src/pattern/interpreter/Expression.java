package pattern.interpreter;

import java.util.Map;

/**
 * Created by Naver on 2017. 8. 3..
 */
public interface Expression {

    int interpret(final Map<String, Expression> variables);

}

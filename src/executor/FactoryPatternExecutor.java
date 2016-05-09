package executor;

import pattern.factory.Shape;
import pattern.factory.ShapeFactory;
import pattern.factory.ShapeType;

/**
 * Created by DongMinShin on 2016. 5. 9..
 */
public class FactoryPatternExecutor implements PatternExecutor {

    @Override
    public void execute() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        Shape square = shapeFactory.getShape(ShapeType.SQUARE);

        circle.draw();
        rectangle.draw();
        square.draw();
    }
}

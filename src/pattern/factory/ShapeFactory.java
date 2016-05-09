package pattern.factory;

/**
 * Created by DongMinShin on 2016. 5. 9..
 */
public class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType == ShapeType.CIRCLE) {
            return new Circle();
        } else if (shapeType == ShapeType.RECTANGLE) {
            return new Rectangle();
        } else if (shapeType == ShapeType.SQUARE) {
            return new Square();
        } else {
            return null;
        }
    }

}

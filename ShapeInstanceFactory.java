package factory;

public class ShapeInstanceFactory {
    public static Shape getShape(String shapeType, double value) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle(value);
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square(value);
        }
        return null;
    }
}


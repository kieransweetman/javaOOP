package Tests;

import shapes.Shape;

public class ShowShape {
    public static String showShape(Shape shape) {
        return "---\nType: " + shape.getType() + "\nArea: " + shape.area() + "\nPerimeter: " + shape.perimeter();
    }
}

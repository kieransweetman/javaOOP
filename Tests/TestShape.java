package Tests;

import shapes.Circle;
import shapes.Rect;
import shapes.Shape;
import shapes.Square;

public class TestShape {
    public static void main(String[] args) {

        Shape[] shapes = { new Circle(1.2),
                new Rect(2, 4),
                new Square(3) };

        for (Shape shape : shapes) {
            System.out.println(ShowShape.showShape(shape));
        }

    }
}

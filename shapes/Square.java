package shapes;

public class Square extends Shape {

    double length;

    public Square() {
        super();
    }

    public Square(double length) {
        this.length = length;
    }

    public double area() {
        return Math.pow(this.length, 2);
    };

    public void setLength(double length) {
        this.length = length;
    }

    public double perimeter() {
        return this.length * 4;
    };

    public String getType() {
        return this.getClass().getSimpleName();
    }

}

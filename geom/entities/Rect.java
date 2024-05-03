package geom.entities;

public class Rect implements GeometricObj {

    double heigth;
    double width;

    public Rect(double h, double w) {
        this.heigth = h;
        this.width = w;
    }

    public double area() {
        return this.heigth * this.width;
    }

    public double perimeter() {
        return (this.heigth * 2) + (this.width * 2);
    }

    @Override
    public String toString() {
        return "\nRectangle \n---\n Area: " + this.area() + "\n Circumfrence: " + this.perimeter() + "\n---\n";
    }

}

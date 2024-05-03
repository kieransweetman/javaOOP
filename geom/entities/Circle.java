package geom.entities;

public class Circle implements GeometricObj {

    double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public double area() {
        return Math.PI * (Math.pow(radius, 2));
    }

    /*
     * test
     * 
     * this method actually calculate the circumfrence
     */
    public double perimeter() {
        return Math.PI * (this.radius * 2);
    }

    @Override
    public String toString() {
        return "\nCircle \n---\n Area: " + this.area() + "\n Circumfrence: " + this.perimeter() + "\n---\n";
    }

}

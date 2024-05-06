package shapes;

public class Circle extends Shape {

    double radius;

    public Circle() {
        super();
    }

    public Circle(double r) {
        this.radius = r;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public double area() {
        return Math.PI * (Math.pow(this.radius, 2));
    }

    /*
     * test
     * 
     * this method actually calculate the circumfrence
     */
    public double perimeter() {
        return Math.PI * (this.radius * 2);
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    @Override
    public String toString() {
        return "\nCircle \n---\n Area: " + this.area() + "\n Circumfrence: " + this.perimeter() + "\n---\n";
    }

}

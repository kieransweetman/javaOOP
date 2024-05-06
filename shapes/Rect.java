package shapes;

public class Rect extends Shape {

    double heigth;
    double width;

    public Rect(double h, double w) {
        super();
        this.heigth = h;
        this.width = w;

    }

    public double area() {
        return this.heigth * this.width;
    }

    public double perimeter() {
        return (this.heigth * 2) + (this.width * 2);
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return super.toString() + "\nRectangle \n---\n Area: " + this.area() + "\n Circumfrence: " + this.perimeter()
                + "\n---\n";
    }

}

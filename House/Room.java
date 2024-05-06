package House;

public abstract class Room {
    int floor;
    double area;

    public Room(int floor, double area) {
        if ((floor < 0 || floor > 3)) {
            throw new Error("Invalid Floor");
        }

        if (area < 0) {
            throw new Error("Area must be a positive number");
        }

        this.floor = floor;
        this.area = area;
    }

    public int getFloor() {
        return this.floor;
    }

    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.getFloor() + "\n" + this.getArea();
    }

}

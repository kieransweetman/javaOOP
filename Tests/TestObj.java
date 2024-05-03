package Tests;

//not good but honestly a lil lazy to just have them both: if ur curious look in the entities folder
import geom.entities.*;

public class TestObj {

    public static void main(String[] args) {

        GeometricObj[] shapes = { new Circle(2.5), new Rect(4, 8) };

        for (GeometricObj shape : shapes) {
            System.out.println(shape);
        }
    }

}

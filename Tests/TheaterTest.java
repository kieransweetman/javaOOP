package Tests;

import entities.Theater;

public class TheaterTest {
    public static void main(String[] args) {
        Theater t = new Theater("Opera", 10, 0, 0);

        for (int i = 1; i < 12; i++) {
            t.signUp(1, 10);
            System.out.println(t);
        }
    }
}

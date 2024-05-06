package RolePlay;

import java.util.Random;

public class Wolf extends Monster {

    public Wolf() {
        super(
                new Random().nextInt(3, 8),
                new Random().nextInt(5, 10));

        this.points = 1;
    }

}

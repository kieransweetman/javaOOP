package RolePlay;

import java.util.Random;

public class Troll extends Monster {

    public Troll() {
        super(
                new Random().nextInt(10, 15),
                new Random().nextInt(20, 30));

        this.points = 5;
    }

}

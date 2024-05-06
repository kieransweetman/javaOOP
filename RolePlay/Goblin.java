package RolePlay;

import java.util.Random;

public class Goblin extends Monster {

    public Goblin() {
        super(
                new Random().nextInt(5, 10),
                new Random().nextInt(10, 15));

        this.points = 2;
    }

}

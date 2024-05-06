package RolePlay;

import java.util.Random;

public class Character extends Player {

    public Character() {
        super(new Random().nextInt(12, 18), new Random().nextInt(20, 50));
    }

}

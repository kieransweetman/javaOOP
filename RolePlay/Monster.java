package RolePlay;

import java.util.Random;

public abstract class Monster implements Combatant {
    int power;
    int hp;
    int points;

    public Monster(int power, int hp) {
        super();
        this.power = power;
        this.hp = hp;
    }

    public static Monster createMonster(int type) {
        switch (type) {
            case 1:
                return new Troll();
            case 2:
                return new Wolf();
            case 3:
                return new Goblin();
            default:
                return new Goblin();
        }
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPoints() {
        return points;
    }

    public int attackPower() {
        return this.getPower() + new Random().nextInt(1, 10);
    }

    public boolean hasHp() {
        return this.getHp() > 0;
    }

    @Override
    public String toString() {
        return "Type: " + this.getClass().getSimpleName() + "\n----\n" + "hp: " + this.getHp() + "\nbase power: "
                + this.getPower() + "\n----\n";
    }

}

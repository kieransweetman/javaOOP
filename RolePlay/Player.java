package RolePlay;

import java.util.Random;

public abstract class Player implements Combatant {
    int power;
    int hp;
    int score = 0;

    public Player(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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
                + this.getPower();
    }
}

package RolePlay;

public interface Combatant {
    int getPower();

    int getHp();

    void setHp(int hp);

    int attackPower();

    boolean hasHp();

    @Override
    String toString();

}

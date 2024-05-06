package RolePlay;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static Character player = null;
    public static Monster creature = null;

    public static void main(String[] args) {

        boolean isPlaying = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a role playing game based off of randomness. Choose a menu option:");

        while (isPlaying) {
            System.out.println(
                    "\n-----\n0: create character \n1: Battle a creature\n2: show your score\n3: Show hp\n4: exit\n----\n");
            switch (scanner.nextInt()) {
                /*
                 * Create a new character
                 * 
                 */
                case 0:
                    if (player != null) {
                        System.out.println("You've already created a character");
                        continue;
                    }

                    System.out.println("\n---Creating Character---\n");
                    createCharacter();
                    // show player his stats
                    System.out.println(player.toString());

                    break;
                /*
                 * Play vs a creature
                 * 
                 */
                case 1:
                    if (!Game.hasCreatedCharacter()) {
                        System.out.println("\n---please create a character first.---\n");
                        continue;
                    }

                    System.out.println("\n---choosing enemy...\n");
                    int rand = new Random().nextInt(1, 4);
                    creature = Monster.createMonster(rand);
                    // show player monster and stats
                    System.out.println(creature.toString());

                    Game.duel(player, creature);

                    if (!player.hasHp()) {
                        isPlaying = false;
                        break;
                    }

                    System.out.println("You won! The score right now is: " + player.getScore());

                    continue;

                /*
                 * Show current score
                 * 
                 */
                case 2:
                    if (!Game.hasCreatedCharacter()) {
                        System.out.println(0);
                        continue;
                    }
                    System.out.println("Current score: \n");
                    System.out.println(player.getScore());
                    continue;

                /*
                 * Get Current Hp
                 * 
                 */
                case 3:
                    if (!Game.hasCreatedCharacter()) {
                        System.out.println("you need to create a character first to show your hp");
                        continue;
                    }

                    System.out.println("Current hp: " + player.getHp());
                    continue;
                /*
                 * Quit game
                 * 
                 */
                case 4:
                    isPlaying = false;
                    continue;
            }

        }
        System.out.println("Final score: " + player.getScore());
        scanner.close();

    }

    public static void duel(Character player, Monster creature) {

        while (player.hasHp() && creature.hasHp()) {
            int playerAttack = player.attackPower();
            int monsterAttack = creature.attackPower();

            // get the loser
            Combatant result = playerAttack > monsterAttack ? creature : player;

            int diff = Math.abs(playerAttack - monsterAttack);

            result.setHp(result.getHp() - diff);

            System.out.println(result.getClass().getSimpleName());
            System.out.println(result.getHp());
        }

        Combatant winner = Game.getWinner();

        if (winner.getClass().getSimpleName() == player.getClass().getSimpleName()) {
            player.setScore(player.getScore() + creature.getPoints());
        }

        return;

    }

    public static Combatant getWinner() {

        Combatant winner = player.hasHp() ? player : creature;

        return winner;

    }

    public static void createCharacter() {
        player = new Character();
    }

    public static boolean hasCreatedCharacter() {
        return player != null;
    }

}

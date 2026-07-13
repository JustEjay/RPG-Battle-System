import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Character player;
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- WELCOME TO THE RING---");

        System.out.print("Enter your hero's name: ");
        String playerName = scanner.nextLine();

        System.out.println("\nChoose your class:");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.print("Choice (1 or 2): ");

        int classChoice = 1; //Default Warrior
        try {
            classChoice = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input, defaulting to Warrior.");
            scanner.next();
        }

        if (classChoice == 2) {
            player = new Mage(playerName);
        } else {
            // Default to Warrior
            player = new Warrior(playerName);
        }

        Character enemy = spawnRandomEnemy();

        System.out.println("\nWatch out! A " + enemy.getName() + " appears!");

        Battle battle = new Battle(player, enemy, scanner);
        battle.startBattle();

        scanner.close();
    }

        private static Character spawnRandomEnemy() {
            Random rand = new Random();
            int roll = rand.nextInt(3);

            if (roll == 0) {
                return new Goblin("Sneaky Goby");
            } else if (roll == 1) {
                return new Warrior("Hobgoblin Bruiser");
            } else {
                return new Mage("Dark Cultist");
            }
        }

}



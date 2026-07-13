import java.util.Random;
import java.util.Scanner;

public class Battle {

    private Character player;
    private Character enemy;
    private int round;
    private final Scanner scanner;
    private final Random rand = new Random();

    public Battle(Character player, Character enemy, Scanner scanner) {
        this.player = player;
        this.enemy = enemy;
        this.round = 1;
        this.scanner = scanner;
    }

    public void startBattle() {

        showStats();

        while(player.isAlive() && enemy.isAlive())
        {
            displayRound();

            performAttack(player, enemy, playerInput());

            if(!enemy.isAlive())
            {
                System.out.println("You have killed the " + enemy.getName());
                break;
            }

            performAttack(enemy,player, enemyChoice());

            if(!player.isAlive())
            {
                System.out.println("You have died :(");
                break;
            }

            round++;
            showStats();
        }
    }

    private void showStats()
    {
        System.out.println("Hero: " + player.getName() + " Health: " + player.getHealth());
        System.out.println();
        System.out.println("Enemy: " + enemy.getName() + " Health: " + enemy.getHealth());
        System.out.println();
    }

    private void displayRound() {
        System.out.println("\n--- Round " + round + " ---");
    }

    private int playerInput() {
        while (true) {
            System.out.println("Select your attack!");
            System.out.println("1: Basic Attack");
            System.out.println("2: Special Attack");
            System.out.println("3: Ultimate Attack");

            try {
                int playerChoice = scanner.nextInt();

                if (playerChoice < 1 || playerChoice > 3) {
                    System.out.println("Invalid number, try again.");
                } else {
                    return playerChoice;
                }
            } catch (java.util.InputMismatchException e)
            {
                System.out.println("That's not a number. Try again.");
                scanner.next();
            }

        }

    }
    private int enemyChoice()
    {
        return rand.nextInt(3) +1 ;
    }

    private void performAttack(Character attacker, Character target, int attackChoice)
    {
        if(attackChoice == 1)
        {
            attacker.basicAttack(target);
        } else if (attackChoice == 2)
        {
            attacker.specialAttack(target);
        }
        else {
            attacker.ultimateAttack(target);
        }
    }
}

import java.util.Random;
import java.util.Scanner;

public class Battle {

    private Character player;
    private Character enemy;
    private int round;
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    public Battle(Character player, Character enemy) {
        this.player = player;
        this.enemy = enemy;
        this.round = 1;
    }

    public void startBattle() {

        showStats();

        while(player.isAlive() && enemy.isAlive())
        {
            displayRound();

            int attack = playerInput();
            if(attack == 1)
            {
                player.basicAttack(enemy);
            } else if (attack == 2)
            {
                player.specialAttack(enemy);
            } else if (attack == 3)
            {
                player.ultimateAttack(enemy);
            }
            else {
                player.basicAttack(enemy);
            }

            if(!enemy.isAlive())
            {
                System.out.println("You have killed the " + enemy.getName());
                break;
            }

            int enemyAtk = rand.nextInt(3) +1 ;

            if(enemyAtk == 1)
            {
                enemy.basicAttack(player);
            } else if (enemyAtk == 2){
                enemy.specialAttack(player);
            }
            else {
                enemy.ultimateAttack(player);
            }

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

            int playerChoice = scanner.nextInt();

            if (playerChoice < 1 || playerChoice > 3) {
                System.out.println("Invalid number, try again.");
            } else {
                return playerChoice;
            }
        }

    }
}

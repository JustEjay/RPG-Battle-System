
public class Battle {

    private Character player;
    private Character enemy;
    private int round;

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

            player.attack(enemy);

            if(!enemy.isAlive())
            {
                System.out.println("You have killed the " + enemy.getName());
                break;
            }

            enemy.attack(player);

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
        System.out.println("Hero: " + enemy.getName() + " Health: " + enemy.getHealth());
        System.out.println();
    }

    private void displayRound() {
        System.out.println("\n--- Round " + round + " ---");
    }
}

public class Main {

    public static void main(String[] args){
        Character player = new Warrior("Eric");
        Character enemy = new Goblin("Goby");

        Battle battle = new Battle(player, enemy);

        battle.startBattle();
    }

    }



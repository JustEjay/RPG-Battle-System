public class Goblin extends Character{

    public Goblin(String name){
        super(name, 100, 100, 40, 5);
    }

    @Override
    public void attack(Character target)
    {
        System.out.println(getName() + " Swings small dagger.");
        target.takeDamage(getAtkDamage());
    }
}

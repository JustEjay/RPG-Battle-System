public class Warrior extends Character{

    public Warrior(String name)
    {
        super(name, 140, 140, 20, 10, .2, 3);
    }

    @Override
    public void attack(Character target)
    {
        System.out.println(getName() + " Swings their Axe!");
        target.takeDamage(getAtkDamage());
    }


}

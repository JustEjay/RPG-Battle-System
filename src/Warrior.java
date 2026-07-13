public class Warrior extends Character{

    public Warrior(String name)
    {
        super(name, 140, 20, 10, .2, 3);
    }

    @Override
    public void basicAttack(Character target)
    {
        System.out.println(getName() + " Swings their Axe!");
        target.takeDamage(calculateAttackDamage());
    }

    @Override
    public void specialAttack(Character target)
    {
        System.out.println(getName() + " Throws Axe");
        target.takeDamage(calculateAttackDamage() + 10 );
    }

    @Override
    public void ultimateAttack(Character target)
    {
        System.out.println(getName() + " Ground pounds");
        target.takeDamage(calculateAttackDamage() + 20 );
    }


}

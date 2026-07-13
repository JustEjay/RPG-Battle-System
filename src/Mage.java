public class Mage extends Character{

    public Mage(String name)
    {
        super(name, 100, 40, 5,.2, 3);
    }

    @Override
    public void basicAttack(Character target)
    {
        System.out.println(getName() + " Cast Fireball");
        target.takeDamage(calculateAttackDamage());
    }

    @Override
    public void specialAttack(Character target)
    {
        System.out.println(getName() + " Judgment");
        target.takeDamage(calculateAttackDamage() + 10 );
    }

    @Override
    public void ultimateAttack(Character target)
    {
        System.out.println(getName() + " Cast darkvoid");
        target.takeDamage(calculateAttackDamage() + 30 );
    }

}

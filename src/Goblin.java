public class Goblin extends Character{

    public Goblin(String name){
        super(name, 100, 40, 5,.1,2);
    }

    @Override
    public void basicAttack(Character target)
    {
        System.out.println(getName() + " Swings club");
        target.takeDamage(calculateAttackDamage());
    }

    @Override
    public void specialAttack(Character target)
    {
        System.out.println(getName() + " Bites");
        target.takeDamage(calculateAttackDamage() + 5 );
    }

    @Override
    public void ultimateAttack(Character target)
    {
        System.out.println(getName() + "Throwing dagger");
        target.takeDamage(calculateAttackDamage() + 20 );
    }
}

import java.util.Random;

public abstract class Character {

    private String name;
    private int health;
    private int maxHealth;
    private int atkDamage;
    private int defense;


    public Character(String name, int health, int maxHealth, int atkDamage, int defense)
    {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.atkDamage = atkDamage;
        this.defense = defense;
    }

    public abstract void attack(Character target);

    public void takeDamage(int damage)
    {



        int damageTaken = damage - defense;

        if(damageTaken < 0 )
        {
            damageTaken = 0;
        }

        health -= damageTaken;

        if( health < 0)
        {
            health = 0;
        }

        System.out.println(name + "Took: " + damageTaken + " Damage");
    }

    public boolean isAlive()
    {
        return health > 0;
    }

    public String getName()
    {
        return name;
    }

    public int getHealth()
    {
        return health;
    }

    public int getMaxHealth() {
        return  maxHealth;
    }

    public int getAtkDamage()
    {
        //generate random number from 1 to atkDamge;
        Random rand = new Random();

        int min = 1;
        int max = atkDamage;

        return rand.nextInt(max - min + 1 ) + min;
    }

    public int getDefense()
    {
        return defense;
    }


}


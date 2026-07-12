import java.util.Random;

public abstract class Character {

    private String name;
    private int health;
    private int maxHealth;
    private int atkDamage;
    private int defense;
    private double critChance;
    private int critMultiplier;
    private Random rand = new Random();

    public Character(String name, int health, int atkDamage, int defense, double critChance, int critMultiplier)
    {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.atkDamage = atkDamage;
        this.defense = defense;
        this.critChance  = critChance;
        this.critMultiplier = critMultiplier;
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

        System.out.println(name + " Took: " + damageTaken + " Damage");
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

    public int calculateAttackDamage()
    {
        int min = 1;
        int max = atkDamage;

        int damage = rand.nextInt(max - min + 1 ) + min;

        if(rand.nextDouble() < critChance){
            System.out.println("CRITICAL HIT!");
            damage *= critMultiplier;
        }
        return damage;
    }




}


public abstract class Character {

    private String name;
    private float health;
    private float maxHealth;
    private float atkDamage;
    private float defense;


    public Character(String name, float health, float maxHealth, float atkDamage, float defense)
    {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.atkDamage = atkDamage;
        this.defense = defense;
    }

    public abstract void attack(Character target);

    public void takeDamage(float damage)
    {
        float damageTaken = damage - defense;

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

    public float getHealth()
    {
        return health;
    }

    public float getMaxHealth() {
        return  maxHealth;
    }

    public float getAtkDamage()
    {
        return atkDamage;
    }

    public float getDefense()
    {
        return defense;
    }


}


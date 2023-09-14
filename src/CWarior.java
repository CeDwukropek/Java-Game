public abstract class CWarior implements IBase {
    private float health;
    private float damage;
    private String name;
    private CWeapon weapon;
    protected String profession;

    public CWarior(float damage, String name, String profession)
    {
        this.health = 100;
        this.damage = damage;
        this.name = name;
        this.weapon = null;
        this.profession = profession;
    }

    abstract public void makeDamage(CWarior target);
    public float getHealth() { return this.health; }
    public float getDamage() {
        return this.weapon == null ? this.damage : this.damage + this.weapon.getDamage();
    }
    public String getName()
    {
        return this.name;
    }
    // public void setWeapon(CWeapon weapon);

    public void takeDamage(float dmg) {
        if(this.getHealth() - dmg <= 0 ){
            this.health = 0;
        }
        else {
            this.health -= dmg;
        }
    }

    public CWeapon getWeapon() { return this.weapon; }
}

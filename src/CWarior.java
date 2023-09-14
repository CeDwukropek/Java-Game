public abstract class CWarior implements IBase {
    private float health;
    private float damage;
    private String name;
    protected CWeapon weapon;
    private String profession;
    public CWarior(float damage, String name, String profession, CWeapon weapon)
    {
        this.health = 100;
        this.damage = damage;
        this.name = name;
        this.weapon = weapon;
        this.profession = profession;
    }

    abstract public boolean makeDamage(CWarior target);
    abstract public void setWeapon(CWeapon weapon);
    public float getHealth() { return this.health; }
    public float getDamage() { return this.damage + this.weapon.getDamage(); }
    public String getName() { return this.name; }
    public CWeapon getWeapon() { return this.weapon; }
    public String getProfession() { return this.profession; }
    public void takeDamage(float dmg) {
        if(this.getHealth() - dmg <= 0 ){
            this.health = 0;
        }
        else {
            this.health -= dmg;
        }
    }
}

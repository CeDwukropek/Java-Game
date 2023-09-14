public abstract class CWeapon implements IBase {
    private float damage;
    protected String name;
    private boolean upgradeable;
    private boolean equiped;
    private String range;
    public CWeapon(float damage, String name, boolean upgradeable, boolean equiped, String range)
    {
        this.damage = damage;
        this.name = name;
        this.upgradeable = upgradeable;
        this.equiped = equiped;
        this.range = range;
    }
    public boolean upgradeWeapon(float amount) {
        if(!upgradeable) return false;
        this.damage += amount;
        return true;
    }
    public float getDamage() { return this.damage; }
    public String getName() { return this.name; }
    public void isEquiped(boolean x) { this.equiped = x; }

    abstract public int getDispersion();
}
